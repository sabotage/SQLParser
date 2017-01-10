package com.cibc.p8.complexsql;
// Generated from plsql.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLParser}.
 */
public interface PLSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(PLSQLParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(PLSQLParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(PLSQLParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(PLSQLParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(PLSQLParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(PLSQLParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(PLSQLParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(PLSQLParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(PLSQLParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(PLSQLParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(PLSQLParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(PLSQLParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(PLSQLParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(PLSQLParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(PLSQLParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(PLSQLParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(PLSQLParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(PLSQLParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(PLSQLParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(PLSQLParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(PLSQLParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(PLSQLParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(PLSQLParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(PLSQLParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(PLSQLParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(PLSQLParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(PLSQLParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(PLSQLParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PLSQLParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PLSQLParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(PLSQLParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(PLSQLParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(PLSQLParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(PLSQLParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(PLSQLParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(PLSQLParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(PLSQLParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(PLSQLParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(PLSQLParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(PLSQLParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(PLSQLParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(PLSQLParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(PLSQLParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(PLSQLParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(PLSQLParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(PLSQLParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(PLSQLParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(PLSQLParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(PLSQLParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(PLSQLParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(PLSQLParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(PLSQLParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(PLSQLParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(PLSQLParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(PLSQLParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(PLSQLParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(PLSQLParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(PLSQLParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(PLSQLParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(PLSQLParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(PLSQLParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(PLSQLParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(PLSQLParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(PLSQLParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(PLSQLParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(PLSQLParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(PLSQLParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(PLSQLParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(PLSQLParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(PLSQLParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(PLSQLParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(PLSQLParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(PLSQLParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(PLSQLParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(PLSQLParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(PLSQLParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(PLSQLParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(PLSQLParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(PLSQLParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(PLSQLParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(PLSQLParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(PLSQLParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(PLSQLParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(PLSQLParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(PLSQLParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(PLSQLParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(PLSQLParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(PLSQLParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(PLSQLParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(PLSQLParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(PLSQLParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(PLSQLParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(PLSQLParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(PLSQLParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(PLSQLParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(PLSQLParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(PLSQLParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(PLSQLParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(PLSQLParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(PLSQLParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(PLSQLParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(PLSQLParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(PLSQLParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(PLSQLParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(PLSQLParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(PLSQLParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(PLSQLParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(PLSQLParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(PLSQLParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(PLSQLParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(PLSQLParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(PLSQLParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(PLSQLParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(PLSQLParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(PLSQLParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(PLSQLParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(PLSQLParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(PLSQLParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(PLSQLParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(PLSQLParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(PLSQLParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(PLSQLParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(PLSQLParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(PLSQLParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(PLSQLParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(PLSQLParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(PLSQLParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(PLSQLParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(PLSQLParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(PLSQLParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(PLSQLParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(PLSQLParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(PLSQLParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(PLSQLParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(PLSQLParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(PLSQLParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(PLSQLParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(PLSQLParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(PLSQLParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(PLSQLParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(PLSQLParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(PLSQLParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(PLSQLParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(PLSQLParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(PLSQLParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(PLSQLParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(PLSQLParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(PLSQLParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(PLSQLParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(PLSQLParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(PLSQLParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(PLSQLParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(PLSQLParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(PLSQLParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(PLSQLParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(PLSQLParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(PLSQLParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(PLSQLParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(PLSQLParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(PLSQLParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(PLSQLParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(PLSQLParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(PLSQLParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(PLSQLParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(PLSQLParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(PLSQLParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(PLSQLParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(PLSQLParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(PLSQLParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(PLSQLParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(PLSQLParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(PLSQLParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(PLSQLParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(PLSQLParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(PLSQLParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(PLSQLParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(PLSQLParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(PLSQLParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(PLSQLParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(PLSQLParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(PLSQLParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(PLSQLParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(PLSQLParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(PLSQLParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(PLSQLParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(PLSQLParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(PLSQLParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(PLSQLParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(PLSQLParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(PLSQLParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_declaration(PLSQLParser.Record_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_declaration(PLSQLParser.Record_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_dec(PLSQLParser.Record_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_dec(PLSQLParser.Record_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(PLSQLParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(PLSQLParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterRecord_var_dec(PLSQLParser.Record_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitRecord_var_dec(PLSQLParser.Record_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTable_declaration(PLSQLParser.Table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTable_declaration(PLSQLParser.Table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_dec(PLSQLParser.Table_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_dec(PLSQLParser.Table_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(PLSQLParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(PLSQLParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(PLSQLParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(PLSQLParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_dec(PLSQLParser.Table_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_dec(PLSQLParser.Table_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(PLSQLParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(PLSQLParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(PLSQLParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(PLSQLParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(PLSQLParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(PLSQLParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(PLSQLParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(PLSQLParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PLSQLParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PLSQLParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(PLSQLParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(PLSQLParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(PLSQLParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(PLSQLParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(PLSQLParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(PLSQLParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PLSQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PLSQLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(PLSQLParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(PLSQLParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PLSQLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PLSQLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(PLSQLParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(PLSQLParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(PLSQLParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(PLSQLParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(PLSQLParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(PLSQLParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(PLSQLParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(PLSQLParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(PLSQLParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(PLSQLParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(PLSQLParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(PLSQLParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(PLSQLParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(PLSQLParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(PLSQLParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(PLSQLParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(PLSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(PLSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(PLSQLParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(PLSQLParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(PLSQLParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(PLSQLParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(PLSQLParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(PLSQLParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PLSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PLSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(PLSQLParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(PLSQLParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(PLSQLParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(PLSQLParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(PLSQLParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(PLSQLParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(PLSQLParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(PLSQLParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(PLSQLParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(PLSQLParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(PLSQLParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(PLSQLParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(PLSQLParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(PLSQLParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(PLSQLParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(PLSQLParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PLSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PLSQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(PLSQLParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(PLSQLParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(PLSQLParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(PLSQLParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(PLSQLParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(PLSQLParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(PLSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(PLSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(PLSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(PLSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(PLSQLParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(PLSQLParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(PLSQLParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(PLSQLParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(PLSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(PLSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(PLSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(PLSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(PLSQLParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(PLSQLParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(PLSQLParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(PLSQLParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(PLSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(PLSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(PLSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(PLSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(PLSQLParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(PLSQLParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(PLSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(PLSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(PLSQLParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(PLSQLParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PLSQLParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PLSQLParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(PLSQLParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(PLSQLParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(PLSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(PLSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(PLSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(PLSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(PLSQLParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(PLSQLParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PLSQLParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PLSQLParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(PLSQLParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(PLSQLParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(PLSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(PLSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(PLSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(PLSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(PLSQLParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(PLSQLParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(PLSQLParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(PLSQLParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(PLSQLParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(PLSQLParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(PLSQLParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(PLSQLParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(PLSQLParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(PLSQLParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(PLSQLParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(PLSQLParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(PLSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(PLSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(PLSQLParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(PLSQLParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(PLSQLParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(PLSQLParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(PLSQLParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(PLSQLParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(PLSQLParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(PLSQLParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(PLSQLParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(PLSQLParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PLSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PLSQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(PLSQLParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(PLSQLParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(PLSQLParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(PLSQLParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(PLSQLParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(PLSQLParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(PLSQLParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(PLSQLParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(PLSQLParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(PLSQLParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(PLSQLParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(PLSQLParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(PLSQLParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(PLSQLParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(PLSQLParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(PLSQLParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(PLSQLParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(PLSQLParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(PLSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(PLSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(PLSQLParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(PLSQLParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(PLSQLParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(PLSQLParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(PLSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(PLSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(PLSQLParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(PLSQLParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(PLSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(PLSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(PLSQLParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(PLSQLParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(PLSQLParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(PLSQLParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(PLSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(PLSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(PLSQLParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(PLSQLParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(PLSQLParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(PLSQLParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(PLSQLParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(PLSQLParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(PLSQLParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(PLSQLParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(PLSQLParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(PLSQLParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(PLSQLParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(PLSQLParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(PLSQLParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(PLSQLParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(PLSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(PLSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(PLSQLParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(PLSQLParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(PLSQLParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(PLSQLParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(PLSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(PLSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(PLSQLParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(PLSQLParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(PLSQLParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(PLSQLParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(PLSQLParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(PLSQLParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(PLSQLParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(PLSQLParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(PLSQLParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(PLSQLParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PLSQLParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PLSQLParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(PLSQLParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(PLSQLParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(PLSQLParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(PLSQLParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegated_expression(PLSQLParser.Negated_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegated_expression(PLSQLParser.Negated_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(PLSQLParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(PLSQLParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(PLSQLParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(PLSQLParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_type(PLSQLParser.Multiset_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_type(PLSQLParser.Multiset_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(PLSQLParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(PLSQLParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(PLSQLParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(PLSQLParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(PLSQLParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(PLSQLParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#like_type}.
	 * @param ctx the parse tree
	 */
	void enterLike_type(PLSQLParser.Like_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#like_type}.
	 * @param ctx the parse tree
	 */
	void exitLike_type(PLSQLParser.Like_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void enterLike_escape_part(PLSQLParser.Like_escape_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void exitLike_escape_part(PLSQLParser.Like_escape_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(PLSQLParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(PLSQLParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(PLSQLParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(PLSQLParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(PLSQLParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(PLSQLParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(PLSQLParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(PLSQLParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(PLSQLParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(PLSQLParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(PLSQLParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(PLSQLParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(PLSQLParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(PLSQLParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(PLSQLParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(PLSQLParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(PLSQLParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(PLSQLParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(PLSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(PLSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_like_part(PLSQLParser.For_like_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_like_part(PLSQLParser.For_like_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_increment_decrement_type(PLSQLParser.For_increment_decrement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_increment_decrement_type(PLSQLParser.For_increment_decrement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(PLSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(PLSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(PLSQLParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(PLSQLParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(PLSQLParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(PLSQLParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(PLSQLParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(PLSQLParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(PLSQLParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(PLSQLParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PLSQLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PLSQLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_vector(PLSQLParser.Expression_or_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_vector(PLSQLParser.Expression_or_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVector_expr(PLSQLParser.Vector_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVector_expr(PLSQLParser.Vector_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(PLSQLParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(PLSQLParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(PLSQLParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(PLSQLParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(PLSQLParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(PLSQLParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(PLSQLParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(PLSQLParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(PLSQLParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(PLSQLParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(PLSQLParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(PLSQLParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(PLSQLParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(PLSQLParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(PLSQLParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(PLSQLParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(PLSQLParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(PLSQLParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PLSQLParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PLSQLParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(PLSQLParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(PLSQLParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(PLSQLParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(PLSQLParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(PLSQLParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(PLSQLParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(PLSQLParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(PLSQLParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(PLSQLParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(PLSQLParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(PLSQLParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(PLSQLParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(PLSQLParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(PLSQLParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(PLSQLParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(PLSQLParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(PLSQLParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(PLSQLParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(PLSQLParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(PLSQLParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(PLSQLParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(PLSQLParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(PLSQLParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(PLSQLParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(PLSQLParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(PLSQLParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(PLSQLParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(PLSQLParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(PLSQLParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(PLSQLParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(PLSQLParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(PLSQLParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(PLSQLParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(PLSQLParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(PLSQLParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(PLSQLParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void enterExit_command(PLSQLParser.Exit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void exitExit_command(PLSQLParser.Exit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_command(PLSQLParser.Prompt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_command(PLSQLParser.Prompt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void enterShow_errors_command(PLSQLParser.Show_errors_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void exitShow_errors_command(PLSQLParser.Show_errors_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(PLSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(PLSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(PLSQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(PLSQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(PLSQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(PLSQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterAlias_quoted_string(PLSQLParser.Alias_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitAlias_quoted_string(PLSQLParser.Alias_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PLSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PLSQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_clause(PLSQLParser.Current_of_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_clause(PLSQLParser.Current_of_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(PLSQLParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(PLSQLParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(PLSQLParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(PLSQLParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(PLSQLParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(PLSQLParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(PLSQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(PLSQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(PLSQLParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(PLSQLParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(PLSQLParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(PLSQLParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(PLSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(PLSQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(PLSQLParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(PLSQLParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(PLSQLParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(PLSQLParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(PLSQLParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(PLSQLParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(PLSQLParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(PLSQLParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(PLSQLParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(PLSQLParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(PLSQLParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(PLSQLParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(PLSQLParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(PLSQLParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(PLSQLParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(PLSQLParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PLSQLParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PLSQLParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PLSQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PLSQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(PLSQLParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(PLSQLParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(PLSQLParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(PLSQLParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PLSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PLSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(PLSQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(PLSQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PLSQLParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PLSQLParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(PLSQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(PLSQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PLSQLParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PLSQLParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(PLSQLParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(PLSQLParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(PLSQLParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(PLSQLParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(PLSQLParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(PLSQLParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PLSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PLSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(PLSQLParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(PLSQLParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(PLSQLParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(PLSQLParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(PLSQLParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(PLSQLParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(PLSQLParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(PLSQLParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(PLSQLParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(PLSQLParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(PLSQLParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(PLSQLParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(PLSQLParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(PLSQLParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PLSQLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PLSQLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(PLSQLParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(PLSQLParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(PLSQLParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(PLSQLParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(PLSQLParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(PLSQLParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(PLSQLParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(PLSQLParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(PLSQLParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(PLSQLParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(PLSQLParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(PLSQLParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(PLSQLParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(PLSQLParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PLSQLParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PLSQLParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_negative(PLSQLParser.Numeric_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_negative(PLSQLParser.Numeric_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(PLSQLParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(PLSQLParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PLSQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PLSQLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(PLSQLParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(PLSQLParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_op(PLSQLParser.Not_equal_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_op(PLSQLParser.Not_equal_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_or_equals_op(PLSQLParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_or_equals_op(PLSQLParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_or_equals_op(PLSQLParser.Less_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_or_equals_op(PLSQLParser.Less_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_op(PLSQLParser.Concatenation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_op(PLSQLParser.Concatenation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(PLSQLParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(PLSQLParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(PLSQLParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(PLSQLParser.Regular_idContext ctx);
}