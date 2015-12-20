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
