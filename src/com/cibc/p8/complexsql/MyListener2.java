package com.cibc.p8.complexsql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.cibc.p8.complexsql.PLSQLParser.*;
import com.cibc.p8.complexsql.util.Config;
import com.cibc.p8.complexsql.util.Logger;

public class MyListener2 implements PLSQLListener {

	HashMap<String, String> tablealias = new HashMap<String, String>();
	//HashMap<String, ArrayList<String>> tablepartitions = new HashMap<String, ArrayList<String>>();
	String defaulttable = "";
	SQLModel2 model;
	// record relationalexpression and mapping sharding bulcket list
	HashMap<String,String> relationalExpTable = new HashMap<String, String>();
	HashMap<String,ArrayList<String>> relationalExpRange = new HashMap<String, ArrayList<String>>();
	
	

	int sel_level = 0;
	boolean whereflag = false;
	boolean fromflag = false;
	

	public MyListener2(SQLModel2 model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// Logger.log(Logger.DEBUG,"enterEveryRule" + arg0.getText());

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// Logger.log(Logger.DEBUG,"exitEveryRule" + arg0.getText());

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		Logger.log(Logger.DEBUG, "visitErrorNode" + arg0.getText());

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		Logger.log(Logger.DEBUG, "visitTerminal" + arg0.getText());

	}

