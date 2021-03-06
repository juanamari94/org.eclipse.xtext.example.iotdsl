/*
 * generated by Xtext 2.9.0.v201507170721
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.iotdsl.And;
import org.xtext.example.mydsl.iotdsl.Attribute;
import org.xtext.example.mydsl.iotdsl.BoolConstant;
import org.xtext.example.mydsl.iotdsl.Comparison;
import org.xtext.example.mydsl.iotdsl.Device;
import org.xtext.example.mydsl.iotdsl.Equality;
import org.xtext.example.mydsl.iotdsl.Event;
import org.xtext.example.mydsl.iotdsl.IfBlock;
import org.xtext.example.mydsl.iotdsl.IfStatement;
import org.xtext.example.mydsl.iotdsl.IntConstant;
import org.xtext.example.mydsl.iotdsl.Iot;
import org.xtext.example.mydsl.iotdsl.IotdslPackage;
import org.xtext.example.mydsl.iotdsl.Minus;
import org.xtext.example.mydsl.iotdsl.MulOrDiv;
import org.xtext.example.mydsl.iotdsl.Not;
import org.xtext.example.mydsl.iotdsl.Or;
import org.xtext.example.mydsl.iotdsl.Plus;
import org.xtext.example.mydsl.iotdsl.State;
import org.xtext.example.mydsl.iotdsl.StringConstant;
import org.xtext.example.mydsl.iotdsl.Transition;
import org.xtext.example.mydsl.iotdsl.Variable;
import org.xtext.example.mydsl.iotdsl.VariableRef;
import org.xtext.example.mydsl.services.IotdslGrammarAccess;

@SuppressWarnings("all")
public class IotdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IotdslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == IotdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case IotdslPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case IotdslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case IotdslPackage.BOOL_CONSTANT:
				sequence_Atomic(context, (BoolConstant) semanticObject); 
				return; 
			case IotdslPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case IotdslPackage.DEVICE:
				sequence_Device(context, (Device) semanticObject); 
				return; 
			case IotdslPackage.EQUALITY:
				sequence_Equality(context, (Equality) semanticObject); 
				return; 
			case IotdslPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case IotdslPackage.IF_BLOCK:
				sequence_IfBlock(context, (IfBlock) semanticObject); 
				return; 
			case IotdslPackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case IotdslPackage.INT_CONSTANT:
				sequence_Atomic(context, (IntConstant) semanticObject); 
				return; 
			case IotdslPackage.IOT:
				sequence_Iot(context, (Iot) semanticObject); 
				return; 
			case IotdslPackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case IotdslPackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case IotdslPackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case IotdslPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case IotdslPackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			case IotdslPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case IotdslPackage.STRING_CONSTANT:
				sequence_Atomic(context, (StringConstant) semanticObject); 
				return; 
			case IotdslPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case IotdslPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case IotdslPackage.VARIABLE_REF:
				sequence_Atomic(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, IntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.STRING_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(EObject context, VariableRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.VARIABLE_REF__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (typeName='name' tag=ID value=STRING?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         superType=[Device|ID]? 
	 *         attributes=Attribute 
	 *         states+=State* 
	 *         events+=Event* 
	 *         transitions+=Transition*
	 *     )
	 */
	protected void sequence_Device(EObject context, Device semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.EVENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Action | statements+=Action+)
	 */
	protected void sequence_IfBlock(EObject context, IfBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression thenBlock=IfBlock elseBlock=IfBlock?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     devices+=Device*
	 */
	protected void sequence_Iot(EObject context, Iot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Primary)
	 */
	protected void sequence_MulOrDiv(EObject context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=Action*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID event=[Event|ID] state=[State|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.TRANSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.TRANSITION__NAME));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.TRANSITION__EVENT));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.TRANSITION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.TRANSITION__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_2_0_1(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, IotdslPackage.Literals.VARIABLE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IotdslPackage.Literals.VARIABLE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
