# Titulo del DSL

### Objetivo
El objetivo de este trabajo pr�ctico es presentar la implementaci�n de diferentes herramientas disponibles para el desarrollo de lenguajes espec�ficos de dominio (DSL), junto con la creaci�n de un DSL propio que permita implementar funciones propias de los dispositivos que conforman el Internet de las Cosas (IoT - Internet of Things).

Los DSL se desarrollan para proveer una soluci�n a un problema espec�fico, o bien para facilitar el uso de ciertas tecnolog�as. En este caso, el DSL desarrollado se hizo con el manejo del internet de las cosas en mente, siendo naturales a �ste lenguaje la funcionalidad a trav�s de eventos y transiciones de estado com�n a los mensajes que se env�an los dispositivos pertenecientes a este aspecto de la tecnolog�a.

Las herramientas utilizadas son las siguientes:
Una de ellas es *ANTLR* que facilita la implementaci�n de un parser y analizador lexicogr�fico. ANTLR es el framework que utiliza la *XText*, el cual es otro framework que utiliza ANTLR, el cual facilita el dise�o por medio de expresiones regulares y funcionalidades propias de �ste para poder crear el DSL. Adem�s, incluye un lenguaje propio de alto nivel que ameniza la generaci�n de c�digo que ocurre al compilar el lenguaje IoT dise�ado.

### Alcance
El DSL implementa las funciones de los lenguajes de prop�sito general, sin embargo viene con una base creada con el comportamiento de los dispositivos pertenecientes a Internet of Things, siendo �stos:

- Declaraci�n de Estados, Eventos y Transiciones.

Los cuales de por s� ya est�n vinculados, pues los eventos generan transiciones entre los estados.

Adem�s, est�n disponibles las funcionalidades de:

- Declaraci�n de Variables sin tipificar.
- Estructuras de Control de flujo If.
- Expresiones aritm�ticas naturales cumplientes con las propiedades asociativas, conmutativas y la prioridad de los signos (*,/,+,-) acorde a la naturaleza de la expresi�n dada.
- Herencia.

### Caracteristicas
Se debera explicar que se trata de un lenguaje de alto nivel para interactuar con dispositivos con API Java (maximo 200 palabras).

### Gramatica
```sh
grammar org.xtext.example.mydsl.Iotdsl with org.eclipse.xtext.common.Terminals

generate iotdsl "http://www.xtext.org/example/mydsl/Iotdsl"

/*Model:
	greetings+=Greeting*;
	
Greeting:
	'Hello' name=ID '!';*/
Iot:
	devices+=Device*;

Device:
	'device' name=ID ('extends' superType=[Device])?
	attributes=Attribute
	states+=State*
	('events'
	events+=Event+
	'end')?
	transitions+=Transition*
	'end';

Attribute:
	typeName=('name') tag=ID ('=' value=STRING)?;

Event:
	'event' name=ID;

State:
	'state' name=ID
		elements += Action*
	'end';

Transition:
	'transition' name=ID
	event=[Event] '=>' state=[State]
	'end';

Action:
	Expression | Variable;
			
Variable:
 	name=ID '=' expression=Expression;
 	
Expression:
	Or | IfStatement;

Or returns Expression:
	And ({Or.left = current} "||" right = And)*;
	
And returns Expression:
	Equality ({And.left = current} "&&" right=Equality)*;
	
IfStatement:
	'if' '(' expression=Expression ')' thenBlock=IfBlock
	(=>'else' elseBlock=IfBlock)?
;

IfBlock:
	 statements += Action
	| '{' statements += Action+ '}';

Equality returns Expression:
	Comparison ({Equality.left = current} op = ("==" | "!=") right=Comparison)*;
	
Comparison returns Expression:
	PlusOrMinus ({Comparison.left = current} op = (">=" | "<=" | ">" | "<") right = PlusOrMinus)*;

PlusOrMinus returns Expression:
	MulOrDiv (({Plus.left = current} '+' | {Minus.left = current} '-') right = MulOrDiv)*;
	
MulOrDiv returns Expression:
	Primary ({MulOrDiv.left = current} op = ('*' | '/') right =Primary)*;

Primary returns Expression:
	'(' Expression ')' |
	{Not} "!" expression = Primary |
	Atomic;
		
Atomic returns Expression:
	{IntConstant} value = INT |
	{StringConstant} value = STRING |
	{BoolConstant} value = ('true' | 'false') |
	{VariableRef} variable = [Variable];
```