	@Override
	public void enterSwallow_to_semi(Swallow_to_semiContext ctx) {
		Logger.log(Logger.DEBUG, "enterSwallow_to_semi " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSwallow_to_semi(Swallow_to_semiContext ctx) {
		Logger.log(Logger.DEBUG, "exitSwallow_to_semi " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompilation_unit(Compilation_unitContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompilation_unit " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompilation_unit(Compilation_unitContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompilation_unit " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSql_script(Sql_scriptContext ctx) {
		Logger.log(Logger.DEBUG, "enterSql_script " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSql_script(Sql_scriptContext ctx) {
		Logger.log(Logger.DEBUG, "exitSql_script " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUnit_statement(Unit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterUnit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUnit_statement(Unit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitUnit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_function(Drop_functionContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_function(Drop_functionContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_function(Alter_functionContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_function(Alter_functionContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_function_body(Create_function_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_function_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_function_body(Create_function_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_function_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterParallel_enable_clause(Parallel_enable_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterParallel_enable_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitParallel_enable_clause(Parallel_enable_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitParallel_enable_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPartition_by_clause(Partition_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPartition_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPartition_by_clause(Partition_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPartition_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterResult_cache_clause(Result_cache_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterResult_cache_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitResult_cache_clause(Result_cache_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitResult_cache_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRelies_on_part(Relies_on_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterRelies_on_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRelies_on_part(Relies_on_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitRelies_on_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStreaming_clause(Streaming_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterStreaming_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStreaming_clause(Streaming_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitStreaming_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_package(Drop_packageContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_package(Drop_packageContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_package(Alter_packageContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_package(Alter_packageContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_package(Create_packageContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_package(Create_packageContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_package " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPackage_body(Package_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterPackage_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPackage_body(Package_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitPackage_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPackage_spec(Package_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterPackage_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPackage_spec(Package_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitPackage_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPackage_obj_spec(Package_obj_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterPackage_obj_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPackage_obj_spec(Package_obj_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitPackage_obj_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterProcedure_spec(Procedure_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterProcedure_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitProcedure_spec(Procedure_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitProcedure_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_spec(Function_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_spec(Function_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPackage_obj_body(Package_obj_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterPackage_obj_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPackage_obj_body(Package_obj_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitPackage_obj_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_procedure(Drop_procedureContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_procedure " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_procedure(Drop_procedureContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_procedure " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_procedure(Alter_procedureContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_procedure " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_procedure(Alter_procedureContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_procedure " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_procedure_body(Create_procedure_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_procedure_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_procedure_body(Create_procedure_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_procedure_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_trigger(Drop_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_trigger(Drop_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_trigger(Alter_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_trigger(Alter_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_trigger(Create_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_trigger(Create_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTrigger_follows_clause(Trigger_follows_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterTrigger_follows_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTrigger_follows_clause(Trigger_follows_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitTrigger_follows_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTrigger_when_clause(Trigger_when_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterTrigger_when_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTrigger_when_clause(Trigger_when_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitTrigger_when_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSimple_dml_trigger(Simple_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterSimple_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSimple_dml_trigger(Simple_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitSimple_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_each_row(For_each_rowContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_each_row " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_each_row(For_each_rowContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_each_row " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompound_dml_trigger(Compound_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompound_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompound_dml_trigger(Compound_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompound_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNon_dml_trigger(Non_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "enterNon_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNon_dml_trigger(Non_dml_triggerContext ctx) {
		Logger.log(Logger.DEBUG, "exitNon_dml_trigger " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTrigger_body(Trigger_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterTrigger_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTrigger_body(Trigger_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitTrigger_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRoutine_clause(Routine_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterRoutine_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRoutine_clause(Routine_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitRoutine_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompound_trigger_block(Compound_trigger_blockContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompound_trigger_block " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompound_trigger_block(Compound_trigger_blockContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompound_trigger_block " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTiming_point_section(Timing_point_sectionContext ctx) {
		Logger.log(Logger.DEBUG, "enterTiming_point_section " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTiming_point_section(Timing_point_sectionContext ctx) {
		Logger.log(Logger.DEBUG, "exitTiming_point_section " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNon_dml_event(Non_dml_eventContext ctx) {
		Logger.log(Logger.DEBUG, "enterNon_dml_event " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNon_dml_event(Non_dml_eventContext ctx) {
		Logger.log(Logger.DEBUG, "exitNon_dml_event " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDml_event_clause(Dml_event_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterDml_event_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDml_event_clause(Dml_event_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitDml_event_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDml_event_element(Dml_event_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterDml_event_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDml_event_element(Dml_event_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitDml_event_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDml_event_nested_clause(Dml_event_nested_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterDml_event_nested_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDml_event_nested_clause(Dml_event_nested_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitDml_event_nested_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReferencing_clause(Referencing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterReferencing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReferencing_clause(Referencing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitReferencing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReferencing_element(Referencing_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterReferencing_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReferencing_element(Referencing_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitReferencing_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_type(Drop_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_type(Drop_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_type(Alter_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_type(Alter_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompile_type_clause(Compile_type_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompile_type_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompile_type_clause(Compile_type_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompile_type_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReplace_type_clause(Replace_type_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterReplace_type_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReplace_type_clause(Replace_type_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitReplace_type_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_method_spec(Alter_method_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_method_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_method_spec(Alter_method_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_method_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_method_element(Alter_method_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_method_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_method_element(Alter_method_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_method_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_attribute_definition(Alter_attribute_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_attribute_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_attribute_definition(Alter_attribute_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_attribute_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAttribute_definition(Attribute_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "enterAttribute_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAttribute_definition(Attribute_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "exitAttribute_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_collection_clauses(Alter_collection_clausesContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_collection_clauses " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_collection_clauses(Alter_collection_clausesContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_collection_clauses " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDependent_handling_clause(Dependent_handling_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterDependent_handling_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDependent_handling_clause(Dependent_handling_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitDependent_handling_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDependent_exceptions_part(Dependent_exceptions_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterDependent_exceptions_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDependent_exceptions_part(Dependent_exceptions_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitDependent_exceptions_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_type(Create_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_type(Create_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_definition(Type_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_definition(Type_definitionContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_definition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterObject_type_def(Object_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "enterObject_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitObject_type_def(Object_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "exitObject_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterObject_as_part(Object_as_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterObject_as_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitObject_as_part(Object_as_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitObject_as_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterObject_under_part(Object_under_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterObject_under_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitObject_under_part(Object_under_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitObject_under_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNested_table_type_def(Nested_table_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "enterNested_table_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNested_table_type_def(Nested_table_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "exitNested_table_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSqlj_object_type(Sqlj_object_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterSqlj_object_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSqlj_object_type(Sqlj_object_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitSqlj_object_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_body(Type_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_body(Type_bodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_body " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_body_elements(Type_body_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_body_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_body_elements(Type_body_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_body_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMap_order_func_declaration(Map_order_func_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterMap_order_func_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMap_order_func_declaration(Map_order_func_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitMap_order_func_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubprog_decl_in_type(Subprog_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubprog_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubprog_decl_in_type(Subprog_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubprog_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterProc_decl_in_type(Proc_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterProc_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitProc_decl_in_type(Proc_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitProc_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunc_decl_in_type(Func_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunc_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunc_decl_in_type(Func_decl_in_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunc_decl_in_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConstructor_declaration(Constructor_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterConstructor_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConstructor_declaration(Constructor_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitConstructor_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModifier_clause(Modifier_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterModifier_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModifier_clause(Modifier_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitModifier_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterObject_member_spec(Object_member_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterObject_member_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitObject_member_spec(Object_member_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitObject_member_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSqlj_object_type_attr(Sqlj_object_type_attrContext ctx) {
		Logger.log(Logger.DEBUG, "enterSqlj_object_type_attr " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSqlj_object_type_attr(Sqlj_object_type_attrContext ctx) {
		Logger.log(Logger.DEBUG, "exitSqlj_object_type_attr " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterElement_spec(Element_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterElement_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitElement_spec(Element_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitElement_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterElement_spec_options(Element_spec_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "enterElement_spec_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitElement_spec_options(Element_spec_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "exitElement_spec_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubprogram_spec(Subprogram_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubprogram_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubprogram_spec(Subprogram_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubprogram_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_procedure_spec(Type_procedure_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_procedure_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_procedure_spec(Type_procedure_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_procedure_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_function_spec(Type_function_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_function_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_function_spec(Type_function_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_function_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConstructor_spec(Constructor_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterConstructor_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConstructor_spec(Constructor_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitConstructor_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMap_order_function_spec(Map_order_function_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterMap_order_function_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMap_order_function_spec(Map_order_function_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitMap_order_function_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPragma_clause(Pragma_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPragma_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPragma_clause(Pragma_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPragma_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPragma_elements(Pragma_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterPragma_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPragma_elements(Pragma_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitPragma_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_elements_parameter(Type_elements_parameterContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_elements_parameter " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_elements_parameter(Type_elements_parameterContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_elements_parameter " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDrop_sequence(Drop_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "enterDrop_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDrop_sequence(Drop_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "exitDrop_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlter_sequence(Alter_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlter_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlter_sequence(Alter_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlter_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCreate_sequence(Create_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "enterCreate_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCreate_sequence(Create_sequenceContext ctx) {
		Logger.log(Logger.DEBUG, "exitCreate_sequence " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSequence_spec(Sequence_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterSequence_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSequence_spec(Sequence_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitSequence_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSequence_start_clause(Sequence_start_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterSequence_start_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSequence_start_clause(Sequence_start_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitSequence_start_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterInvoker_rights_clause(Invoker_rights_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterInvoker_rights_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitInvoker_rights_clause(Invoker_rights_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitInvoker_rights_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompiler_parameters_clause(Compiler_parameters_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompiler_parameters_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompiler_parameters_clause(Compiler_parameters_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompiler_parameters_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCall_spec(Call_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterCall_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCall_spec(Call_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitCall_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterJava_spec(Java_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterJava_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitJava_spec(Java_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitJava_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterC_spec(C_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterC_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitC_spec(C_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitC_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterC_agent_in_clause(C_agent_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterC_agent_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitC_agent_in_clause(C_agent_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitC_agent_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterC_parameters_clause(C_parameters_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterC_parameters_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitC_parameters_clause(C_parameters_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitC_parameters_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterParameter(ParameterContext ctx) {
		Logger.log(Logger.DEBUG, "enterParameter " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitParameter(ParameterContext ctx) {
		Logger.log(Logger.DEBUG, "exitParameter " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDefault_value_part(Default_value_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterDefault_value_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDefault_value_part(Default_value_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitDefault_value_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDeclare_spec(Declare_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterDeclare_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDeclare_spec(Declare_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitDeclare_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterVariable_declaration(Variable_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterVariable_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitVariable_declaration(Variable_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitVariable_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubtype_declaration(Subtype_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubtype_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubtype_declaration(Subtype_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubtype_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCursor_declaration(Cursor_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterCursor_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCursor_declaration(Cursor_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitCursor_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterParameter_spec(Parameter_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterParameter_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitParameter_spec(Parameter_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitParameter_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterException_declaration(Exception_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterException_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitException_declaration(Exception_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitException_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPragma_declaration(Pragma_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterPragma_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPragma_declaration(Pragma_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitPragma_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRecord_declaration(Record_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterRecord_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRecord_declaration(Record_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitRecord_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRecord_type_dec(Record_type_decContext ctx) {
		Logger.log(Logger.DEBUG, "enterRecord_type_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRecord_type_dec(Record_type_decContext ctx) {
		Logger.log(Logger.DEBUG, "exitRecord_type_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterField_spec(Field_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterField_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitField_spec(Field_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitField_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRecord_var_dec(Record_var_decContext ctx) {
		Logger.log(Logger.DEBUG, "enterRecord_var_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRecord_var_dec(Record_var_decContext ctx) {
		Logger.log(Logger.DEBUG, "exitRecord_var_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_declaration(Table_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_declaration(Table_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_type_dec(Table_type_decContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_type_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_type_dec(Table_type_decContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_type_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_indexed_by_part(Table_indexed_by_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_indexed_by_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_indexed_by_part(Table_indexed_by_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_indexed_by_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterVarray_type_def(Varray_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "enterVarray_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitVarray_type_def(Varray_type_defContext ctx) {
		Logger.log(Logger.DEBUG, "exitVarray_type_def " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_var_dec(Table_var_decContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_var_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_var_dec(Table_var_decContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_var_dec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSeq_of_statements(Seq_of_statementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterSeq_of_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSeq_of_statements(Seq_of_statementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitSeq_of_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLabel_declaration(Label_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "enterLabel_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLabel_declaration(Label_declarationContext ctx) {
		Logger.log(Logger.DEBUG, "exitLabel_declaration " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStatement(StatementContext ctx) {
		Logger.log(Logger.DEBUG, "enterStatement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStatement(StatementContext ctx) {
		Logger.log(Logger.DEBUG, "exitStatement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAssignment_statement(Assignment_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterAssignment_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAssignment_statement(Assignment_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitAssignment_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterContinue_statement(Continue_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterContinue_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitContinue_statement(Continue_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitContinue_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExit_statement(Exit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterExit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExit_statement(Exit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitExit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGoto_statement(Goto_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterGoto_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGoto_statement(Goto_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitGoto_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterIf_statement(If_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterIf_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitIf_statement(If_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitIf_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterElsif_part(Elsif_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterElsif_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitElsif_part(Elsif_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitElsif_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterElse_part(Else_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterElse_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitElse_part(Else_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitElse_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLoop_statement(Loop_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterLoop_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLoop_statement(Loop_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitLoop_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCursor_loop_param(Cursor_loop_paramContext ctx) {
		Logger.log(Logger.DEBUG, "enterCursor_loop_param " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCursor_loop_param(Cursor_loop_paramContext ctx) {
		Logger.log(Logger.DEBUG, "exitCursor_loop_param " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterForall_statement(Forall_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterForall_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitForall_statement(Forall_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitForall_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBounds_clause(Bounds_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterBounds_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBounds_clause(Bounds_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitBounds_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBetween_bound(Between_boundContext ctx) {
		Logger.log(Logger.DEBUG, "enterBetween_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBetween_bound(Between_boundContext ctx) {
		Logger.log(Logger.DEBUG, "exitBetween_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLower_bound(Lower_boundContext ctx) {
		Logger.log(Logger.DEBUG, "enterLower_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLower_bound(Lower_boundContext ctx) {
		Logger.log(Logger.DEBUG, "exitLower_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUpper_bound(Upper_boundContext ctx) {
		Logger.log(Logger.DEBUG, "enterUpper_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUpper_bound(Upper_boundContext ctx) {
		Logger.log(Logger.DEBUG, "exitUpper_bound " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNull_statement(Null_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterNull_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNull_statement(Null_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitNull_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRaise_statement(Raise_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterRaise_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRaise_statement(Raise_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitRaise_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReturn_statement(Return_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterReturn_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReturn_statement(Return_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitReturn_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_call(Function_callContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_call " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_call(Function_callContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_call " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBody(BodyContext ctx) {
		Logger.log(Logger.DEBUG, "enterBody " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBody(BodyContext ctx) {
		Logger.log(Logger.DEBUG, "exitBody " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterException_handler(Exception_handlerContext ctx) {
		Logger.log(Logger.DEBUG, "enterException_handler " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitException_handler(Exception_handlerContext ctx) {
		Logger.log(Logger.DEBUG, "exitException_handler " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTrigger_block(Trigger_blockContext ctx) {
		Logger.log(Logger.DEBUG, "enterTrigger_block " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTrigger_block(Trigger_blockContext ctx) {
		Logger.log(Logger.DEBUG, "exitTrigger_block " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBlock(BlockContext ctx) {
		Logger.log(Logger.DEBUG, "enterBlock " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBlock(BlockContext ctx) {
		Logger.log(Logger.DEBUG, "exitBlock " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSql_statement(Sql_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSql_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSql_statement(Sql_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSql_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExecute_immediate(Execute_immediateContext ctx) {
		Logger.log(Logger.DEBUG, "enterExecute_immediate " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExecute_immediate(Execute_immediateContext ctx) {
		Logger.log(Logger.DEBUG, "exitExecute_immediate " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDynamic_returning_clause(Dynamic_returning_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterDynamic_returning_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDynamic_returning_clause(Dynamic_returning_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitDynamic_returning_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterData_manipulation_language_statements(Data_manipulation_language_statementsContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterData_manipulation_language_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitData_manipulation_language_statements(Data_manipulation_language_statementsContext ctx) {
		Logger.log(Logger.DEBUG,
				"exitData_manipulation_language_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCursor_manipulation_statements(Cursor_manipulation_statementsContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterCursor_manipulation_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCursor_manipulation_statements(Cursor_manipulation_statementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitCursor_manipulation_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterClose_statement(Close_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterClose_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitClose_statement(Close_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitClose_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOpen_statement(Open_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterOpen_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOpen_statement(Open_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitOpen_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFetch_statement(Fetch_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterFetch_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFetch_statement(Fetch_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitFetch_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOpen_for_statement(Open_for_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterOpen_for_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOpen_for_statement(Open_for_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitOpen_for_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTransaction_control_statements(Transaction_control_statementsContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterTransaction_control_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTransaction_control_statements(Transaction_control_statementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitTransaction_control_statements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSet_transaction_command(Set_transaction_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterSet_transaction_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSet_transaction_command(Set_transaction_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitSet_transaction_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSet_constraint_command(Set_constraint_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterSet_constraint_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSet_constraint_command(Set_constraint_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitSet_constraint_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCommit_statement(Commit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterCommit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCommit_statement(Commit_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitCommit_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWrite_clause(Write_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterWrite_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWrite_clause(Write_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitWrite_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRollback_statement(Rollback_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterRollback_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRollback_statement(Rollback_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitRollback_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSavepoint_statement(Savepoint_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSavepoint_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSavepoint_statement(Savepoint_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSavepoint_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExplain_statement(Explain_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterExplain_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExplain_statement(Explain_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitExplain_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSelect_statement(Select_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSelect_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSelect_statement(Select_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSelect_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubquery_factoring_clause(Subquery_factoring_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubquery_factoring_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
	}
		

	@Override
	public void exitSubquery_factoring_clause(Subquery_factoring_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubquery_factoring_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
    }

	@Override
	public void enterFactoring_element(Factoring_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterFactoring_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFactoring_element(Factoring_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitFactoring_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSearch_clause(Search_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterSearch_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSearch_clause(Search_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitSearch_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCycle_clause(Cycle_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterCycle_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCycle_clause(Cycle_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitCycle_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubquery(SubqueryContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubquery " + ctx.getText() + " XXX " + ctx.getChildCount());
		sel_level++;
	}

	@Override
	public void exitSubquery(SubqueryContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubquery " + ctx.getText() + " XXX " + ctx.getChildCount());
        sel_level--;
	}

	@Override
	public void enterSubquery_operation_part(Subquery_operation_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubquery_operation_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubquery_operation_part(Subquery_operation_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubquery_operation_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubquery_basic_elements(Subquery_basic_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubquery_basic_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubquery_basic_elements(Subquery_basic_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubquery_basic_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterQuery_block(Query_blockContext ctx) {
		Logger.log(Logger.DEBUG, "enterQuery_block " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitQuery_block(Query_blockContext ctx) {
		Logger.log(Logger.DEBUG, "exitQuery_block " + ctx.getText() + " XXX " + ctx.getChildCount());
	}

	@Override
	public void enterSelected_element(Selected_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSelected_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSelected_element(Selected_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSelected_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFrom_clause(From_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterFrom_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
		fromflag = true;

	}

	@Override
	public void exitFrom_clause(From_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitFrom_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
		fromflag = false;
	}

	@Override
	public void enterSelect_list_elements(Select_list_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterSelect_list_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSelect_list_elements(Select_list_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitSelect_list_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_ref_list(Table_ref_listContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_ref_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_ref_list(Table_ref_listContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_ref_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_ref(Table_refContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_ref " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_ref(Table_refContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_ref " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_ref_aux(Table_ref_auxContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_ref_aux " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (fromflag) {
			if (ctx.getChildCount() == 2) {
				String table = ctx.getChild(0).getText();
				String alias = ctx.getChild(1).getText();
				tablealias.put(alias, table);
				Logger.log(Logger.DEBUG, "################# table:" + table + " alias: " + alias);
				defaulttable = table;
			} else {
				String table = ctx.getChild(0).getText();
				tablealias.put(table, table);
				Logger.log(Logger.DEBUG, "################# table:" + table + " alias: " + table);
				defaulttable = table;
			}
		}

	}

	@Override
	public void exitTable_ref_aux(Table_ref_auxContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_ref_aux " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterJoin_clause(Join_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterJoin_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitJoin_clause(Join_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitJoin_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterJoin_on_part(Join_on_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterJoin_on_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitJoin_on_part(Join_on_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitJoin_on_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterJoin_using_part(Join_using_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterJoin_using_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitJoin_using_part(Join_using_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitJoin_using_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOuter_join_type(Outer_join_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterOuter_join_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOuter_join_type(Outer_join_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitOuter_join_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterQuery_partition_clause(Query_partition_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterQuery_partition_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitQuery_partition_clause(Query_partition_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitQuery_partition_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFlashback_query_clause(Flashback_query_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterFlashback_query_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFlashback_query_clause(Flashback_query_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitFlashback_query_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_clause(Pivot_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_clause(Pivot_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_element(Pivot_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_element(Pivot_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_for_clause(Pivot_for_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_for_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_for_clause(Pivot_for_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_for_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_in_clause(Pivot_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_in_clause(Pivot_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_in_clause_element(Pivot_in_clause_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_in_clause_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_in_clause_element(Pivot_in_clause_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_in_clause_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPivot_in_clause_elements(Pivot_in_clause_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterPivot_in_clause_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPivot_in_clause_elements(Pivot_in_clause_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitPivot_in_clause_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUnpivot_clause(Unpivot_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterUnpivot_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUnpivot_clause(Unpivot_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitUnpivot_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUnpivot_in_clause(Unpivot_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterUnpivot_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUnpivot_in_clause(Unpivot_in_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitUnpivot_in_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUnpivot_in_elements(Unpivot_in_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterUnpivot_in_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUnpivot_in_elements(Unpivot_in_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitUnpivot_in_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterHierarchical_query_clause(Hierarchical_query_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterHierarchical_query_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitHierarchical_query_clause(Hierarchical_query_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitHierarchical_query_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStart_part(Start_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterStart_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStart_part(Start_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitStart_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGroup_by_clause(Group_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterGroup_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGroup_by_clause(Group_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitGroup_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGroup_by_elements(Group_by_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterGroup_by_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGroup_by_elements(Group_by_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitGroup_by_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRollup_cube_clause(Rollup_cube_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterRollup_cube_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRollup_cube_clause(Rollup_cube_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitRollup_cube_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGrouping_sets_clause(Grouping_sets_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterGrouping_sets_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGrouping_sets_clause(Grouping_sets_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitGrouping_sets_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGrouping_sets_elements(Grouping_sets_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterGrouping_sets_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGrouping_sets_elements(Grouping_sets_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitGrouping_sets_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterHaving_clause(Having_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterHaving_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitHaving_clause(Having_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitHaving_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_clause(Model_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_clause(Model_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCell_reference_options(Cell_reference_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "enterCell_reference_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCell_reference_options(Cell_reference_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "exitCell_reference_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReturn_rows_clause(Return_rows_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterReturn_rows_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReturn_rows_clause(Return_rows_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitReturn_rows_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReference_model(Reference_modelContext ctx) {
		Logger.log(Logger.DEBUG, "enterReference_model " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReference_model(Reference_modelContext ctx) {
		Logger.log(Logger.DEBUG, "exitReference_model " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMain_model(Main_modelContext ctx) {
		Logger.log(Logger.DEBUG, "enterMain_model " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMain_model(Main_modelContext ctx) {
		Logger.log(Logger.DEBUG, "exitMain_model " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_column_clauses(Model_column_clausesContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_column_clauses " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_column_clauses(Model_column_clausesContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_column_clauses " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_column_partition_part(Model_column_partition_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_column_partition_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_column_partition_part(Model_column_partition_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_column_partition_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_column_list(Model_column_listContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_column_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_column_list(Model_column_listContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_column_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_column(Model_columnContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_column " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_column(Model_columnContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_column " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_rules_clause(Model_rules_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_rules_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_rules_clause(Model_rules_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_rules_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_rules_part(Model_rules_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_rules_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_rules_part(Model_rules_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_rules_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_rules_element(Model_rules_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_rules_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_rules_element(Model_rules_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_rules_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCell_assignment(Cell_assignmentContext ctx) {
		Logger.log(Logger.DEBUG, "enterCell_assignment " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCell_assignment(Cell_assignmentContext ctx) {
		Logger.log(Logger.DEBUG, "exitCell_assignment " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_iterate_clause(Model_iterate_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_iterate_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_iterate_clause(Model_iterate_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_iterate_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUntil_part(Until_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterUntil_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUntil_part(Until_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitUntil_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOrder_by_clause(Order_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterOrder_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOrder_by_clause(Order_by_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitOrder_by_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOrder_by_elements(Order_by_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterOrder_by_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOrder_by_elements(Order_by_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitOrder_by_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_update_clause(For_update_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_update_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_update_clause(For_update_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_update_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_update_of_part(For_update_of_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_update_of_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_update_of_part(For_update_of_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_update_of_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_update_options(For_update_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_update_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_update_options(For_update_optionsContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_update_options " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUpdate_statement(Update_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterUpdate_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUpdate_statement(Update_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitUpdate_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUpdate_set_clause(Update_set_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterUpdate_set_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUpdate_set_clause(Update_set_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitUpdate_set_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterColumn_based_update_set_clause(Column_based_update_set_clauseContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterColumn_based_update_set_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitColumn_based_update_set_clause(Column_based_update_set_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitColumn_based_update_set_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDelete_statement(Delete_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterDelete_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDelete_statement(Delete_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitDelete_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterInsert_statement(Insert_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterInsert_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitInsert_statement(Insert_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitInsert_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSingle_table_insert(Single_table_insertContext ctx) {
		Logger.log(Logger.DEBUG, "enterSingle_table_insert " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSingle_table_insert(Single_table_insertContext ctx) {
		Logger.log(Logger.DEBUG, "exitSingle_table_insert " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMulti_table_insert(Multi_table_insertContext ctx) {
		Logger.log(Logger.DEBUG, "enterMulti_table_insert " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMulti_table_insert(Multi_table_insertContext ctx) {
		Logger.log(Logger.DEBUG, "exitMulti_table_insert " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMulti_table_element(Multi_table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterMulti_table_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMulti_table_element(Multi_table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitMulti_table_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConditional_insert_clause(Conditional_insert_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterConditional_insert_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConditional_insert_clause(Conditional_insert_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitConditional_insert_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConditional_insert_when_part(Conditional_insert_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterConditional_insert_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConditional_insert_when_part(Conditional_insert_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitConditional_insert_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConditional_insert_else_part(Conditional_insert_else_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterConditional_insert_else_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConditional_insert_else_part(Conditional_insert_else_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitConditional_insert_else_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterInsert_into_clause(Insert_into_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterInsert_into_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitInsert_into_clause(Insert_into_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitInsert_into_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterValues_clause(Values_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterValues_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitValues_clause(Values_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitValues_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMerge_statement(Merge_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterMerge_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMerge_statement(Merge_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitMerge_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMerge_update_clause(Merge_update_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterMerge_update_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMerge_update_clause(Merge_update_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitMerge_update_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMerge_element(Merge_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterMerge_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMerge_element(Merge_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitMerge_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMerge_update_delete_part(Merge_update_delete_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterMerge_update_delete_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMerge_update_delete_part(Merge_update_delete_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitMerge_update_delete_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMerge_insert_clause(Merge_insert_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterMerge_insert_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMerge_insert_clause(Merge_insert_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitMerge_insert_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSelected_tableview(Selected_tableviewContext ctx) {
		Logger.log(Logger.DEBUG, "enterSelected_tableview " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSelected_tableview(Selected_tableviewContext ctx) {
		Logger.log(Logger.DEBUG, "exitSelected_tableview " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLock_table_statement(Lock_table_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterLock_table_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLock_table_statement(Lock_table_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitLock_table_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWait_nowait_part(Wait_nowait_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterWait_nowait_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWait_nowait_part(Wait_nowait_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitWait_nowait_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLock_table_element(Lock_table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterLock_table_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLock_table_element(Lock_table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitLock_table_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLock_mode(Lock_modeContext ctx) {
		Logger.log(Logger.DEBUG, "enterLock_mode " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLock_mode(Lock_modeContext ctx) {
		Logger.log(Logger.DEBUG, "exitLock_mode " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGeneral_table_ref(General_table_refContext ctx) {
		Logger.log(Logger.DEBUG, "enterGeneral_table_ref " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGeneral_table_ref(General_table_refContext ctx) {
		Logger.log(Logger.DEBUG, "exitGeneral_table_ref " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStatic_returning_clause(Static_returning_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterStatic_returning_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStatic_returning_clause(Static_returning_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitStatic_returning_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterError_logging_clause(Error_logging_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterError_logging_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitError_logging_clause(Error_logging_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitError_logging_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterError_logging_into_part(Error_logging_into_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterError_logging_into_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitError_logging_into_part(Error_logging_into_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitError_logging_into_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterError_logging_reject_part(Error_logging_reject_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterError_logging_reject_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitError_logging_reject_part(Error_logging_reject_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitError_logging_reject_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDml_table_expression_clause(Dml_table_expression_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterDml_table_expression_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDml_table_expression_clause(Dml_table_expression_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitDml_table_expression_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_collection_expression(Table_collection_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_collection_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_collection_expression(Table_collection_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_collection_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSubquery_restriction_clause(Subquery_restriction_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterSubquery_restriction_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSubquery_restriction_clause(Subquery_restriction_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitSubquery_restriction_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSample_clause(Sample_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterSample_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSample_clause(Sample_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitSample_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSeed_part(Seed_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterSeed_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSeed_part(Seed_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitSeed_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCursor_expression(Cursor_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterCursor_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCursor_expression(Cursor_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitCursor_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExpression_list(Expression_listContext ctx) {
		Logger.log(Logger.DEBUG, "enterExpression_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExpression_list(Expression_listContext ctx) {
		Logger.log(Logger.DEBUG, "exitExpression_list " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCondition(ConditionContext ctx) {
		Logger.log(Logger.DEBUG, "enterCondition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCondition(ConditionContext ctx) {
		Logger.log(Logger.DEBUG, "exitCondition " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterExpression  " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitExpression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLogical_or_expression(Logical_or_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterLogical_or_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLogical_or_expression(Logical_or_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitLogical_or_expression " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (whereflag == true && (ctx.getChildCount() == 3 )) {
			  //TODO: merge the expression sharding list with and logic
			String lexp = Config.getInstance().removeQuotes(ctx.getChild(0).getText());
			String rexp = Config.getInstance().removeQuotes(ctx.getChild(2).getText());
			String table1 = relationalExpTable.get(lexp);
			String table2 = relationalExpTable.get(rexp);
			if (!table1.equals(table2)) {
				return;
			}
			ArrayList llist = relationalExpRange.get(lexp);
			ArrayList rlist = relationalExpRange.get(rexp);
			ArrayList result = rlist;
			Iterator it = llist.iterator();
			while (it.hasNext()) {
				String item = (String) it.next();
				if (!result.contains(item)) {
					result.add(item);
				}
			}
			model.setTablePartitions(table1, result);
			relationalExpRange.put(ctx.getText(), result);
			relationalExpTable.put(ctx.getText(),table1);
			
		}
	}

	@Override
	public void enterLogical_and_expression(Logical_and_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterLogical_and_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLogical_and_expression(Logical_and_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitLogical_and_expression " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (whereflag == true && (ctx.getChildCount() == 3 )) {
			  //TODO: merge the expression sharding list with and logic
			String lexp = Config.getInstance().removeQuotes(ctx.getChild(0).getText());
			String rexp = Config.getInstance().removeQuotes(ctx.getChild(2).getText());
			String table1 = relationalExpTable.get(lexp);
			String table2 = relationalExpTable.get(rexp);
			if (!table1.equals(table2)) {
				return;
			}
			ArrayList llist = relationalExpRange.get(lexp);
			ArrayList rlist = relationalExpRange.get(rexp);
			ArrayList result = new ArrayList();
			Iterator it = llist.iterator();
			while (it.hasNext()) {
				String item = (String) it.next();
				if (rlist.contains(item)) {
					result.add(item);
				}
			}
			model.setTablePartitions(table1, result);
			relationalExpRange.put(ctx.getText(), result);
			relationalExpTable.put(ctx.getText(),table1);
			
		}

	}

	@Override
	public void enterNegated_expression(Negated_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterNegated_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNegated_expression(Negated_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitNegated_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterEquality_expression(Equality_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterEquality_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitEquality_expression(Equality_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitEquality_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMultiset_expression(Multiset_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterMultiset_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMultiset_expression(Multiset_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitMultiset_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMultiset_type(Multiset_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterMultiset_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMultiset_type(Multiset_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitMultiset_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	// check the column is string or number or table.col format
	private String checktablecol(String exp) {
		String result = "";
		Pattern pattern = Pattern.compile("-?[0-9\\.]*");
		Matcher isNum = pattern.matcher(exp);
		if (isNum.matches()) {
			// exp is number
			return exp;
		}
		
		if (exp.contains("'") || exp.contains("\"")) {
			// exp is string
			return exp;
		}
		// exp should be a column
		if (exp.contains(".")) {
			String[] arr = exp.split("\\.");
			String table = tablealias.get(arr[0]);
			if (table == null) {
				return result;
			}
			String col = arr[1];
			result = table +"|"+ col;
		}else {
			String table = defaulttable;
			String col = exp;
			result = table +"|" + col;
		}
		
		return result;
	}
	
	
	@Override
	public void enterRelational_expression(Relational_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterRelational_expression " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (whereflag && ctx.getChildCount() == 3) {
			Logger.log(Logger.DEBUG, "####### " + ctx.getChild(0).getText() + "***" + ctx.getChild(1).getText()
					+ " **** " + ctx.getChild(2).getText());
			String left = ctx.getChild(0).getText();
			String right = ctx.getChild(2).getText();
			String lefttable = "";
			String leftcol = "";
			String righttable = "";
			String rightcol = "";
			
			String leftresult [] = checktablecol(left).split("\\|");
			String rightresult [] = checktablecol (right).split("\\|");
			if (leftresult.length==2) {
				lefttable = leftresult[0];
				leftcol = leftresult[1];
			}
			if (rightresult.length == 2) {
				righttable = rightresult[0];
				rightcol = rightresult[1];
			}
			if (leftresult.length==2 && rightresult.length == 1 && (!lefttable.equals("") && (!righttable.equals("")))) {  //format like table1.col1 = 3 
				ArrayList ranges = Config.getInstance().getTableRange(lefttable);
				ArrayList ltables = Config.getInstance().getTableByKey(leftresult[0],ctx.getChild(1).getText(), rightresult[0]);
				//ArrayList lpart = model.getTablepartitions(lefttable);
		/*		ArrayList lpart = new ArrayList();
				Iterator it = ltables.iterator();
				while (it.hasNext()) {
					String item = (String) it.next();
					if (!lpart.contains(item)) {
						lpart.add(item);
					}
					Logger.log(Logger.DEBUG, "************* Adding table:" + item);
				}*/
				relationalExpTable.put(ctx.getText(),lefttable);
				relationalExpRange.put(ctx.getText(), ltables);
				model.setTablePartitions(lefttable, ltables);
				
			}else if (leftresult.length ==1 && rightresult.length==2) {  // format like 3= table1.col1
			
				ArrayList ranges = Config.getInstance().getTableRange(righttable);
				
				ArrayList ltables = Config.getInstance().getTableByKey(rightresult[0],Config.getInstance().getOpposeOP(ctx.getChild(1).getText()), leftresult[0]);
		/*		ArrayList lpart = model.getTablepartitions(righttable);
				if (lpart == null) {
					lpart = new ArrayList();
				}
				Iterator it = ltables.iterator();
				while (it.hasNext()) {
					String item = (String) it.next();
					if (!lpart.contains(item)) {
						lpart.add(item);
					}
					Logger.log(Logger.DEBUG, "************* Adding table:" + item);
				}
			*/
				relationalExpTable.put(ctx.getText(),righttable);
				relationalExpRange.put(ctx.getText(), ltables);
				model.setTablePartitions(righttable, ltables);
			}else if (leftresult.length == 2 && rightresult.length == 2) {  //format like table1.col1 = table2.col2
               // ArrayList ranges = Config.getInstance().getTableRange(lefttable);
				
			//	String mytable = Config.getInstance().getTableByKey(leftresult[0],ctx.getChild(1).getText(), rightresult[0]);
              //  Logger.log(Logger.DEBUG, "************ " + mytable);

			}
			
				
		}

	}

	

	@Override
	public void exitRelational_expression(Relational_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitRelational_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCompound_expression(Compound_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterCompound_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCompound_expression(Compound_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitCompound_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRelational_operator(Relational_operatorContext ctx) {
		Logger.log(Logger.DEBUG, "enterRelational_operator " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRelational_operator(Relational_operatorContext ctx) {
		Logger.log(Logger.DEBUG, "exitRelational_operator " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLike_type(Like_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterLike_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLike_type(Like_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitLike_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLike_escape_part(Like_escape_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterLike_escape_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLike_escape_part(Like_escape_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitLike_escape_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterIn_elements(In_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterIn_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitIn_elements(In_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitIn_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBetween_elements(Between_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterBetween_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBetween_elements(Between_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitBetween_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConcatenation(ConcatenationContext ctx) {
		Logger.log(Logger.DEBUG, "enterConcatenation " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConcatenation(ConcatenationContext ctx) {
		Logger.log(Logger.DEBUG, "exitConcatenation " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAdditive_expression(Additive_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterAdditive_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAdditive_expression(Additive_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitAdditive_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMultiply_expression(Multiply_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterMultiply_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMultiply_expression(Multiply_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitMultiply_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDatetime_expression(Datetime_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterDatetime_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDatetime_expression(Datetime_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitDatetime_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterInterval_expression(Interval_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterInterval_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitInterval_expression(Interval_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitInterval_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_expression(Model_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_expression(Model_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterModel_expression_element(Model_expression_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterModel_expression_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitModel_expression_element(Model_expression_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitModel_expression_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSingle_column_for_loop(Single_column_for_loopContext ctx) {
		Logger.log(Logger.DEBUG, "enterSingle_column_for_loop " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSingle_column_for_loop(Single_column_for_loopContext ctx) {
		Logger.log(Logger.DEBUG, "exitSingle_column_for_loop " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_like_part(For_like_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_like_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_like_part(For_like_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_like_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFor_increment_decrement_type(For_increment_decrement_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterFor_increment_decrement_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFor_increment_decrement_type(For_increment_decrement_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitFor_increment_decrement_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMulti_column_for_loop(Multi_column_for_loopContext ctx) {
		Logger.log(Logger.DEBUG, "enterMulti_column_for_loop " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMulti_column_for_loop(Multi_column_for_loopContext ctx) {
		Logger.log(Logger.DEBUG, "exitMulti_column_for_loop " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUnary_expression(Unary_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterUnary_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUnary_expression(Unary_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitUnary_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCase_statement(Case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterCase_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCase_statement(Case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitCase_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSimple_case_statement(Simple_case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSimple_case_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSimple_case_statement(Simple_case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSimple_case_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSimple_case_when_part(Simple_case_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterSimple_case_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSimple_case_when_part(Simple_case_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitSimple_case_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSearched_case_statement(Searched_case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "enterSearched_case_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSearched_case_statement(Searched_case_statementContext ctx) {
		Logger.log(Logger.DEBUG, "exitSearched_case_statement " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSearched_case_when_part(Searched_case_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterSearched_case_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSearched_case_when_part(Searched_case_when_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitSearched_case_when_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCase_else_part(Case_else_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterCase_else_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCase_else_part(Case_else_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitCase_else_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAtom(AtomContext ctx) {
		Logger.log(Logger.DEBUG, "enterAtom " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAtom(AtomContext ctx) {
		Logger.log(Logger.DEBUG, "exitAtom " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExpression_or_vector(Expression_or_vectorContext ctx) {
		Logger.log(Logger.DEBUG, "enterExpression_or_vector " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExpression_or_vector(Expression_or_vectorContext ctx) {
		Logger.log(Logger.DEBUG, "exitExpression_or_vector " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterVector_expr(Vector_exprContext ctx) {
		Logger.log(Logger.DEBUG, "enterVector_expr " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitVector_expr(Vector_exprContext ctx) {
		Logger.log(Logger.DEBUG, "exitVector_expr " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterQuantified_expression(Quantified_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterQuantified_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitQuantified_expression(Quantified_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitQuantified_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStandard_function(Standard_functionContext ctx) {
		Logger.log(Logger.DEBUG, "enterStandard_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStandard_function(Standard_functionContext ctx) {
		Logger.log(Logger.DEBUG, "exitStandard_function " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOver_clause_keyword(Over_clause_keywordContext ctx) {
		Logger.log(Logger.DEBUG, "enterOver_clause_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOver_clause_keyword(Over_clause_keywordContext ctx) {
		Logger.log(Logger.DEBUG, "exitOver_clause_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWithin_or_over_clause_keyword(Within_or_over_clause_keywordContext ctx) {
		Logger.log(Logger.DEBUG, "enterWithin_or_over_clause_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWithin_or_over_clause_keyword(Within_or_over_clause_keywordContext ctx) {
		Logger.log(Logger.DEBUG, "exitWithin_or_over_clause_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterStandard_prediction_function_keyword(Standard_prediction_function_keywordContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterStandard_prediction_function_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitStandard_prediction_function_keyword(Standard_prediction_function_keywordContext ctx) {
		Logger.log(Logger.DEBUG,
				"exitStandard_prediction_function_keyword " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOver_clause(Over_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterOver_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOver_clause(Over_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitOver_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWindowing_clause(Windowing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterWindowing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWindowing_clause(Windowing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitWindowing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWindowing_type(Windowing_typeContext ctx) {
		Logger.log(Logger.DEBUG, "enterWindowing_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWindowing_type(Windowing_typeContext ctx) {
		Logger.log(Logger.DEBUG, "exitWindowing_type " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWindowing_elements(Windowing_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "enterWindowing_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWindowing_elements(Windowing_elementsContext ctx) {
		Logger.log(Logger.DEBUG, "exitWindowing_elements " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUsing_clause(Using_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterUsing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUsing_clause(Using_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitUsing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterUsing_element(Using_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterUsing_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitUsing_element(Using_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitUsing_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCollect_order_by_part(Collect_order_by_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterCollect_order_by_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCollect_order_by_part(Collect_order_by_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitCollect_order_by_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWithin_or_over_part(Within_or_over_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterWithin_or_over_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWithin_or_over_part(Within_or_over_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitWithin_or_over_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCost_matrix_clause(Cost_matrix_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterCost_matrix_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCost_matrix_clause(Cost_matrix_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitCost_matrix_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_passing_clause(Xml_passing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_passing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_passing_clause(Xml_passing_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_passing_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_attributes_clause(Xml_attributes_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_attributes_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_attributes_clause(Xml_attributes_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_attributes_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_namespaces_clause(Xml_namespaces_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_namespaces_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_namespaces_clause(Xml_namespaces_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_namespaces_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_table_column(Xml_table_columnContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_table_column " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_table_column(Xml_table_columnContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_table_column " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_general_default_part(Xml_general_default_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_general_default_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_general_default_part(Xml_general_default_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_general_default_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_multiuse_expression_element(Xml_multiuse_expression_elementContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterXml_multiuse_expression_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_multiuse_expression_element(Xml_multiuse_expression_elementContext ctx) {
		Logger.log(Logger.DEBUG,
				"exitXml_multiuse_expression_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXmlroot_param_version_part(Xmlroot_param_version_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterXmlroot_param_version_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXmlroot_param_version_part(Xmlroot_param_version_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitXmlroot_param_version_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXmlroot_param_standalone_part(Xmlroot_param_standalone_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterXmlroot_param_standalone_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXmlroot_param_standalone_part(Xmlroot_param_standalone_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitXmlroot_param_standalone_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXmlserialize_param_enconding_part(Xmlserialize_param_enconding_partContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterXmlserialize_param_enconding_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXmlserialize_param_enconding_part(Xmlserialize_param_enconding_partContext ctx) {
		Logger.log(Logger.DEBUG,
				"exitXmlserialize_param_enconding_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXmlserialize_param_version_part(Xmlserialize_param_version_partContext ctx) {
		Logger.log(Logger.DEBUG,
				"enterXmlserialize_param_version_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXmlserialize_param_version_part(Xmlserialize_param_version_partContext ctx) {
		Logger.log(Logger.DEBUG,
				"exitXmlserialize_param_version_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXmlserialize_param_ident_part(Xmlserialize_param_ident_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterXmlserialize_param_ident_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXmlserialize_param_ident_part(Xmlserialize_param_ident_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitXmlserialize_param_ident_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSql_plus_command(Sql_plus_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterSql_plus_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSql_plus_command(Sql_plus_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitSql_plus_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWhenever_command(Whenever_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterWhenever_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitWhenever_command(Whenever_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitWhenever_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSet_command(Set_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterSet_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSet_command(Set_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitSet_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterExit_command(Exit_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterExit_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitExit_command(Exit_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitExit_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPrompt_command(Prompt_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterPrompt_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPrompt_command(Prompt_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitPrompt_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterShow_errors_command(Show_errors_commandContext ctx) {
		Logger.log(Logger.DEBUG, "enterShow_errors_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitShow_errors_command(Show_errors_commandContext ctx) {
		Logger.log(Logger.DEBUG, "exitShow_errors_command " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPartition_extension_clause(Partition_extension_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterPartition_extension_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPartition_extension_clause(Partition_extension_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitPartition_extension_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterColumn_alias(Column_aliasContext ctx) {
		Logger.log(Logger.DEBUG, "enterColumn_alias " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitColumn_alias(Column_aliasContext ctx) {
		Logger.log(Logger.DEBUG, "exitColumn_alias " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_alias(Table_aliasContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_alias " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_alias(Table_aliasContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_alias " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAlias_quoted_string(Alias_quoted_stringContext ctx) {
		Logger.log(Logger.DEBUG, "enterAlias_quoted_string " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAlias_quoted_string(Alias_quoted_stringContext ctx) {
		Logger.log(Logger.DEBUG, "exitAlias_quoted_string " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterWhere_clause(Where_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterWhere_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (sel_level == 1) {
		    whereflag = true;  //only deal first level select
		}

	}

	@Override
	public void exitWhere_clause(Where_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitWhere_clause " + ctx.getText() + " XXX " + ctx.getChildCount());
		if (sel_level == 1) {
			whereflag = false;
		}
		
	}

	@Override
	public void enterCurrent_of_clause(Current_of_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterCurrent_of_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCurrent_of_clause(Current_of_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitCurrent_of_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterInto_clause(Into_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterInto_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitInto_clause(Into_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitInto_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterXml_column_name(Xml_column_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterXml_column_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitXml_column_name(Xml_column_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitXml_column_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCost_class_name(Cost_class_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterCost_class_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCost_class_name(Cost_class_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitCost_class_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAttribute_name(Attribute_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterAttribute_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAttribute_name(Attribute_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitAttribute_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSavepoint_name(Savepoint_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterSavepoint_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSavepoint_name(Savepoint_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitSavepoint_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRollback_segment_name(Rollback_segment_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterRollback_segment_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRollback_segment_name(Rollback_segment_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitRollback_segment_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_var_name(Table_var_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_var_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_var_name(Table_var_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_var_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSchema_name(Schema_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterSchema_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSchema_name(Schema_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitSchema_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRoutine_name(Routine_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterRoutine_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRoutine_name(Routine_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitRoutine_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPackage_name(Package_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterPackage_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPackage_name(Package_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitPackage_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterImplementation_type_name(Implementation_type_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterImplementation_type_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitImplementation_type_name(Implementation_type_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitImplementation_type_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterParameter_name(Parameter_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterParameter_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitParameter_name(Parameter_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitParameter_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterReference_model_name(Reference_model_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterReference_model_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitReference_model_name(Reference_model_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitReference_model_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterMain_model_name(Main_model_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterMain_model_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitMain_model_name(Main_model_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitMain_model_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterAggregate_function_name(Aggregate_function_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterAggregate_function_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitAggregate_function_name(Aggregate_function_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitAggregate_function_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterQuery_name(Query_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterQuery_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitQuery_name(Query_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitQuery_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConstraint_name(Constraint_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterConstraint_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConstraint_name(Constraint_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitConstraint_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLabel_name(Label_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterLabel_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLabel_name(Label_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitLabel_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_name(Type_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_name(Type_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterSequence_name(Sequence_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterSequence_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitSequence_name(Sequence_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitSequence_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterException_name(Exception_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterException_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitException_name(Exception_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitException_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_name(Function_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_name(Function_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterProcedure_name(Procedure_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterProcedure_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitProcedure_name(Procedure_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitProcedure_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTrigger_name(Trigger_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterTrigger_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTrigger_name(Trigger_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitTrigger_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterVariable_name(Variable_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterVariable_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitVariable_name(Variable_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitVariable_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterIndex_name(Index_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterIndex_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitIndex_name(Index_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitIndex_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCursor_name(Cursor_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterCursor_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCursor_name(Cursor_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitCursor_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRecord_name(Record_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterRecord_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRecord_name(Record_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitRecord_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterCollection_name(Collection_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterCollection_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitCollection_name(Collection_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitCollection_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLink_name(Link_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterLink_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLink_name(Link_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitLink_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterColumn_name(Column_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterColumn_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitColumn_name(Column_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterColumn_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTableview_name(Tableview_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterTableview_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTableview_name(Tableview_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitTableview_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterChar_set_name(Char_set_nameContext ctx) {
		Logger.log(Logger.DEBUG, "enterChar_set_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitChar_set_name(Char_set_nameContext ctx) {
		Logger.log(Logger.DEBUG, "exitChar_set_name " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterKeep_clause(Keep_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "enterKeep_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitKeep_clause(Keep_clauseContext ctx) {
		Logger.log(Logger.DEBUG, "exitKeep_clause " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_argument(Function_argumentContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_argument " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_argument(Function_argumentContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_argument " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_argument_analytic(Function_argument_analyticContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_argument_analytic " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_argument_analytic(Function_argument_analyticContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_argument_analytic " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterFunction_argument_modeling(Function_argument_modelingContext ctx) {
		Logger.log(Logger.DEBUG, "enterFunction_argument_modeling " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitFunction_argument_modeling(Function_argument_modelingContext ctx) {
		Logger.log(Logger.DEBUG, "exitFunction_argument_modeling " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRespect_or_ignore_nulls(Respect_or_ignore_nullsContext ctx) {
		Logger.log(Logger.DEBUG, "enterRespect_or_ignore_nulls " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRespect_or_ignore_nulls(Respect_or_ignore_nullsContext ctx) {
		Logger.log(Logger.DEBUG, "exitRespect_or_ignore_nulls " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterArgument(ArgumentContext ctx) {
		Logger.log(Logger.DEBUG, "enterArgument " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitArgument(ArgumentContext ctx) {
		Logger.log(Logger.DEBUG, "exitArgument " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterType_spec(Type_specContext ctx) {
		Logger.log(Logger.DEBUG, "enterType_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitType_spec(Type_specContext ctx) {
		Logger.log(Logger.DEBUG, "exitType_spec " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterDatatype(DatatypeContext ctx) {
		Logger.log(Logger.DEBUG, "enterDatatype " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitDatatype(DatatypeContext ctx) {
		Logger.log(Logger.DEBUG, "exitDatatype " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterPrecision_part(Precision_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterPrecision_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitPrecision_part(Precision_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitPrecision_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNative_datatype_element(Native_datatype_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterNative_datatype_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNative_datatype_element(Native_datatype_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitNative_datatype_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterBind_variable(Bind_variableContext ctx) {
		Logger.log(Logger.DEBUG, "enterBind_variable " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitBind_variable(Bind_variableContext ctx) {
		Logger.log(Logger.DEBUG, "exitBind_variable " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGeneral_element(General_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterGeneral_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGeneral_element(General_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitGeneral_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGeneral_element_part(General_element_partContext ctx) {
		Logger.log(Logger.DEBUG, "enterGeneral_element_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGeneral_element_part(General_element_partContext ctx) {
		Logger.log(Logger.DEBUG, "exitGeneral_element_part " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterTable_element(Table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "enterTable_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitTable_element(Table_elementContext ctx) {
		Logger.log(Logger.DEBUG, "exitTable_element " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConstant(ConstantContext ctx) {
		Logger.log(Logger.DEBUG, "enterConstant " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConstant(ConstantContext ctx) {
		Logger.log(Logger.DEBUG, "exitConstant " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNumeric(NumericContext ctx) {
		Logger.log(Logger.DEBUG, "enterNumeric " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNumeric(NumericContext ctx) {
		Logger.log(Logger.DEBUG, "exitNumeric " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNumeric_negative(Numeric_negativeContext ctx) {
		Logger.log(Logger.DEBUG, "enterNumeric_negative " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNumeric_negative(Numeric_negativeContext ctx) {
		Logger.log(Logger.DEBUG, "exitNumeric_negative " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterQuoted_string(Quoted_stringContext ctx) {
		Logger.log(Logger.DEBUG, "enterQuoted_string " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitQuoted_string(Quoted_stringContext ctx) {
		Logger.log(Logger.DEBUG, "exitQuoted_string " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterId(IdContext ctx) {
		Logger.log(Logger.DEBUG, "enterId " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitId(IdContext ctx) {
		Logger.log(Logger.DEBUG, "exitId " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterId_expression(Id_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "enterId_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitId_expression(Id_expressionContext ctx) {
		Logger.log(Logger.DEBUG, "exitId_expression " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterNot_equal_op(Not_equal_opContext ctx) {
		Logger.log(Logger.DEBUG, "enterNot_equal_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitNot_equal_op(Not_equal_opContext ctx) {
		Logger.log(Logger.DEBUG, "exitNot_equal_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterGreater_than_or_equals_op(Greater_than_or_equals_opContext ctx) {
		Logger.log(Logger.DEBUG, "enterGreater_than_or_equals_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitGreater_than_or_equals_op(Greater_than_or_equals_opContext ctx) {
		Logger.log(Logger.DEBUG, "exitGreater_than_or_equals_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterLess_than_or_equals_op(Less_than_or_equals_opContext ctx) {
		Logger.log(Logger.DEBUG, "enterLess_than_or_equals_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitLess_than_or_equals_op(Less_than_or_equals_opContext ctx) {
		Logger.log(Logger.DEBUG, "exitLess_than_or_equals_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterConcatenation_op(Concatenation_opContext ctx) {
		Logger.log(Logger.DEBUG, "enterConcatenation_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitConcatenation_op(Concatenation_opContext ctx) {
		Logger.log(Logger.DEBUG, "exitConcatenation_op " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterOuter_join_sign(Outer_join_signContext ctx) {
		Logger.log(Logger.DEBUG, "enterOuter_join_sign " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitOuter_join_sign(Outer_join_signContext ctx) {
		Logger.log(Logger.DEBUG, "exitOuter_join_sign " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void enterRegular_id(Regular_idContext ctx) {
		Logger.log(Logger.DEBUG, "enterRegular_id " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

	@Override
	public void exitRegular_id(Regular_idContext ctx) {
		Logger.log(Logger.DEBUG, "exitRegular_id " + ctx.getText() + " XXX " + ctx.getChildCount());

	}

}