### Generador de codigo Java
```sh
/*
 * generated by Xtext 2.9.0.v201507170721
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.mydsl.iotdsl.Device
import org.xtext.example.mydsl.iotdsl.State
import org.xtext.example.mydsl.iotdsl.Variable
import org.xtext.example.mydsl.iotdsl.IntConstant
import org.xtext.example.mydsl.iotdsl.StringConstant
import org.xtext.example.mydsl.iotdsl.BoolConstant

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class IotdslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(d : resource.allContents.toIterable.filter(typeof(Device)))
		{
			fsa.generateFile("devices/" + d.name + ".java", d.compile)
			fsa.generateFile("devices/" + d.name + "SP/states/" + d.name + "Int.java", compileInterface(d))
			for(state : d.states)
			{
				fsa.generateFile("devices/" + d.name + "SP/states/" + state.name + ".java", compileState(state, d))
			}
		}
	}
	
	def compile(Device device)
	{
		'''
		package devices;
		import devices.�device.name�SP.states.*;	
		public class �device.name� �IF device.superType != null� extends 
			�device.superType.name� �ENDIF� 
		{
			private final static String deviceTag = "�device.attributes.tag�";
			public �device.name�Int actualState;
			private enum Event
			{
				�IF device.events.size() > 1�
					�FOR i: 1..device.events.size() - 1�
						�device.events.get(i-1).name�,
					�ENDFOR�
					�device.events.last().name�
				�ENDIF�
			}
			
			public void setState(�device.name�Int state)
			{
				this.actualState = state;
			}
			
			@SuppressWarnings("incomplete-switch")
			public void run(Event e)
			{
				switch(e){
				�FOR tra : device.transitions�
					case �tra.event.name�:
						this.setState(new �tra.state.name�());
					break;
				�ENDFOR�
				}
			}
		}
		
		'''
	}
	
	def compileState(State state, Device device)
	{
		'''
		package devices.�device.name�SP.states;
		
		public class �state.name� implements �device.name�Int
		{
			public �state.name�(){}
			public void handle()
			{
				�FOR element : state.elements�
					�IF element instanceof Variable�
						�IF element.expression instanceof IntConstant�
							int �element.name� = �(element.expression as IntConstant).value�;
						�ENDIF�
						�IF element.expression instanceof StringConstant�
							String �element.name� = "�(element.expression as StringConstant).value�";
						�ENDIF�
						�IF element.expression instanceof BoolConstant�
							boolean �element.name� = �(element.expression as BoolConstant).value�;
						�ENDIF�
					�ENDIF�
				�ENDFOR�
			}
		}
		'''
	}
	
	def compileInterface(Device device)
	{
		'''
		package devices.�device.name�SP.states;
		
		public interface �device.name�Int
		{
			public abstract void handle();
		}
		'''
	}
}

```

### Ejemplo codigo fuente IOT
```sh
device Test1
	name dname = "test1"
	state statetest1
		contador = 1
		msg = "Listo"
		disponible = true
	end
	state statetest2
		contadorDet = 1
		msg = "Deteniendo"
		disponible = true
		test = true
		test2 = true
		test8 = 3
		if(disponible != (2))
			reintentar = true
			
		if(test)
			test1 = 2
			
		if(test2)
		{
			test3 = (1+5)/(4*3)
		}else{
			test4 = 2 + 3
		}
		
		if(test2 && test3)
		{
			test5 = 2+4
		}
		
		if(test2 || test3)
		{
			test6 = 3/2*4+(5/2)
		}
		
		if((1+2) == (4-1))
		{
			test7 = test8 + 1
		}
	end
	
	events
		event event1
		event event2
	end
	
	transition t1
		event1 => statetest1
	end
end

device Test2 extends Test1
	name devicename = "test2"
	
	state statetest3
	
	end
	
	state statetest4
	
	end
	
	events
		event a
		event b
	end
end

device Test3
	name devicname = "test3"
	
	state statetest4
	
	end
	
	state statetest5
	
	end
	
	events
		event c
		event d
	end
end
```

### Autor
- Juan Amari

### Version
1.0.0

### Tecnologias
Software o literatura que da soporte al proyecto:
* [Xtext] - Framework para crear DSL
* [ANTLR] - Generador de Parsers y Lexers


[Xtext]:https://eclipse.org/Xtext/
[ANTLR]:http://www.antlr.org