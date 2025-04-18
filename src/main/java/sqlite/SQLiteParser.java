// Generated from .\SQLiteParser.g4 by ANTLR 4.13.0
package sqlite;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, ABORT_=25, 
		ACTION_=26, ADD_=27, AFTER_=28, ALL_=29, ALTER_=30, ANALYZE_=31, AND_=32, 
		AS_=33, ASC_=34, ATTACH_=35, AUTOINCREMENT_=36, BEFORE_=37, BEGIN_=38, 
		BETWEEN_=39, BY_=40, CASCADE_=41, CASE_=42, CAST_=43, CHECK_=44, COLLATE_=45, 
		COLUMN_=46, COMMIT_=47, CONFLICT_=48, CONSTRAINT_=49, CREATE_=50, CROSS_=51, 
		CURRENT_DATE_=52, CURRENT_TIME_=53, CURRENT_TIMESTAMP_=54, DATABASE_=55, 
		DEFAULT_=56, DEFERRABLE_=57, DEFERRED_=58, DELETE_=59, DESC_=60, DETACH_=61, 
		DISTINCT_=62, DROP_=63, EACH_=64, ELSE_=65, END_=66, ESCAPE_=67, EXCEPT_=68, 
		EXCLUSIVE_=69, EXISTS_=70, EXPLAIN_=71, FAIL_=72, FOR_=73, FOREIGN_=74, 
		FROM_=75, FULL_=76, GLOB_=77, GROUP_=78, HAVING_=79, IF_=80, IGNORE_=81, 
		IMMEDIATE_=82, IN_=83, INDEX_=84, INDEXED_=85, INITIALLY_=86, INNER_=87, 
		INSERT_=88, INSTEAD_=89, INTERSECT_=90, INTO_=91, IS_=92, ISNULL_=93, 
		JOIN_=94, KEY_=95, LEFT_=96, LIKE_=97, LIMIT_=98, MATCH_=99, NATURAL_=100, 
		NO_=101, NOT_=102, NOTNULL_=103, NULL_=104, OF_=105, OFFSET_=106, ON_=107, 
		OR_=108, ORDER_=109, OUTER_=110, PLAN_=111, PRAGMA_=112, PRIMARY_=113, 
		QUERY_=114, RAISE_=115, RECURSIVE_=116, REFERENCES_=117, REGEXP_=118, 
		REINDEX_=119, RELEASE_=120, RENAME_=121, REPLACE_=122, RESTRICT_=123, 
		RETURNING_=124, RIGHT_=125, ROLLBACK_=126, ROW_=127, ROWS_=128, SAVEPOINT_=129, 
		SELECT_=130, SET_=131, TABLE_=132, TEMP_=133, TEMPORARY_=134, THEN_=135, 
		TO_=136, TRANSACTION_=137, TRIGGER_=138, UNION_=139, UNIQUE_=140, UPDATE_=141, 
		USING_=142, VACUUM_=143, VALUES_=144, VIEW_=145, VIRTUAL_=146, WHEN_=147, 
		WHERE_=148, WITH_=149, WITHOUT_=150, FIRST_VALUE_=151, OVER_=152, PARTITION_=153, 
		RANGE_=154, PRECEDING_=155, UNBOUNDED_=156, CURRENT_=157, FOLLOWING_=158, 
		CUME_DIST_=159, DENSE_RANK_=160, LAG_=161, LAST_VALUE_=162, LEAD_=163, 
		NTH_VALUE_=164, NTILE_=165, PERCENT_RANK_=166, RANK_=167, ROW_NUMBER_=168, 
		GENERATED_=169, ALWAYS_=170, STORED_=171, TRUE_=172, FALSE_=173, WINDOW_=174, 
		NULLS_=175, FIRST_=176, LAST_=177, FILTER_=178, GROUPS_=179, EXCLUDE_=180, 
		TIES_=181, OTHERS_=182, DO_=183, NOTHING_=184, IDENTIFIER=185, NUMERIC_LITERAL=186, 
		BIND_PARAMETER=187, STRING_LITERAL=188, BLOB_LITERAL=189, SINGLE_LINE_COMMENT=190, 
		MULTILINE_COMMENT=191, SPACES=192, UNEXPECTED_CHAR=193;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_analyze_stmt = 4, RULE_attach_stmt = 5, RULE_begin_stmt = 6, RULE_commit_stmt = 7, 
		RULE_rollback_stmt = 8, RULE_savepoint_stmt = 9, RULE_release_stmt = 10, 
		RULE_create_index_stmt = 11, RULE_indexed_column = 12, RULE_create_table_stmt = 13, 
		RULE_column_def = 14, RULE_type_name = 15, RULE_column_constraint = 16, 
		RULE_signed_number = 17, RULE_table_constraint = 18, RULE_foreign_key_clause = 19, 
		RULE_conflict_clause = 20, RULE_create_trigger_stmt = 21, RULE_create_view_stmt = 22, 
		RULE_create_virtual_table_stmt = 23, RULE_with_clause = 24, RULE_cte_table_name = 25, 
		RULE_recursive_cte = 26, RULE_common_table_expression = 27, RULE_delete_stmt = 28, 
		RULE_delete_stmt_limited = 29, RULE_detach_stmt = 30, RULE_drop_stmt = 31, 
		RULE_expr = 32, RULE_keyword_exists = 33, RULE_predicate_operator = 34, 
		RULE_predicate_and = 35, RULE_predicate_or = 36, RULE_negation = 37, RULE_raise_function = 38, 
		RULE_literal_value = 39, RULE_value_row = 40, RULE_values_clause = 41, 
		RULE_insert_stmt = 42, RULE_returning_clause = 43, RULE_upsert_clause = 44, 
		RULE_pragma_stmt = 45, RULE_pragma_value = 46, RULE_reindex_stmt = 47, 
		RULE_select_stmt = 48, RULE_join_clause = 49, RULE_select_core = 50, RULE_where_expr = 51, 
		RULE_group_by_expr = 52, RULE_having_expr = 53, RULE_factored_select_stmt = 54, 
		RULE_simple_select_stmt = 55, RULE_compound_select_stmt = 56, RULE_table_or_subquery = 57, 
		RULE_subquery = 58, RULE_result_column = 59, RULE_asterisk = 60, RULE_join_operator = 61, 
		RULE_non_ansi_join_operator = 62, RULE_join_constraint = 63, RULE_compound_operator = 64, 
		RULE_update_stmt = 65, RULE_column_name_list = 66, RULE_update_stmt_limited = 67, 
		RULE_qualified_table_name = 68, RULE_vacuum_stmt = 69, RULE_filter_clause = 70, 
		RULE_window_defn = 71, RULE_over_clause = 72, RULE_frame_spec = 73, RULE_frame_clause = 74, 
		RULE_simple_function_invocation = 75, RULE_aggregate_function_invocation = 76, 
		RULE_window_function_invocation = 77, RULE_common_table_stmt = 78, RULE_order_by_stmt = 79, 
		RULE_limit_stmt = 80, RULE_ordering_term = 81, RULE_asc_desc = 82, RULE_frame_left = 83, 
		RULE_frame_right = 84, RULE_frame_single = 85, RULE_window_function = 86, 
		RULE_offset = 87, RULE_default_value = 88, RULE_partition_by = 89, RULE_order_by_expr = 90, 
		RULE_order_by_expr_asc_desc = 91, RULE_expr_asc_desc = 92, RULE_initial_select = 93, 
		RULE_recursive_select = 94, RULE_unary_operator = 95, RULE_error_message = 96, 
		RULE_module_argument = 97, RULE_column_alias = 98, RULE_keyword = 99, 
		RULE_name = 100, RULE_function_name = 101, RULE_schema_name = 102, RULE_table_name = 103, 
		RULE_table_or_index_name = 104, RULE_column_name = 105, RULE_collation_name = 106, 
		RULE_foreign_table = 107, RULE_index_name = 108, RULE_trigger_name = 109, 
		RULE_view_name = 110, RULE_module_name = 111, RULE_pragma_name = 112, 
		RULE_savepoint_name = 113, RULE_table_alias = 114, RULE_transaction_name = 115, 
		RULE_window_name = 116, RULE_alias = 117, RULE_filename = 118, RULE_base_window_name = 119, 
		RULE_simple_func = 120, RULE_aggregate_func = 121, RULE_table_function_name = 122, 
		RULE_any_name = 123;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "rollback_stmt", "savepoint_stmt", 
			"release_stmt", "create_index_stmt", "indexed_column", "create_table_stmt", 
			"column_def", "type_name", "column_constraint", "signed_number", "table_constraint", 
			"foreign_key_clause", "conflict_clause", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "with_clause", "cte_table_name", "recursive_cte", 
			"common_table_expression", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_stmt", "expr", "keyword_exists", "predicate_operator", "predicate_and", 
			"predicate_or", "negation", "raise_function", "literal_value", "value_row", 
			"values_clause", "insert_stmt", "returning_clause", "upsert_clause", 
			"pragma_stmt", "pragma_value", "reindex_stmt", "select_stmt", "join_clause", 
			"select_core", "where_expr", "group_by_expr", "having_expr", "factored_select_stmt", 
			"simple_select_stmt", "compound_select_stmt", "table_or_subquery", "subquery", 
			"result_column", "asterisk", "join_operator", "non_ansi_join_operator", 
			"join_constraint", "compound_operator", "update_stmt", "column_name_list", 
			"update_stmt_limited", "qualified_table_name", "vacuum_stmt", "filter_clause", 
			"window_defn", "over_clause", "frame_spec", "frame_clause", "simple_function_invocation", 
			"aggregate_function_invocation", "window_function_invocation", "common_table_stmt", 
			"order_by_stmt", "limit_stmt", "ordering_term", "asc_desc", "frame_left", 
			"frame_right", "frame_single", "window_function", "offset", "default_value", 
			"partition_by", "order_by_expr", "order_by_expr_asc_desc", "expr_asc_desc", 
			"initial_select", "recursive_select", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "name", "function_name", 
			"schema_name", "table_name", "table_or_index_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "window_name", 
			"alias", "filename", "base_window_name", "simple_func", "aggregate_func", 
			"table_function_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'ABORT'", "'ACTION'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", "'ASC'", 
			"'ATTACH'", "'AUTOINCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", "'BY'", 
			"'CASCADE'", "'CASE'", "'CAST'", "'CHECK'", "'COLLATE'", "'COLUMN'", 
			"'COMMIT'", "'CONFLICT'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", "'CURRENT_DATE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATABASE'", "'DEFAULT'", "'DEFERRABLE'", 
			"'DEFERRED'", "'DELETE'", "'DESC'", "'DETACH'", "'DISTINCT'", "'DROP'", 
			"'EACH'", "'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUSIVE'", "'EXISTS'", 
			"'EXPLAIN'", "'FAIL'", "'FOR'", "'FOREIGN'", "'FROM'", "'FULL'", "'GLOB'", 
			"'GROUP'", "'HAVING'", "'IF'", "'IGNORE'", "'IMMEDIATE'", "'IN'", "'INDEX'", 
			"'INDEXED'", "'INITIALLY'", "'INNER'", "'INSERT'", "'INSTEAD'", "'INTERSECT'", 
			"'INTO'", "'IS'", "'ISNULL'", "'JOIN'", "'KEY'", "'LEFT'", "'LIKE'", 
			"'LIMIT'", "'MATCH'", "'NATURAL'", "'NO'", "'NOT'", "'NOTNULL'", "'NULL'", 
			"'OF'", "'OFFSET'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'PLAN'", "'PRAGMA'", 
			"'PRIMARY'", "'QUERY'", "'RAISE'", "'RECURSIVE'", "'REFERENCES'", "'REGEXP'", 
			"'REINDEX'", "'RELEASE'", "'RENAME'", "'REPLACE'", "'RESTRICT'", "'RETURNING'", 
			"'RIGHT'", "'ROLLBACK'", "'ROW'", "'ROWS'", "'SAVEPOINT'", "'SELECT'", 
			"'SET'", "'TABLE'", "'TEMP'", "'TEMPORARY'", "'THEN'", "'TO'", "'TRANSACTION'", 
			"'TRIGGER'", "'UNION'", "'UNIQUE'", "'UPDATE'", "'USING'", "'VACUUM'", 
			"'VALUES'", "'VIEW'", "'VIRTUAL'", "'WHEN'", "'WHERE'", "'WITH'", "'WITHOUT'", 
			"'FIRST_VALUE'", "'OVER'", "'PARTITION'", "'RANGE'", "'PRECEDING'", "'UNBOUNDED'", 
			"'CURRENT'", "'FOLLOWING'", "'CUME_DIST'", "'DENSE_RANK'", "'LAG'", "'LAST_VALUE'", 
			"'LEAD'", "'NTH_VALUE'", "'NTILE'", "'PERCENT_RANK'", "'RANK'", "'ROW_NUMBER'", 
			"'GENERATED'", "'ALWAYS'", "'STORED'", "'TRUE'", "'FALSE'", "'WINDOW'", 
			"'NULLS'", "'FIRST'", "'LAST'", "'FILTER'", "'GROUPS'", "'EXCLUDE'", 
			"'TIES'", "'OTHERS'", "'DO'", "'NOTHING'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT_", 
			"ACTION_", "ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", 
			"ASC_", "ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", 
			"BY_", "CASCADE_", "CASE_", "CAST_", "CHECK_", "COLLATE_", "COLUMN_", 
			"COMMIT_", "CONFLICT_", "CONSTRAINT_", "CREATE_", "CROSS_", "CURRENT_DATE_", 
			"CURRENT_TIME_", "CURRENT_TIMESTAMP_", "DATABASE_", "DEFAULT_", "DEFERRABLE_", 
			"DEFERRED_", "DELETE_", "DESC_", "DETACH_", "DISTINCT_", "DROP_", "EACH_", 
			"ELSE_", "END_", "ESCAPE_", "EXCEPT_", "EXCLUSIVE_", "EXISTS_", "EXPLAIN_", 
			"FAIL_", "FOR_", "FOREIGN_", "FROM_", "FULL_", "GLOB_", "GROUP_", "HAVING_", 
			"IF_", "IGNORE_", "IMMEDIATE_", "IN_", "INDEX_", "INDEXED_", "INITIALLY_", 
			"INNER_", "INSERT_", "INSTEAD_", "INTERSECT_", "INTO_", "IS_", "ISNULL_", 
			"JOIN_", "KEY_", "LEFT_", "LIKE_", "LIMIT_", "MATCH_", "NATURAL_", "NO_", 
			"NOT_", "NOTNULL_", "NULL_", "OF_", "OFFSET_", "ON_", "OR_", "ORDER_", 
			"OUTER_", "PLAN_", "PRAGMA_", "PRIMARY_", "QUERY_", "RAISE_", "RECURSIVE_", 
			"REFERENCES_", "REGEXP_", "REINDEX_", "RELEASE_", "RENAME_", "REPLACE_", 
			"RESTRICT_", "RETURNING_", "RIGHT_", "ROLLBACK_", "ROW_", "ROWS_", "SAVEPOINT_", 
			"SELECT_", "SET_", "TABLE_", "TEMP_", "TEMPORARY_", "THEN_", "TO_", "TRANSACTION_", 
			"TRIGGER_", "UNION_", "UNIQUE_", "UPDATE_", "USING_", "VACUUM_", "VALUES_", 
			"VIEW_", "VIRTUAL_", "WHEN_", "WHERE_", "WITH_", "WITHOUT_", "FIRST_VALUE_", 
			"OVER_", "PARTITION_", "RANGE_", "PRECEDING_", "UNBOUNDED_", "CURRENT_", 
			"FOLLOWING_", "CUME_DIST_", "DENSE_RANK_", "LAG_", "LAST_VALUE_", "LEAD_", 
			"NTH_VALUE_", "NTILE_", "PERCENT_RANK_", "RANK_", "ROW_NUMBER_", "GENERATED_", 
			"ALWAYS_", "STORED_", "TRUE_", "FALSE_", "WINDOW_", "NULLS_", "FIRST_", 
			"LAST_", "FILTER_", "GROUPS_", "EXCLUDE_", "TIES_", "OTHERS_", "DO_", 
			"NOTHING_", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLiteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6339801325483589630L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -7971300971697405919L) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 550913L) != 0)) {
				{
				{
				setState(248);
				sql_stmt_list();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(256);
				match(SCOL);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			sql_stmt();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(263);
						match(SCOL);
						}
						}
						setState(266); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(268);
					sql_stmt();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(SCOL);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN_) {
				{
				setState(280);
				match(EXPLAIN_);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY_) {
					{
					setState(281);
					match(QUERY_);
					setState(282);
					match(PLAN_);
					}
				}

				}
			}

			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(287);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(288);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(289);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(290);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(291);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(292);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(293);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(294);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(295);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(296);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(297);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(298);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(299);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(300);
				drop_stmt();
				}
				break;
			case 15:
				{
				setState(301);
				insert_stmt();
				}
				break;
			case 16:
				{
				setState(302);
				pragma_stmt();
				}
				break;
			case 17:
				{
				setState(303);
				reindex_stmt();
				}
				break;
			case 18:
				{
				setState(304);
				release_stmt();
				}
				break;
			case 19:
				{
				setState(305);
				rollback_stmt();
				}
				break;
			case 20:
				{
				setState(306);
				savepoint_stmt();
				}
				break;
			case 21:
				{
				setState(307);
				select_stmt();
				}
				break;
			case 22:
				{
				setState(308);
				update_stmt();
				}
				break;
			case 23:
				{
				setState(309);
				update_stmt_limited();
				}
				break;
			case 24:
				{
				setState(310);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Table_nameContext new_table_name;
		public Column_nameContext old_column_name;
		public Column_nameContext new_column_name;
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ALTER_);
			setState(314);
			match(TABLE_);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(315);
				schema_name();
				setState(316);
				match(DOT);
				}
				break;
			}
			setState(320);
			table_name();
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME_:
				{
				setState(321);
				match(RENAME_);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(322);
					match(TO_);
					setState(323);
					((Alter_table_stmtContext)_localctx).new_table_name = table_name();
					}
					break;
				case 2:
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(324);
						match(COLUMN_);
						}
						break;
					}
					setState(327);
					((Alter_table_stmtContext)_localctx).old_column_name = column_name();
					setState(328);
					match(TO_);
					setState(329);
					((Alter_table_stmtContext)_localctx).new_column_name = column_name();
					}
					break;
				}
				}
				break;
			case ADD_:
				{
				setState(333);
				match(ADD_);
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(334);
					match(COLUMN_);
					}
					break;
				}
				setState(337);
				column_def();
				}
				break;
			case DROP_:
				{
				setState(338);
				match(DROP_);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(339);
					match(COLUMN_);
					}
					break;
				}
				setState(342);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ANALYZE_);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(346);
				schema_name();
				}
				break;
			case 2:
				{
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(347);
					schema_name();
					setState(348);
					match(DOT);
					}
					break;
				}
				setState(352);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ATTACH_);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(356);
				match(DATABASE_);
				}
				break;
			}
			setState(359);
			expr(0);
			setState(360);
			match(AS_);
			setState(361);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(BEGIN_);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) {
				{
				setState(364);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(367);
				match(TRANSACTION_);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(368);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==COMMIT_ || _la==END_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(374);
				match(TRANSACTION_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(ROLLBACK_);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION_) {
				{
				setState(378);
				match(TRANSACTION_);
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO_) {
				{
				setState(381);
				match(TO_);
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(382);
					match(SAVEPOINT_);
					}
					break;
				}
				setState(385);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(SAVEPOINT_);
			setState(389);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(RELEASE_);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(392);
				match(SAVEPOINT_);
				}
				break;
			}
			setState(395);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(CREATE_);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE_) {
				{
				setState(398);
				match(UNIQUE_);
				}
			}

			setState(401);
			match(INDEX_);
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(402);
				match(IF_);
				setState(403);
				match(NOT_);
				setState(404);
				match(EXISTS_);
				}
				break;
			}
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(407);
				schema_name();
				setState(408);
				match(DOT);
				}
				break;
			}
			setState(412);
			index_name();
			setState(413);
			match(ON_);
			setState(414);
			table_name();
			setState(415);
			match(OPEN_PAR);
			setState(416);
			indexed_column();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(417);
				match(COMMA);
				setState(418);
				indexed_column();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(CLOSE_PAR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(425);
				match(WHERE_);
				setState(426);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(429);
				column_name();
				}
				break;
			case 2:
				{
				setState(430);
				expr(0);
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(433);
				match(COLLATE_);
				setState(434);
				collation_name();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(437);
				asc_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_stmtContext extends ParserRuleContext {
		public Token row_ROW_ID;
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(CREATE_);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(441);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(444);
			match(TABLE_);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(445);
				match(IF_);
				setState(446);
				match(NOT_);
				setState(447);
				match(EXISTS_);
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(450);
				schema_name();
				setState(451);
				match(DOT);
				}
				break;
			}
			setState(455);
			table_name();
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(456);
				match(OPEN_PAR);
				setState(457);
				column_def();
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(458);
						match(COMMA);
						setState(459);
						column_def();
						}
						} 
					}
					setState(464);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(465);
					match(COMMA);
					setState(466);
					table_constraint();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				match(CLOSE_PAR);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT_) {
					{
					setState(473);
					match(WITHOUT_);
					setState(474);
					((Create_table_stmtContext)_localctx).row_ROW_ID = match(IDENTIFIER);
					}
				}

				}
				break;
			case AS_:
				{
				setState(477);
				match(AS_);
				setState(478);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			column_name();
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(482);
				type_name();
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72673329139417088L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 274877941765L) != 0) || _la==GENERATED_) {
				{
				{
				setState(485);
				column_constraint();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(491);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(496);
				match(OPEN_PAR);
				setState(497);
				signed_number();
				setState(498);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(500);
				match(OPEN_PAR);
				setState(501);
				signed_number();
				setState(502);
				match(COMMA);
				setState(503);
				signed_number();
				setState(504);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(508);
				match(CONSTRAINT_);
				setState(509);
				name();
				}
			}

			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
				{
				{
				setState(512);
				match(PRIMARY_);
				setState(513);
				match(KEY_);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(514);
					asc_desc();
					}
				}

				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(517);
					conflict_clause();
					}
				}

				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTOINCREMENT_) {
					{
					setState(520);
					match(AUTOINCREMENT_);
					}
				}

				}
				}
				break;
			case NOT_:
			case NULL_:
			case UNIQUE_:
				{
				setState(528);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_:
				case NULL_:
					{
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(523);
						match(NOT_);
						}
					}

					setState(526);
					match(NULL_);
					}
					break;
				case UNIQUE_:
					{
					setState(527);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(530);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(533);
				match(CHECK_);
				setState(534);
				match(OPEN_PAR);
				setState(535);
				expr(0);
				setState(536);
				match(CLOSE_PAR);
				}
				break;
			case DEFAULT_:
				{
				setState(538);
				match(DEFAULT_);
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(539);
					signed_number();
					}
					break;
				case 2:
					{
					setState(540);
					literal_value();
					}
					break;
				case 3:
					{
					setState(541);
					match(OPEN_PAR);
					setState(542);
					expr(0);
					setState(543);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case COLLATE_:
				{
				setState(547);
				match(COLLATE_);
				setState(548);
				collation_name();
				}
				break;
			case REFERENCES_:
				{
				setState(549);
				foreign_key_clause();
				}
				break;
			case AS_:
			case GENERATED_:
				{
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED_) {
					{
					setState(550);
					match(GENERATED_);
					setState(551);
					match(ALWAYS_);
					}
				}

				setState(554);
				match(AS_);
				setState(555);
				match(OPEN_PAR);
				setState(556);
				expr(0);
				setState(557);
				match(CLOSE_PAR);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRTUAL_ || _la==STORED_) {
					{
					setState(558);
					_la = _input.LA(1);
					if ( !(_la==VIRTUAL_ || _la==STORED_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(566);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT_) {
				{
				setState(568);
				match(CONSTRAINT_);
				setState(569);
				name();
				}
			}

			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY_:
			case UNIQUE_:
				{
				setState(575);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY_:
					{
					setState(572);
					match(PRIMARY_);
					setState(573);
					match(KEY_);
					}
					break;
				case UNIQUE_:
					{
					setState(574);
					match(UNIQUE_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(577);
				match(OPEN_PAR);
				setState(578);
				indexed_column();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(579);
					match(COMMA);
					setState(580);
					indexed_column();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(CLOSE_PAR);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(587);
					conflict_clause();
					}
				}

				}
				break;
			case CHECK_:
				{
				setState(590);
				match(CHECK_);
				setState(591);
				match(OPEN_PAR);
				setState(592);
				expr(0);
				setState(593);
				match(CLOSE_PAR);
				}
				break;
			case FOREIGN_:
				{
				setState(595);
				match(FOREIGN_);
				setState(596);
				match(KEY_);
				setState(597);
				match(OPEN_PAR);
				setState(598);
				column_name();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(599);
					match(COMMA);
					setState(600);
					column_name();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(CLOSE_PAR);
				setState(607);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ON_() { return getTokens(SQLiteParser.ON_); }
		public TerminalNode ON_(int i) {
			return getToken(SQLiteParser.ON_, i);
		}
		public List<TerminalNode> MATCH_() { return getTokens(SQLiteParser.MATCH_); }
		public TerminalNode MATCH_(int i) {
			return getToken(SQLiteParser.MATCH_, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public List<TerminalNode> DELETE_() { return getTokens(SQLiteParser.DELETE_); }
		public TerminalNode DELETE_(int i) {
			return getToken(SQLiteParser.DELETE_, i);
		}
		public List<TerminalNode> UPDATE_() { return getTokens(SQLiteParser.UPDATE_); }
		public TerminalNode UPDATE_(int i) {
			return getToken(SQLiteParser.UPDATE_, i);
		}
		public List<TerminalNode> SET_() { return getTokens(SQLiteParser.SET_); }
		public TerminalNode SET_(int i) {
			return getToken(SQLiteParser.SET_, i);
		}
		public List<TerminalNode> CASCADE_() { return getTokens(SQLiteParser.CASCADE_); }
		public TerminalNode CASCADE_(int i) {
			return getToken(SQLiteParser.CASCADE_, i);
		}
		public List<TerminalNode> RESTRICT_() { return getTokens(SQLiteParser.RESTRICT_); }
		public TerminalNode RESTRICT_(int i) {
			return getToken(SQLiteParser.RESTRICT_, i);
		}
		public List<TerminalNode> NO_() { return getTokens(SQLiteParser.NO_); }
		public TerminalNode NO_(int i) {
			return getToken(SQLiteParser.NO_, i);
		}
		public List<TerminalNode> ACTION_() { return getTokens(SQLiteParser.ACTION_); }
		public TerminalNode ACTION_(int i) {
			return getToken(SQLiteParser.ACTION_, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> NULL_() { return getTokens(SQLiteParser.NULL_); }
		public TerminalNode NULL_(int i) {
			return getToken(SQLiteParser.NULL_, i);
		}
		public List<TerminalNode> DEFAULT_() { return getTokens(SQLiteParser.DEFAULT_); }
		public TerminalNode DEFAULT_(int i) {
			return getToken(SQLiteParser.DEFAULT_, i);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(REFERENCES_);
			setState(612);
			foreign_table();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(613);
				match(OPEN_PAR);
				setState(614);
				column_name();
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(615);
					match(COMMA);
					setState(616);
					column_name();
					}
					}
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(622);
				match(CLOSE_PAR);
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATCH_ || _la==ON_) {
				{
				setState(638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON_:
					{
					setState(626);
					match(ON_);
					setState(627);
					_la = _input.LA(1);
					if ( !(_la==DELETE_ || _la==UPDATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(634);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET_:
						{
						setState(628);
						match(SET_);
						setState(629);
						_la = _input.LA(1);
						if ( !(_la==DEFAULT_ || _la==NULL_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case CASCADE_:
						{
						setState(630);
						match(CASCADE_);
						}
						break;
					case RESTRICT_:
						{
						setState(631);
						match(RESTRICT_);
						}
						break;
					case NO_:
						{
						setState(632);
						match(NO_);
						setState(633);
						match(ACTION_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case MATCH_:
					{
					setState(636);
					match(MATCH_);
					setState(637);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_) {
					{
					setState(643);
					match(NOT_);
					}
				}

				setState(646);
				match(DEFERRABLE_);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIALLY_) {
					{
					setState(647);
					match(INITIALLY_);
					setState(648);
					_la = _input.LA(1);
					if ( !(_la==DEFERRED_ || _la==IMMEDIATE_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(ON_);
			setState(654);
			match(CONFLICT_);
			setState(655);
			_la = _input.LA(1);
			if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public List<TerminalNode> OF_() { return getTokens(SQLiteParser.OF_); }
		public TerminalNode OF_(int i) {
			return getToken(SQLiteParser.OF_, i);
		}
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(CREATE_);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(658);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(661);
			match(TRIGGER_);
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(662);
				match(IF_);
				setState(663);
				match(NOT_);
				setState(664);
				match(EXISTS_);
				}
				break;
			}
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(667);
				schema_name();
				setState(668);
				match(DOT);
				}
				break;
			}
			setState(672);
			trigger_name();
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE_:
				{
				setState(673);
				match(BEFORE_);
				}
				break;
			case AFTER_:
				{
				setState(674);
				match(AFTER_);
				}
				break;
			case INSTEAD_:
				{
				setState(675);
				match(INSTEAD_);
				setState(676);
				match(OF_);
				}
				break;
			case DELETE_:
			case INSERT_:
			case UPDATE_:
				break;
			default:
				break;
			}
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE_:
				{
				setState(679);
				match(DELETE_);
				}
				break;
			case INSERT_:
				{
				setState(680);
				match(INSERT_);
				}
				break;
			case UPDATE_:
				{
				setState(681);
				match(UPDATE_);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF_) {
					{
					setState(682);
					match(OF_);
					setState(683);
					column_name();
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(684);
						match(COMMA);
						setState(685);
						column_name();
						}
						}
						setState(690);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(695);
			match(ON_);
			setState(696);
			table_name();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR_) {
				{
				setState(697);
				match(FOR_);
				setState(698);
				match(EACH_);
				setState(699);
				match(ROW_);
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN_) {
				{
				setState(702);
				match(WHEN_);
				setState(703);
				expr(0);
				}
			}

			setState(706);
			match(BEGIN_);
			setState(715); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(707);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(708);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(709);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(710);
					select_stmt();
					}
					break;
				}
				setState(713);
				match(SCOL);
				}
				}
				setState(717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELETE_ || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 2386912217732743169L) != 0) );
			setState(719);
			match(END_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(CREATE_);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP_ || _la==TEMPORARY_) {
				{
				setState(722);
				_la = _input.LA(1);
				if ( !(_la==TEMP_ || _la==TEMPORARY_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(725);
			match(VIEW_);
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(726);
				match(IF_);
				setState(727);
				match(NOT_);
				setState(728);
				match(EXISTS_);
				}
				break;
			}
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(731);
				schema_name();
				setState(732);
				match(DOT);
				}
				break;
			}
			setState(736);
			view_name();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(737);
				match(OPEN_PAR);
				setState(738);
				column_name();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(739);
					match(COMMA);
					setState(740);
					column_name();
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				match(CLOSE_PAR);
				}
			}

			setState(750);
			match(AS_);
			setState(751);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(CREATE_);
			setState(754);
			match(VIRTUAL_);
			setState(755);
			match(TABLE_);
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(756);
				match(IF_);
				setState(757);
				match(NOT_);
				setState(758);
				match(EXISTS_);
				}
				break;
			}
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(761);
				schema_name();
				setState(762);
				match(DOT);
				}
				break;
			}
			setState(766);
			table_name();
			setState(767);
			match(USING_);
			setState(768);
			module_name();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(769);
				match(OPEN_PAR);
				setState(770);
				module_argument();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(771);
					match(COMMA);
					setState(772);
					module_argument();
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(778);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(WITH_);
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(783);
				match(RECURSIVE_);
				}
				break;
			}
			setState(786);
			cte_table_name();
			setState(787);
			match(AS_);
			setState(788);
			match(OPEN_PAR);
			setState(789);
			select_stmt();
			setState(790);
			match(CLOSE_PAR);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(791);
				match(COMMA);
				setState(792);
				cte_table_name();
				setState(793);
				match(AS_);
				setState(794);
				match(OPEN_PAR);
				setState(795);
				select_stmt();
				setState(796);
				match(CLOSE_PAR);
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			table_name();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(804);
				match(OPEN_PAR);
				setState(805);
				column_name();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(806);
					match(COMMA);
					setState(807);
					column_name();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_cteContext extends ParserRuleContext {
		public Cte_table_nameContext cte_table_name() {
			return getRuleContext(Cte_table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Initial_selectContext initial_select() {
			return getRuleContext(Initial_selectContext.class,0);
		}
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public Recursive_selectContext recursive_select() {
			return getRuleContext(Recursive_selectContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public Recursive_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_cte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_cte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_cte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_cteContext recursive_cte() throws RecognitionException {
		Recursive_cteContext _localctx = new Recursive_cteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_recursive_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			cte_table_name();
			setState(818);
			match(AS_);
			setState(819);
			match(OPEN_PAR);
			setState(820);
			initial_select();
			setState(821);
			match(UNION_);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_) {
				{
				setState(822);
				match(ALL_);
				}
			}

			setState(825);
			recursive_select();
			setState(826);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			table_name();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(829);
				match(OPEN_PAR);
				setState(830);
				column_name();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(831);
					match(COMMA);
					setState(832);
					column_name();
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
				match(CLOSE_PAR);
				}
			}

			setState(842);
			match(AS_);
			setState(843);
			match(OPEN_PAR);
			setState(844);
			select_stmt();
			setState(845);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(847);
				with_clause();
				}
			}

			setState(850);
			match(DELETE_);
			setState(851);
			match(FROM_);
			setState(852);
			qualified_table_name();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(853);
				match(WHERE_);
				setState(854);
				expr(0);
				}
			}

			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(857);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(860);
				with_clause();
				}
			}

			setState(863);
			match(DELETE_);
			setState(864);
			match(FROM_);
			setState(865);
			qualified_table_name();
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(866);
				match(WHERE_);
				setState(867);
				expr(0);
				}
			}

			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(870);
				returning_clause();
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(873);
					order_by_stmt();
					}
				}

				setState(876);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(DETACH_);
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(880);
				match(DATABASE_);
				}
				break;
			}
			setState(883);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_stmtContext extends ParserRuleContext {
		public Token object;
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDrop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(DROP_);
			setState(886);
			((Drop_stmtContext)_localctx).object = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2324138882699886593L) != 0)) ) {
				((Drop_stmtContext)_localctx).object = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(887);
				match(IF_);
				setState(888);
				match(EXISTS_);
				}
				break;
			}
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(891);
				schema_name();
				setState(892);
				match(DOT);
				}
				break;
			}
			setState(896);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public Over_clauseContext over_clause() {
			return getRuleContext(Over_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Keyword_existsContext keyword_exists() {
			return getRuleContext(Keyword_existsContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public List<TerminalNode> WHEN_() { return getTokens(SQLiteParser.WHEN_); }
		public TerminalNode WHEN_(int i) {
			return getToken(SQLiteParser.WHEN_, i);
		}
		public List<TerminalNode> THEN_() { return getTokens(SQLiteParser.THEN_); }
		public TerminalNode THEN_(int i) {
			return getToken(SQLiteParser.THEN_, i);
		}
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public Predicate_operatorContext predicate_operator() {
			return getRuleContext(Predicate_operatorContext.class,0);
		}
		public Predicate_andContext predicate_and() {
			return getRuleContext(Predicate_andContext.class,0);
		}
		public Predicate_orContext predicate_or() {
			return getRuleContext(Predicate_orContext.class,0);
		}
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(899);
				literal_value();
				}
				break;
			case 2:
				{
				setState(900);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(904);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(901);
						schema_name();
						setState(902);
						match(DOT);
						}
						break;
					}
					setState(906);
					table_name();
					setState(907);
					match(DOT);
					}
					break;
				}
				setState(911);
				column_name();
				}
				break;
			case 4:
				{
				setState(912);
				unary_operator();
				setState(913);
				expr(21);
				}
				break;
			case 5:
				{
				setState(915);
				function_name();
				setState(916);
				match(OPEN_PAR);
				setState(929);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case ABORT_:
				case ACTION_:
				case ADD_:
				case AFTER_:
				case ALL_:
				case ALTER_:
				case ANALYZE_:
				case AND_:
				case AS_:
				case ASC_:
				case ATTACH_:
				case AUTOINCREMENT_:
				case BEFORE_:
				case BEGIN_:
				case BETWEEN_:
				case BY_:
				case CASCADE_:
				case CASE_:
				case CAST_:
				case CHECK_:
				case COLLATE_:
				case COLUMN_:
				case COMMIT_:
				case CONFLICT_:
				case CONSTRAINT_:
				case CREATE_:
				case CROSS_:
				case CURRENT_DATE_:
				case CURRENT_TIME_:
				case CURRENT_TIMESTAMP_:
				case DATABASE_:
				case DEFAULT_:
				case DEFERRABLE_:
				case DEFERRED_:
				case DELETE_:
				case DESC_:
				case DETACH_:
				case DISTINCT_:
				case DROP_:
				case EACH_:
				case ELSE_:
				case END_:
				case ESCAPE_:
				case EXCEPT_:
				case EXCLUSIVE_:
				case EXISTS_:
				case EXPLAIN_:
				case FAIL_:
				case FOR_:
				case FOREIGN_:
				case FROM_:
				case FULL_:
				case GLOB_:
				case GROUP_:
				case HAVING_:
				case IF_:
				case IGNORE_:
				case IMMEDIATE_:
				case IN_:
				case INDEX_:
				case INDEXED_:
				case INITIALLY_:
				case INNER_:
				case INSERT_:
				case INSTEAD_:
				case INTERSECT_:
				case INTO_:
				case IS_:
				case ISNULL_:
				case JOIN_:
				case KEY_:
				case LEFT_:
				case LIKE_:
				case LIMIT_:
				case MATCH_:
				case NATURAL_:
				case NO_:
				case NOT_:
				case NOTNULL_:
				case NULL_:
				case OF_:
				case OFFSET_:
				case ON_:
				case OR_:
				case ORDER_:
				case OUTER_:
				case PLAN_:
				case PRAGMA_:
				case PRIMARY_:
				case QUERY_:
				case RAISE_:
				case RECURSIVE_:
				case REFERENCES_:
				case REGEXP_:
				case REINDEX_:
				case RELEASE_:
				case RENAME_:
				case REPLACE_:
				case RESTRICT_:
				case RIGHT_:
				case ROLLBACK_:
				case ROW_:
				case ROWS_:
				case SAVEPOINT_:
				case SELECT_:
				case SET_:
				case TABLE_:
				case TEMP_:
				case TEMPORARY_:
				case THEN_:
				case TO_:
				case TRANSACTION_:
				case TRIGGER_:
				case UNION_:
				case UNIQUE_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case VIEW_:
				case VIRTUAL_:
				case WHEN_:
				case WHERE_:
				case WITH_:
				case WITHOUT_:
				case FIRST_VALUE_:
				case OVER_:
				case PARTITION_:
				case RANGE_:
				case PRECEDING_:
				case UNBOUNDED_:
				case CURRENT_:
				case FOLLOWING_:
				case CUME_DIST_:
				case DENSE_RANK_:
				case LAG_:
				case LAST_VALUE_:
				case LEAD_:
				case NTH_VALUE_:
				case NTILE_:
				case PERCENT_RANK_:
				case RANK_:
				case ROW_NUMBER_:
				case GENERATED_:
				case ALWAYS_:
				case STORED_:
				case TRUE_:
				case FALSE_:
				case WINDOW_:
				case NULLS_:
				case FIRST_:
				case LAST_:
				case FILTER_:
				case GROUPS_:
				case EXCLUDE_:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					{
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(917);
						match(DISTINCT_);
						}
						break;
					}
					setState(920);
					expr(0);
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(921);
						match(COMMA);
						setState(922);
						expr(0);
						}
						}
						setState(927);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case STAR:
					{
					setState(928);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(931);
				match(CLOSE_PAR);
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(932);
					filter_clause();
					}
					break;
				}
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(935);
					over_clause();
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(938);
				match(OPEN_PAR);
				setState(939);
				expr(0);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(940);
					match(COMMA);
					setState(941);
					expr(0);
					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(947);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(949);
				match(CAST_);
				setState(950);
				match(OPEN_PAR);
				setState(951);
				expr(0);
				setState(952);
				match(AS_);
				setState(953);
				type_name();
				setState(954);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_ || _la==NOT_) {
					{
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_) {
						{
						setState(956);
						negation();
						}
					}

					setState(959);
					keyword_exists();
					}
				}

				setState(962);
				match(OPEN_PAR);
				setState(963);
				select_stmt();
				setState(964);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(966);
				match(CASE_);
				setState(968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(967);
					expr(0);
					}
					break;
				}
				setState(975); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(970);
					match(WHEN_);
					setState(971);
					expr(0);
					setState(972);
					match(THEN_);
					setState(973);
					expr(0);
					}
					}
					setState(977); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_ );
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_) {
					{
					setState(979);
					match(ELSE_);
					setState(980);
					expr(0);
					}
				}

				setState(983);
				match(END_);
				}
				break;
			case 10:
				{
				setState(985);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1098);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1096);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(988);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(989);
						match(PIPE2);
						setState(990);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(991);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(992);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(993);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(994);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(995);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(996);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(997);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(998);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(999);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1000);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1001);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1002);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1003);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1004);
						predicate_operator();
						setState(1005);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1007);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1008);
						predicate_and();
						setState(1009);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1011);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1012);
						predicate_or();
						setState(1013);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1015);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1016);
						match(IS_);
						setState(1018);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
						case 1:
							{
							setState(1017);
							match(NOT_);
							}
							break;
						}
						setState(1020);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1021);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1023);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1022);
							negation();
							}
						}

						setState(1025);
						match(BETWEEN_);
						setState(1026);
						expr(0);
						setState(1027);
						match(AND_);
						setState(1028);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1030);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1031);
						match(COLLATE_);
						setState(1032);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1033);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1035);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1034);
							negation();
							}
						}

						setState(1037);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 2199028498433L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1038);
						expr(0);
						setState(1041);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(1039);
							match(ESCAPE_);
							setState(1040);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1043);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1049);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ISNULL_:
							{
							setState(1044);
							match(ISNULL_);
							}
							break;
						case NOTNULL_:
							{
							setState(1045);
							match(NOTNULL_);
							}
							break;
						case NOT_:
							{
							setState(1046);
							negation();
							setState(1047);
							match(NULL_);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1051);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1053);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_) {
							{
							setState(1052);
							negation();
							}
						}

						setState(1055);
						match(IN_);
						setState(1094);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
						case 1:
							{
							setState(1056);
							match(OPEN_PAR);
							setState(1066);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
							case 1:
								{
								setState(1057);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1058);
								expr(0);
								setState(1063);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1059);
									match(COMMA);
									setState(1060);
									expr(0);
									}
									}
									setState(1065);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1068);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1072);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
							case 1:
								{
								setState(1069);
								schema_name();
								setState(1070);
								match(DOT);
								}
								break;
							}
							setState(1074);
							table_name();
							}
							break;
						case 3:
							{
							setState(1078);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
							case 1:
								{
								setState(1075);
								schema_name();
								setState(1076);
								match(DOT);
								}
								break;
							}
							setState(1080);
							table_function_name();
							setState(1081);
							match(OPEN_PAR);
							setState(1090);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0)) {
								{
								setState(1082);
								expr(0);
								setState(1087);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1083);
									match(COMMA);
									setState(1084);
									expr(0);
									}
									}
									setState(1089);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
							}

							setState(1092);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Keyword_existsContext extends ParserRuleContext {
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public Keyword_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterKeyword_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitKeyword_exists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitKeyword_exists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_existsContext keyword_exists() throws RecognitionException {
		Keyword_existsContext _localctx = new Keyword_existsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyword_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(EXISTS_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Predicate_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public Predicate_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPredicate_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPredicate_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPredicate_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_operatorContext predicate_operator() throws RecognitionException {
		Predicate_operatorContext _localctx = new Predicate_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_predicate_operator);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				match(ASSIGN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				match(NOT_EQ1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1106);
				match(NOT_EQ2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1107);
				match(IS_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1108);
				match(IS_);
				setState(1109);
				negation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1110);
				match(IN_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1111);
				match(LIKE_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1112);
				match(GLOB_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1113);
				match(MATCH_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1114);
				match(REGEXP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Predicate_andContext extends ParserRuleContext {
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public Predicate_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPredicate_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPredicate_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPredicate_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_andContext predicate_and() throws RecognitionException {
		Predicate_andContext _localctx = new Predicate_andContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_predicate_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(AND_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Predicate_orContext extends ParserRuleContext {
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public Predicate_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPredicate_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPredicate_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPredicate_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predicate_orContext predicate_or() throws RecognitionException {
		Predicate_orContext _localctx = new Predicate_orContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_predicate_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(OR_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(NOT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(RAISE_);
			setState(1124);
			match(OPEN_PAR);
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE_:
				{
				setState(1125);
				match(IGNORE_);
				}
				break;
			case ABORT_:
			case FAIL_:
			case ROLLBACK_:
				{
				setState(1126);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || _la==FAIL_ || _la==ROLLBACK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1127);
				match(COMMA);
				setState(1128);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1131);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 4503599627370503L) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & 212995L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_rowContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Value_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterValue_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitValue_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitValue_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rowContext value_row() throws RecognitionException {
		Value_rowContext _localctx = new Value_rowContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_value_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(OPEN_PAR);
			setState(1136);
			expr(0);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1137);
				match(COMMA);
				setState(1138);
				expr(0);
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1144);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Values_clauseContext extends ParserRuleContext {
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public List<Value_rowContext> value_row() {
			return getRuleContexts(Value_rowContext.class);
		}
		public Value_rowContext value_row(int i) {
			return getRuleContext(Value_rowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterValues_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitValues_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitValues_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_clauseContext values_clause() throws RecognitionException {
		Values_clauseContext _localctx = new Values_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(VALUES_);
			setState(1147);
			value_row();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1148);
				match(COMMA);
				setState(1149);
				value_row();
				}
				}
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Upsert_clauseContext upsert_clause() {
			return getRuleContext(Upsert_clauseContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1155);
				with_clause();
				}
			}

			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1158);
				match(INSERT_);
				}
				break;
			case 2:
				{
				setState(1159);
				match(REPLACE_);
				}
				break;
			case 3:
				{
				setState(1160);
				match(INSERT_);
				setState(1161);
				match(OR_);
				setState(1162);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1165);
			match(INTO_);
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1166);
				schema_name();
				setState(1167);
				match(DOT);
				}
				break;
			}
			setState(1171);
			table_name();
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1172);
				match(AS_);
				setState(1173);
				table_alias();
				}
			}

			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1176);
				match(OPEN_PAR);
				setState(1177);
				column_name();
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1178);
					match(COMMA);
					setState(1179);
					column_name();
					}
					}
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1185);
				match(CLOSE_PAR);
				}
			}

			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
			case VALUES_:
			case WITH_:
				{
				{
				setState(1191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1189);
					values_clause();
					}
					break;
				case 2:
					{
					setState(1190);
					select_stmt();
					}
					break;
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON_) {
					{
					setState(1193);
					upsert_clause();
					}
				}

				}
				}
				break;
			case DEFAULT_:
				{
				setState(1196);
				match(DEFAULT_);
				setState(1197);
				match(VALUES_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1200);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Returning_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNING_() { return getToken(SQLiteParser.RETURNING_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Returning_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterReturning_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitReturning_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitReturning_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returning_clauseContext returning_clause() throws RecognitionException {
		Returning_clauseContext _localctx = new Returning_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returning_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(RETURNING_);
			setState(1204);
			result_column();
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1205);
				match(COMMA);
				setState(1206);
				result_column();
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Upsert_clauseContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode DO_() { return getToken(SQLiteParser.DO_, 0); }
		public TerminalNode NOTHING_() { return getToken(SQLiteParser.NOTHING_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> WHERE_() { return getTokens(SQLiteParser.WHERE_); }
		public TerminalNode WHERE_(int i) {
			return getToken(SQLiteParser.WHERE_, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public Upsert_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpsert_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpsert_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpsert_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Upsert_clauseContext upsert_clause() throws RecognitionException {
		Upsert_clauseContext _localctx = new Upsert_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_upsert_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(ON_);
			setState(1213);
			match(CONFLICT_);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1214);
				match(OPEN_PAR);
				setState(1215);
				indexed_column();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1216);
					match(COMMA);
					setState(1217);
					indexed_column();
					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				match(CLOSE_PAR);
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1224);
					match(WHERE_);
					setState(1225);
					expr(0);
					}
				}

				}
			}

			setState(1230);
			match(DO_);
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING_:
				{
				setState(1231);
				match(NOTHING_);
				}
				break;
			case UPDATE_:
				{
				setState(1232);
				match(UPDATE_);
				setState(1233);
				match(SET_);
				{
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1234);
					column_name();
					}
					break;
				case 2:
					{
					setState(1235);
					column_name_list();
					}
					break;
				}
				setState(1238);
				match(ASSIGN);
				setState(1239);
				expr(0);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1240);
					match(COMMA);
					setState(1243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						setState(1241);
						column_name();
						}
						break;
					case 2:
						{
						setState(1242);
						column_name_list();
						}
						break;
					}
					setState(1245);
					match(ASSIGN);
					setState(1246);
					expr(0);
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1253);
					match(WHERE_);
					setState(1254);
					expr(0);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(PRAGMA_);
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1260);
				schema_name();
				setState(1261);
				match(DOT);
				}
				break;
			}
			setState(1265);
			pragma_name();
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(1266);
				match(ASSIGN);
				setState(1267);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(1268);
				match(OPEN_PAR);
				setState(1269);
				pragma_value();
				setState(1270);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pragma_value);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1276);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(REINDEX_);
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1280);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1281);
					schema_name();
					setState(1282);
					match(DOT);
					}
					break;
				}
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1286);
					table_name();
					}
					break;
				case 2:
					{
					setState(1287);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1292);
				common_table_stmt();
				}
			}

			setState(1295);
			select_core();
			setState(1301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1296);
					compound_operator();
					setState(1297);
					select_core();
					}
					} 
				}
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1304);
				order_by_stmt();
				}
			}

			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1307);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			table_or_subquery();
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==CROSS_ || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8833L) != 0)) {
				{
				{
				setState(1311);
				join_operator();
				setState(1312);
				table_or_subquery();
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1313);
					join_constraint();
					}
					break;
				}
				}
				}
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public Group_by_exprContext group_by_expr() {
			return getRuleContext(Group_by_exprContext.class,0);
		}
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public List<Window_nameContext> window_name() {
			return getRuleContexts(Window_nameContext.class);
		}
		public Window_nameContext window_name(int i) {
			return getRuleContext(Window_nameContext.class,i);
		}
		public List<TerminalNode> AS_() { return getTokens(SQLiteParser.AS_); }
		public TerminalNode AS_(int i) {
			return getToken(SQLiteParser.AS_, i);
		}
		public List<Window_defnContext> window_defn() {
			return getRuleContexts(Window_defnContext.class);
		}
		public Window_defnContext window_defn(int i) {
			return getRuleContext(Window_defnContext.class,i);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Having_exprContext having_expr() {
			return getRuleContext(Having_exprContext.class,0);
		}
		public Values_clauseContext values_clause() {
			return getRuleContext(Values_clauseContext.class,0);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_select_core);
		int _la;
		try {
			setState(1373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1321);
				match(SELECT_);
				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1322);
					_la = _input.LA(1);
					if ( !(_la==ALL_ || _la==DISTINCT_) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1325);
				result_column();
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1326);
					match(COMMA);
					setState(1327);
					result_column();
					}
					}
					setState(1332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_) {
					{
					setState(1333);
					match(FROM_);
					setState(1343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						setState(1334);
						table_or_subquery();
						setState(1339);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1335);
							match(COMMA);
							setState(1336);
							table_or_subquery();
							}
							}
							setState(1341);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1342);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE_) {
					{
					setState(1347);
					where_expr();
					}
				}

				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP_) {
					{
					setState(1350);
					group_by_expr();
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HAVING_) {
						{
						setState(1351);
						having_expr();
						}
					}

					}
				}

				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WINDOW_) {
					{
					setState(1356);
					match(WINDOW_);
					setState(1357);
					window_name();
					setState(1358);
					match(AS_);
					setState(1359);
					window_defn();
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1360);
						match(COMMA);
						setState(1361);
						window_name();
						setState(1362);
						match(AS_);
						setState(1363);
						window_defn();
						}
						}
						setState(1369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				}
				break;
			case VALUES_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				values_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_exprContext extends ParserRuleContext {
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWhere_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWhere_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWhere_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_exprContext where_expr() throws RecognitionException {
		Where_exprContext _localctx = new Where_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_where_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(WHERE_);
			setState(1376);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_exprContext extends ParserRuleContext {
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Group_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterGroup_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitGroup_by_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitGroup_by_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_exprContext group_by_expr() throws RecognitionException {
		Group_by_exprContext _localctx = new Group_by_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_group_by_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(GROUP_);
			setState(1379);
			match(BY_);
			setState(1380);
			expr(0);
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1381);
				match(COMMA);
				setState(1382);
				expr(0);
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Having_exprContext extends ParserRuleContext {
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Having_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterHaving_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitHaving_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitHaving_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_exprContext having_expr() throws RecognitionException {
		Having_exprContext _localctx = new Having_exprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_having_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(HAVING_);
			setState(1389);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_factored_select_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1393);
				common_table_stmt();
				}
			}

			setState(1396);
			select_core();
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1397);
				order_by_stmt();
				}
			}

			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1400);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_stmtContext common_table_stmt() {
			return getRuleContext(Common_table_stmtContext.class,0);
		}
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public List<TerminalNode> UNION_() { return getTokens(SQLiteParser.UNION_); }
		public TerminalNode UNION_(int i) {
			return getToken(SQLiteParser.UNION_, i);
		}
		public List<TerminalNode> INTERSECT_() { return getTokens(SQLiteParser.INTERSECT_); }
		public TerminalNode INTERSECT_(int i) {
			return getToken(SQLiteParser.INTERSECT_, i);
		}
		public List<TerminalNode> EXCEPT_() { return getTokens(SQLiteParser.EXCEPT_); }
		public TerminalNode EXCEPT_(int i) {
			return getToken(SQLiteParser.EXCEPT_, i);
		}
		public List<TerminalNode> ALL_() { return getTokens(SQLiteParser.ALL_); }
		public TerminalNode ALL_(int i) {
			return getToken(SQLiteParser.ALL_, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1403);
				common_table_stmt();
				}
			}

			setState(1406);
			select_core();
			setState(1416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNION_:
					{
					setState(1407);
					match(UNION_);
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL_) {
						{
						setState(1408);
						match(ALL_);
						}
					}

					}
					break;
				case INTERSECT_:
					{
					setState(1411);
					match(INTERSECT_);
					}
					break;
				case EXCEPT_:
					{
					setState(1412);
					match(EXCEPT_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1415);
				select_core();
				}
				}
				setState(1418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXCEPT_ || _la==INTERSECT_ || _la==UNION_ );
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_) {
				{
				setState(1420);
				order_by_stmt();
				}
			}

			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_) {
				{
				setState(1423);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_table_or_subquery);
		int _la;
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1426);
					schema_name();
					setState(1427);
					match(DOT);
					}
					break;
				}
				setState(1431);
				table_name();
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						setState(1432);
						match(AS_);
						}
						break;
					}
					setState(1435);
					table_alias();
					}
					break;
				}
				setState(1443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INDEXED_:
					{
					setState(1438);
					match(INDEXED_);
					setState(1439);
					match(BY_);
					setState(1440);
					index_name();
					}
					break;
				case NOT_:
					{
					setState(1441);
					match(NOT_);
					setState(1442);
					match(INDEXED_);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case ALTER_:
				case ANALYZE_:
				case ATTACH_:
				case BEGIN_:
				case COMMIT_:
				case CREATE_:
				case CROSS_:
				case DELETE_:
				case DETACH_:
				case DROP_:
				case END_:
				case EXCEPT_:
				case EXPLAIN_:
				case GROUP_:
				case INNER_:
				case INSERT_:
				case INTERSECT_:
				case JOIN_:
				case LEFT_:
				case LIMIT_:
				case NATURAL_:
				case ON_:
				case ORDER_:
				case PRAGMA_:
				case REINDEX_:
				case RELEASE_:
				case REPLACE_:
				case RETURNING_:
				case ROLLBACK_:
				case SAVEPOINT_:
				case SELECT_:
				case UNION_:
				case UPDATE_:
				case USING_:
				case VACUUM_:
				case VALUES_:
				case WHERE_:
				case WITH_:
				case WINDOW_:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1445);
					schema_name();
					setState(1446);
					match(DOT);
					}
					break;
				}
				setState(1450);
				table_function_name();
				setState(1451);
				match(OPEN_PAR);
				setState(1452);
				expr(0);
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1453);
					match(COMMA);
					setState(1454);
					expr(0);
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1460);
				match(CLOSE_PAR);
				setState(1465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1461);
						match(AS_);
						}
						break;
					}
					setState(1464);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				match(OPEN_PAR);
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1468);
					table_or_subquery();
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1469);
						match(COMMA);
						setState(1470);
						table_or_subquery();
						}
						}
						setState(1475);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1476);
					join_clause();
					}
					break;
				}
				setState(1479);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1481);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(OPEN_PAR);
			setState(1485);
			select_stmt();
			setState(1486);
			match(CLOSE_PAR);
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1487);
					match(AS_);
					}
					break;
				}
				setState(1490);
				table_alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public AsteriskContext asterisk() {
			return getRuleContext(AsteriskContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_result_column);
		int _la;
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				asterisk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				table_name();
				setState(1495);
				match(DOT);
				setState(1496);
				asterisk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1498);
				expr(0);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS_ || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_) {
						{
						setState(1499);
						match(AS_);
						}
					}

					setState(1502);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsteriskContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_operatorContext extends ParserRuleContext {
		public Non_ansi_join_operatorContext non_ansi_join_operator() {
			return getRuleContext(Non_ansi_join_operatorContext.class,0);
		}
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_join_operator);
		int _la;
		try {
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				non_ansi_join_operator();
				}
				break;
			case CROSS_:
			case INNER_:
			case JOIN_:
			case LEFT_:
			case NATURAL_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NATURAL_) {
					{
					setState(1510);
					match(NATURAL_);
					}
				}

				setState(1519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_:
					{
					setState(1513);
					match(LEFT_);
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER_) {
						{
						setState(1514);
						match(OUTER_);
						}
					}

					}
					break;
				case INNER_:
					{
					setState(1517);
					match(INNER_);
					}
					break;
				case CROSS_:
					{
					setState(1518);
					match(CROSS_);
					}
					break;
				case JOIN_:
					break;
				default:
					break;
				}
				setState(1521);
				match(JOIN_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Non_ansi_join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Non_ansi_join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_ansi_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterNon_ansi_join_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitNon_ansi_join_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitNon_ansi_join_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_ansi_join_operatorContext non_ansi_join_operator() throws RecognitionException {
		Non_ansi_join_operatorContext _localctx = new Non_ansi_join_operatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_non_ansi_join_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_join_constraint);
		int _la;
		try {
			setState(1540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				match(ON_);
				setState(1527);
				expr(0);
				}
				break;
			case USING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				match(USING_);
				setState(1529);
				match(OPEN_PAR);
				setState(1530);
				column_name();
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1531);
					match(COMMA);
					setState(1532);
					column_name();
					}
					}
					setState(1537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1538);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_compound_operator);
		int _la;
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				match(UNION_);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_) {
					{
					setState(1543);
					match(ALL_);
					}
				}

				}
				break;
			case INTERSECT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
				match(INTERSECT_);
				}
				break;
			case EXCEPT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1547);
				match(EXCEPT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1550);
				with_clause();
				}
			}

			setState(1553);
			match(UPDATE_);
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1554);
				match(OR_);
				setState(1555);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1558);
			qualified_table_name();
			setState(1559);
			match(SET_);
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1560);
				column_name();
				}
				break;
			case 2:
				{
				setState(1561);
				column_name_list();
				}
				break;
			}
			setState(1564);
			match(ASSIGN);
			setState(1565);
			expr(0);
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1566);
				match(COMMA);
				setState(1569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1567);
					column_name();
					}
					break;
				case 2:
					{
					setState(1568);
					column_name_list();
					}
					break;
				}
				setState(1571);
				match(ASSIGN);
				setState(1572);
				expr(0);
				}
				}
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_) {
				{
				setState(1579);
				match(FROM_);
				setState(1589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1580);
					table_or_subquery();
					setState(1585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1581);
						match(COMMA);
						setState(1582);
						table_or_subquery();
						}
						}
						setState(1587);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1588);
					join_clause();
					}
					break;
				}
				}
			}

			setState(1595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1593);
				match(WHERE_);
				setState(1594);
				expr(0);
				}
			}

			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1597);
				returning_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_name_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(OPEN_PAR);
			setState(1601);
			column_name();
			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1602);
				match(COMMA);
				setState(1603);
				column_name();
				}
				}
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1609);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public Returning_clauseContext returning_clause() {
			return getRuleContext(Returning_clauseContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public Order_by_stmtContext order_by_stmt() {
			return getRuleContext(Order_by_stmtContext.class,0);
		}
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_) {
				{
				setState(1611);
				with_clause();
				}
			}

			setState(1614);
			match(UPDATE_);
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1615);
				match(OR_);
				setState(1616);
				_la = _input.LA(1);
				if ( !(_la==ABORT_ || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 19140298416325121L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1619);
			qualified_table_name();
			setState(1620);
			match(SET_);
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1621);
				column_name();
				}
				break;
			case 2:
				{
				setState(1622);
				column_name_list();
				}
				break;
			}
			setState(1625);
			match(ASSIGN);
			setState(1626);
			expr(0);
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1627);
				match(COMMA);
				setState(1630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1628);
					column_name();
					}
					break;
				case 2:
					{
					setState(1629);
					column_name_list();
					}
					break;
				}
				setState(1632);
				match(ASSIGN);
				setState(1633);
				expr(0);
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_) {
				{
				setState(1640);
				match(WHERE_);
				setState(1641);
				expr(0);
				}
			}

			setState(1645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_) {
				{
				setState(1644);
				returning_clause();
				}
			}

			setState(1651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT_ || _la==ORDER_) {
				{
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1647);
					order_by_stmt();
					}
				}

				setState(1650);
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_qualified_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1653);
				schema_name();
				setState(1654);
				match(DOT);
				}
				break;
			}
			setState(1658);
			table_name();
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_) {
				{
				setState(1659);
				match(AS_);
				setState(1660);
				alias();
				}
			}

			setState(1668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEXED_:
				{
				setState(1663);
				match(INDEXED_);
				setState(1664);
				match(BY_);
				setState(1665);
				index_name();
				}
				break;
			case NOT_:
				{
				setState(1666);
				match(NOT_);
				setState(1667);
				match(INDEXED_);
				}
				break;
			case EOF:
			case SCOL:
			case ALTER_:
			case ANALYZE_:
			case ATTACH_:
			case BEGIN_:
			case COMMIT_:
			case CREATE_:
			case DELETE_:
			case DETACH_:
			case DROP_:
			case END_:
			case EXPLAIN_:
			case INSERT_:
			case LIMIT_:
			case ORDER_:
			case PRAGMA_:
			case REINDEX_:
			case RELEASE_:
			case REPLACE_:
			case RETURNING_:
			case ROLLBACK_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case UPDATE_:
			case VACUUM_:
			case VALUES_:
			case WHERE_:
			case WITH_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_vacuum_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(VACUUM_);
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1671);
				schema_name();
				}
				break;
			}
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_) {
				{
				setState(1674);
				match(INTO_);
				setState(1675);
				filename();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Filter_clauseContext extends ParserRuleContext {
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFilter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFilter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFilter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_filter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(FILTER_);
			setState(1679);
			match(OPEN_PAR);
			setState(1680);
			match(WHERE_);
			setState(1681);
			expr(0);
			setState(1682);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_defnContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_defn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_defn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_defn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_defnContext window_defn() throws RecognitionException {
		Window_defnContext _localctx = new Window_defnContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_window_defn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(OPEN_PAR);
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1685);
				base_window_name();
				}
				break;
			}
			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION_) {
				{
				setState(1688);
				match(PARTITION_);
				setState(1689);
				match(BY_);
				setState(1690);
				expr(0);
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1691);
					match(COMMA);
					setState(1692);
					expr(0);
					}
					}
					setState(1697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1700);
			match(ORDER_);
			setState(1701);
			match(BY_);
			setState(1702);
			ordering_term();
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1703);
				match(COMMA);
				setState(1704);
				ordering_term();
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
				{
				setState(1710);
				frame_spec();
				}
			}

			setState(1713);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Over_clauseContext extends ParserRuleContext {
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Base_window_nameContext base_window_name() {
			return getRuleContext(Base_window_nameContext.class,0);
		}
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public List<TerminalNode> BY_() { return getTokens(SQLiteParser.BY_); }
		public TerminalNode BY_(int i) {
			return getToken(SQLiteParser.BY_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Frame_specContext frame_spec() {
			return getRuleContext(Frame_specContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOver_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOver_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOver_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Over_clauseContext over_clause() throws RecognitionException {
		Over_clauseContext _localctx = new Over_clauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			match(OVER_);
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1716);
				window_name();
				}
				break;
			case 2:
				{
				setState(1717);
				match(OPEN_PAR);
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(1718);
					base_window_name();
					}
					break;
				}
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1721);
					match(PARTITION_);
					setState(1722);
					match(BY_);
					setState(1723);
					expr(0);
					setState(1728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1724);
						match(COMMA);
						setState(1725);
						expr(0);
						}
						}
						setState(1730);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1733);
					match(ORDER_);
					setState(1734);
					match(BY_);
					setState(1735);
					ordering_term();
					setState(1740);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1736);
						match(COMMA);
						setState(1737);
						ordering_term();
						}
						}
						setState(1742);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1745);
					frame_spec();
					}
				}

				setState(1748);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_specContext extends ParserRuleContext {
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode OTHERS_() { return getToken(SQLiteParser.OTHERS_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode TIES_() { return getToken(SQLiteParser.TIES_, 0); }
		public Frame_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_specContext frame_spec() throws RecognitionException {
		Frame_specContext _localctx = new Frame_specContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_frame_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			frame_clause();
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE_) {
				{
				setState(1752);
				match(EXCLUDE_);
				setState(1759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NO_:
					{
					setState(1753);
					match(NO_);
					setState(1754);
					match(OTHERS_);
					}
					break;
				case CURRENT_:
					{
					setState(1755);
					match(CURRENT_);
					setState(1756);
					match(ROW_);
					}
					break;
				case GROUP_:
					{
					setState(1757);
					match(GROUP_);
					}
					break;
				case TIES_:
					{
					setState(1758);
					match(TIES_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_clauseContext extends ParserRuleContext {
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public Frame_singleContext frame_single() {
			return getRuleContext(Frame_singleContext.class,0);
		}
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public Frame_leftContext frame_left() {
			return getRuleContext(Frame_leftContext.class,0);
		}
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public Frame_rightContext frame_right() {
			return getRuleContext(Frame_rightContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_frame_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1764);
				frame_single();
				}
				break;
			case 2:
				{
				setState(1765);
				match(BETWEEN_);
				setState(1766);
				frame_left();
				setState(1767);
				match(AND_);
				setState(1768);
				frame_right();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_function_invocationContext extends ParserRuleContext {
		public Simple_funcContext simple_func() {
			return getRuleContext(Simple_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Simple_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_function_invocationContext simple_function_invocation() throws RecognitionException {
		Simple_function_invocationContext _localctx = new Simple_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_simple_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			simple_func();
			setState(1773);
			match(OPEN_PAR);
			setState(1783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1774);
				expr(0);
				setState(1779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1775);
					match(COMMA);
					setState(1776);
					expr(0);
					}
					}
					setState(1781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1782);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1785);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_function_invocationContext extends ParserRuleContext {
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Aggregate_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAggregate_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAggregate_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAggregate_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_function_invocationContext aggregate_function_invocation() throws RecognitionException {
		Aggregate_function_invocationContext _localctx = new Aggregate_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_aggregate_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			aggregate_func();
			setState(1788);
			match(OPEN_PAR);
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1789);
					match(DISTINCT_);
					}
					break;
				}
				setState(1792);
				expr(0);
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1793);
					match(COMMA);
					setState(1794);
					expr(0);
					}
					}
					setState(1799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1800);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1803);
			match(CLOSE_PAR);
			setState(1805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1804);
				filter_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_function_invocationContext extends ParserRuleContext {
		public Window_functionContext window_function() {
			return getRuleContext(Window_functionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Window_defnContext window_defn() {
			return getRuleContext(Window_defnContext.class,0);
		}
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Window_function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_function_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_function_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_function_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_function_invocationContext window_function_invocation() throws RecognitionException {
		Window_function_invocationContext _localctx = new Window_function_invocationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_window_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			window_function();
			setState(1808);
			match(OPEN_PAR);
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1809);
				expr(0);
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1810);
					match(COMMA);
					setState(1811);
					expr(0);
					}
					}
					setState(1816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1817);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1820);
			match(CLOSE_PAR);
			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER_) {
				{
				setState(1821);
				filter_clause();
				}
			}

			setState(1824);
			match(OVER_);
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1825);
				window_defn();
				}
				break;
			case 2:
				{
				setState(1826);
				window_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_stmtContext extends ParserRuleContext {
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCommon_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCommon_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCommon_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_stmtContext common_table_stmt() throws RecognitionException {
		Common_table_stmtContext _localctx = new Common_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_common_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(WITH_);
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(1830);
				match(RECURSIVE_);
				}
				break;
			}
			setState(1833);
			common_table_expression();
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1834);
				match(COMMA);
				setState(1835);
				common_table_expression();
				}
				}
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_stmtContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Order_by_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_stmtContext order_by_stmt() throws RecognitionException {
		Order_by_stmtContext _localctx = new Order_by_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_order_by_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(ORDER_);
			setState(1842);
			match(BY_);
			setState(1843);
			ordering_term();
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1844);
				match(COMMA);
				setState(1845);
				ordering_term();
				}
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterLimit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitLimit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitLimit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_limit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(LIMIT_);
			setState(1852);
			expr(0);
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OFFSET_) {
				{
				setState(1853);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==OFFSET_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1854);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			expr(0);
			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE_) {
				{
				setState(1858);
				match(COLLATE_);
				setState(1859);
				collation_name();
				}
			}

			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(1862);
				asc_desc();
				}
			}

			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS_) {
				{
				setState(1865);
				match(NULLS_);
				setState(1866);
				_la = _input.LA(1);
				if ( !(_la==FIRST_ || _la==LAST_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Asc_descContext extends ParserRuleContext {
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAsc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAsc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			_la = _input.LA(1);
			if ( !(_la==ASC_ || _la==DESC_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_leftContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_left(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_left(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_leftContext frame_left() throws RecognitionException {
		Frame_leftContext _localctx = new Frame_leftContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_frame_left);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				expr(0);
				setState(1872);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				expr(0);
				setState(1875);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				match(CURRENT_);
				setState(1878);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1879);
				match(UNBOUNDED_);
				setState(1880);
				match(PRECEDING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_rightContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public Frame_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_right(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_right(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_rightContext frame_right() throws RecognitionException {
		Frame_rightContext _localctx = new Frame_rightContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_frame_right);
		try {
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				expr(0);
				setState(1884);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				expr(0);
				setState(1887);
				match(FOLLOWING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1889);
				match(CURRENT_);
				setState(1890);
				match(ROW_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1891);
				match(UNBOUNDED_);
				setState(1892);
				match(FOLLOWING_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Frame_singleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public Frame_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFrame_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFrame_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFrame_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_singleContext frame_single() throws RecognitionException {
		Frame_singleContext _localctx = new Frame_singleContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_frame_single);
		try {
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				expr(0);
				setState(1896);
				match(PRECEDING_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				match(UNBOUNDED_);
				setState(1899);
				match(PRECEDING_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1900);
				match(CURRENT_);
				setState(1901);
				match(ROW_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_functionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public Order_by_expr_asc_descContext order_by_expr_asc_desc() {
			return getRuleContext(Order_by_expr_asc_descContext.class,0);
		}
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Frame_clauseContext frame_clause() {
			return getRuleContext(Frame_clauseContext.class,0);
		}
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public Order_by_exprContext order_by_expr() {
			return getRuleContext(Order_by_exprContext.class,0);
		}
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public Window_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_functionContext window_function() throws RecognitionException {
		Window_functionContext _localctx = new Window_functionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_window_function);
		int _la;
		try {
			setState(1989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST_VALUE_:
			case LAST_VALUE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1904);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE_ || _la==LAST_VALUE_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1905);
				match(OPEN_PAR);
				setState(1906);
				expr(0);
				setState(1907);
				match(CLOSE_PAR);
				setState(1908);
				match(OVER_);
				setState(1909);
				match(OPEN_PAR);
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1910);
					partition_by();
					}
				}

				setState(1913);
				order_by_expr_asc_desc();
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1914);
					frame_clause();
					}
				}

				setState(1917);
				match(CLOSE_PAR);
				}
				break;
			case CUME_DIST_:
			case PERCENT_RANK_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				_la = _input.LA(1);
				if ( !(_la==CUME_DIST_ || _la==PERCENT_RANK_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1920);
				match(OPEN_PAR);
				setState(1921);
				match(CLOSE_PAR);
				setState(1922);
				match(OVER_);
				setState(1923);
				match(OPEN_PAR);
				setState(1925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1924);
					partition_by();
					}
				}

				setState(1928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_) {
					{
					setState(1927);
					order_by_expr();
					}
				}

				setState(1930);
				match(CLOSE_PAR);
				}
				break;
			case DENSE_RANK_:
			case RANK_:
			case ROW_NUMBER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1931);
				_la = _input.LA(1);
				if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 385L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1932);
				match(OPEN_PAR);
				setState(1933);
				match(CLOSE_PAR);
				setState(1934);
				match(OVER_);
				setState(1935);
				match(OPEN_PAR);
				setState(1937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1936);
					partition_by();
					}
				}

				setState(1939);
				order_by_expr_asc_desc();
				setState(1940);
				match(CLOSE_PAR);
				}
				break;
			case LAG_:
			case LEAD_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1942);
				_la = _input.LA(1);
				if ( !(_la==LAG_ || _la==LEAD_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1943);
				match(OPEN_PAR);
				setState(1944);
				expr(0);
				setState(1946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(1945);
					offset();
					}
					break;
				}
				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1948);
					default_value();
					}
				}

				setState(1951);
				match(CLOSE_PAR);
				setState(1952);
				match(OVER_);
				setState(1953);
				match(OPEN_PAR);
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1954);
					partition_by();
					}
				}

				setState(1957);
				order_by_expr_asc_desc();
				setState(1958);
				match(CLOSE_PAR);
				}
				break;
			case NTH_VALUE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1960);
				match(NTH_VALUE_);
				setState(1961);
				match(OPEN_PAR);
				setState(1962);
				expr(0);
				setState(1963);
				match(COMMA);
				setState(1964);
				signed_number();
				setState(1965);
				match(CLOSE_PAR);
				setState(1966);
				match(OVER_);
				setState(1967);
				match(OPEN_PAR);
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1968);
					partition_by();
					}
				}

				setState(1971);
				order_by_expr_asc_desc();
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 2251799880794113L) != 0)) {
					{
					setState(1972);
					frame_clause();
					}
				}

				setState(1975);
				match(CLOSE_PAR);
				}
				break;
			case NTILE_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1977);
				match(NTILE_);
				setState(1978);
				match(OPEN_PAR);
				setState(1979);
				expr(0);
				setState(1980);
				match(CLOSE_PAR);
				setState(1981);
				match(OVER_);
				setState(1982);
				match(OPEN_PAR);
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION_) {
					{
					setState(1983);
					partition_by();
					}
				}

				setState(1986);
				order_by_expr_asc_desc();
				setState(1987);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(COMMA);
			setState(1992);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			match(COMMA);
			setState(1995);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPartition_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPartition_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_partition_by);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(PARTITION_);
			setState(1998);
			match(BY_);
			setState(2000); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1999);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2002); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_exprContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Order_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_exprContext order_by_expr() throws RecognitionException {
		Order_by_exprContext _localctx = new Order_by_exprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_order_by_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(ORDER_);
			setState(2005);
			match(BY_);
			setState(2007); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2006);
				expr(0);
				}
				}
				setState(2009); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 4476578029606273023L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expr_asc_descContext extends ParserRuleContext {
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public Expr_asc_descContext expr_asc_desc() {
			return getRuleContext(Expr_asc_descContext.class,0);
		}
		public Order_by_expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterOrder_by_expr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitOrder_by_expr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitOrder_by_expr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expr_asc_descContext order_by_expr_asc_desc() throws RecognitionException {
		Order_by_expr_asc_descContext _localctx = new Order_by_expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_order_by_expr_asc_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			match(ORDER_);
			setState(2012);
			match(BY_);
			setState(2013);
			expr_asc_desc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_asc_descContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Asc_descContext> asc_desc() {
			return getRuleContexts(Asc_descContext.class);
		}
		public Asc_descContext asc_desc(int i) {
			return getRuleContext(Asc_descContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Expr_asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterExpr_asc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitExpr_asc_desc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitExpr_asc_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_asc_descContext expr_asc_desc() throws RecognitionException {
		Expr_asc_descContext _localctx = new Expr_asc_descContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expr_asc_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			expr(0);
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_ || _la==DESC_) {
				{
				setState(2016);
				asc_desc();
				}
			}

			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2019);
				match(COMMA);
				setState(2020);
				expr(0);
				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC_ || _la==DESC_) {
					{
					setState(2021);
					asc_desc();
					}
				}

				}
				}
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initial_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Initial_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterInitial_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitInitial_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitInitial_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_selectContext initial_select() throws RecognitionException {
		Initial_selectContext _localctx = new Initial_selectContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_initial_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Recursive_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Recursive_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursive_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterRecursive_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitRecursive_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitRecursive_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Recursive_selectContext recursive_select() throws RecognitionException {
		Recursive_selectContext _localctx = new Recursive_selectContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_recursive_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unary_operator);
		try {
			setState(2037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				match(MINUS);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034);
				match(PLUS);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035);
				match(TILDE);
				}
				break;
			case NOT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(2036);
				negation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_module_argument);
		try {
			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABORT_() { return getToken(SQLiteParser.ABORT_, 0); }
		public TerminalNode ACTION_() { return getToken(SQLiteParser.ACTION_, 0); }
		public TerminalNode ADD_() { return getToken(SQLiteParser.ADD_, 0); }
		public TerminalNode AFTER_() { return getToken(SQLiteParser.AFTER_, 0); }
		public TerminalNode ALL_() { return getToken(SQLiteParser.ALL_, 0); }
		public TerminalNode ALTER_() { return getToken(SQLiteParser.ALTER_, 0); }
		public TerminalNode ANALYZE_() { return getToken(SQLiteParser.ANALYZE_, 0); }
		public TerminalNode AND_() { return getToken(SQLiteParser.AND_, 0); }
		public TerminalNode AS_() { return getToken(SQLiteParser.AS_, 0); }
		public TerminalNode ASC_() { return getToken(SQLiteParser.ASC_, 0); }
		public TerminalNode ATTACH_() { return getToken(SQLiteParser.ATTACH_, 0); }
		public TerminalNode AUTOINCREMENT_() { return getToken(SQLiteParser.AUTOINCREMENT_, 0); }
		public TerminalNode BEFORE_() { return getToken(SQLiteParser.BEFORE_, 0); }
		public TerminalNode BEGIN_() { return getToken(SQLiteParser.BEGIN_, 0); }
		public TerminalNode BETWEEN_() { return getToken(SQLiteParser.BETWEEN_, 0); }
		public TerminalNode BY_() { return getToken(SQLiteParser.BY_, 0); }
		public TerminalNode CASCADE_() { return getToken(SQLiteParser.CASCADE_, 0); }
		public TerminalNode CASE_() { return getToken(SQLiteParser.CASE_, 0); }
		public TerminalNode CAST_() { return getToken(SQLiteParser.CAST_, 0); }
		public TerminalNode CHECK_() { return getToken(SQLiteParser.CHECK_, 0); }
		public TerminalNode COLLATE_() { return getToken(SQLiteParser.COLLATE_, 0); }
		public TerminalNode COLUMN_() { return getToken(SQLiteParser.COLUMN_, 0); }
		public TerminalNode COMMIT_() { return getToken(SQLiteParser.COMMIT_, 0); }
		public TerminalNode CONFLICT_() { return getToken(SQLiteParser.CONFLICT_, 0); }
		public TerminalNode CONSTRAINT_() { return getToken(SQLiteParser.CONSTRAINT_, 0); }
		public TerminalNode CREATE_() { return getToken(SQLiteParser.CREATE_, 0); }
		public TerminalNode CROSS_() { return getToken(SQLiteParser.CROSS_, 0); }
		public TerminalNode CURRENT_DATE_() { return getToken(SQLiteParser.CURRENT_DATE_, 0); }
		public TerminalNode CURRENT_TIME_() { return getToken(SQLiteParser.CURRENT_TIME_, 0); }
		public TerminalNode CURRENT_TIMESTAMP_() { return getToken(SQLiteParser.CURRENT_TIMESTAMP_, 0); }
		public TerminalNode DATABASE_() { return getToken(SQLiteParser.DATABASE_, 0); }
		public TerminalNode DEFAULT_() { return getToken(SQLiteParser.DEFAULT_, 0); }
		public TerminalNode DEFERRABLE_() { return getToken(SQLiteParser.DEFERRABLE_, 0); }
		public TerminalNode DEFERRED_() { return getToken(SQLiteParser.DEFERRED_, 0); }
		public TerminalNode DELETE_() { return getToken(SQLiteParser.DELETE_, 0); }
		public TerminalNode DESC_() { return getToken(SQLiteParser.DESC_, 0); }
		public TerminalNode DETACH_() { return getToken(SQLiteParser.DETACH_, 0); }
		public TerminalNode DISTINCT_() { return getToken(SQLiteParser.DISTINCT_, 0); }
		public TerminalNode DROP_() { return getToken(SQLiteParser.DROP_, 0); }
		public TerminalNode EACH_() { return getToken(SQLiteParser.EACH_, 0); }
		public TerminalNode ELSE_() { return getToken(SQLiteParser.ELSE_, 0); }
		public TerminalNode END_() { return getToken(SQLiteParser.END_, 0); }
		public TerminalNode ESCAPE_() { return getToken(SQLiteParser.ESCAPE_, 0); }
		public TerminalNode EXCEPT_() { return getToken(SQLiteParser.EXCEPT_, 0); }
		public TerminalNode EXCLUSIVE_() { return getToken(SQLiteParser.EXCLUSIVE_, 0); }
		public TerminalNode EXISTS_() { return getToken(SQLiteParser.EXISTS_, 0); }
		public TerminalNode EXPLAIN_() { return getToken(SQLiteParser.EXPLAIN_, 0); }
		public TerminalNode FAIL_() { return getToken(SQLiteParser.FAIL_, 0); }
		public TerminalNode FOR_() { return getToken(SQLiteParser.FOR_, 0); }
		public TerminalNode FOREIGN_() { return getToken(SQLiteParser.FOREIGN_, 0); }
		public TerminalNode FROM_() { return getToken(SQLiteParser.FROM_, 0); }
		public TerminalNode FULL_() { return getToken(SQLiteParser.FULL_, 0); }
		public TerminalNode GLOB_() { return getToken(SQLiteParser.GLOB_, 0); }
		public TerminalNode GROUP_() { return getToken(SQLiteParser.GROUP_, 0); }
		public TerminalNode HAVING_() { return getToken(SQLiteParser.HAVING_, 0); }
		public TerminalNode IF_() { return getToken(SQLiteParser.IF_, 0); }
		public TerminalNode IGNORE_() { return getToken(SQLiteParser.IGNORE_, 0); }
		public TerminalNode IMMEDIATE_() { return getToken(SQLiteParser.IMMEDIATE_, 0); }
		public TerminalNode IN_() { return getToken(SQLiteParser.IN_, 0); }
		public TerminalNode INDEX_() { return getToken(SQLiteParser.INDEX_, 0); }
		public TerminalNode INDEXED_() { return getToken(SQLiteParser.INDEXED_, 0); }
		public TerminalNode INITIALLY_() { return getToken(SQLiteParser.INITIALLY_, 0); }
		public TerminalNode INNER_() { return getToken(SQLiteParser.INNER_, 0); }
		public TerminalNode INSERT_() { return getToken(SQLiteParser.INSERT_, 0); }
		public TerminalNode INSTEAD_() { return getToken(SQLiteParser.INSTEAD_, 0); }
		public TerminalNode INTERSECT_() { return getToken(SQLiteParser.INTERSECT_, 0); }
		public TerminalNode INTO_() { return getToken(SQLiteParser.INTO_, 0); }
		public TerminalNode IS_() { return getToken(SQLiteParser.IS_, 0); }
		public TerminalNode ISNULL_() { return getToken(SQLiteParser.ISNULL_, 0); }
		public TerminalNode JOIN_() { return getToken(SQLiteParser.JOIN_, 0); }
		public TerminalNode KEY_() { return getToken(SQLiteParser.KEY_, 0); }
		public TerminalNode LEFT_() { return getToken(SQLiteParser.LEFT_, 0); }
		public TerminalNode LIKE_() { return getToken(SQLiteParser.LIKE_, 0); }
		public TerminalNode LIMIT_() { return getToken(SQLiteParser.LIMIT_, 0); }
		public TerminalNode MATCH_() { return getToken(SQLiteParser.MATCH_, 0); }
		public TerminalNode NATURAL_() { return getToken(SQLiteParser.NATURAL_, 0); }
		public TerminalNode NO_() { return getToken(SQLiteParser.NO_, 0); }
		public TerminalNode NOT_() { return getToken(SQLiteParser.NOT_, 0); }
		public TerminalNode NOTNULL_() { return getToken(SQLiteParser.NOTNULL_, 0); }
		public TerminalNode NULL_() { return getToken(SQLiteParser.NULL_, 0); }
		public TerminalNode OF_() { return getToken(SQLiteParser.OF_, 0); }
		public TerminalNode OFFSET_() { return getToken(SQLiteParser.OFFSET_, 0); }
		public TerminalNode ON_() { return getToken(SQLiteParser.ON_, 0); }
		public TerminalNode OR_() { return getToken(SQLiteParser.OR_, 0); }
		public TerminalNode ORDER_() { return getToken(SQLiteParser.ORDER_, 0); }
		public TerminalNode OUTER_() { return getToken(SQLiteParser.OUTER_, 0); }
		public TerminalNode PLAN_() { return getToken(SQLiteParser.PLAN_, 0); }
		public TerminalNode PRAGMA_() { return getToken(SQLiteParser.PRAGMA_, 0); }
		public TerminalNode PRIMARY_() { return getToken(SQLiteParser.PRIMARY_, 0); }
		public TerminalNode QUERY_() { return getToken(SQLiteParser.QUERY_, 0); }
		public TerminalNode RAISE_() { return getToken(SQLiteParser.RAISE_, 0); }
		public TerminalNode RECURSIVE_() { return getToken(SQLiteParser.RECURSIVE_, 0); }
		public TerminalNode REFERENCES_() { return getToken(SQLiteParser.REFERENCES_, 0); }
		public TerminalNode REGEXP_() { return getToken(SQLiteParser.REGEXP_, 0); }
		public TerminalNode REINDEX_() { return getToken(SQLiteParser.REINDEX_, 0); }
		public TerminalNode RELEASE_() { return getToken(SQLiteParser.RELEASE_, 0); }
		public TerminalNode RENAME_() { return getToken(SQLiteParser.RENAME_, 0); }
		public TerminalNode REPLACE_() { return getToken(SQLiteParser.REPLACE_, 0); }
		public TerminalNode RESTRICT_() { return getToken(SQLiteParser.RESTRICT_, 0); }
		public TerminalNode RIGHT_() { return getToken(SQLiteParser.RIGHT_, 0); }
		public TerminalNode ROLLBACK_() { return getToken(SQLiteParser.ROLLBACK_, 0); }
		public TerminalNode ROW_() { return getToken(SQLiteParser.ROW_, 0); }
		public TerminalNode ROWS_() { return getToken(SQLiteParser.ROWS_, 0); }
		public TerminalNode SAVEPOINT_() { return getToken(SQLiteParser.SAVEPOINT_, 0); }
		public TerminalNode SELECT_() { return getToken(SQLiteParser.SELECT_, 0); }
		public TerminalNode SET_() { return getToken(SQLiteParser.SET_, 0); }
		public TerminalNode TABLE_() { return getToken(SQLiteParser.TABLE_, 0); }
		public TerminalNode TEMP_() { return getToken(SQLiteParser.TEMP_, 0); }
		public TerminalNode TEMPORARY_() { return getToken(SQLiteParser.TEMPORARY_, 0); }
		public TerminalNode THEN_() { return getToken(SQLiteParser.THEN_, 0); }
		public TerminalNode TO_() { return getToken(SQLiteParser.TO_, 0); }
		public TerminalNode TRANSACTION_() { return getToken(SQLiteParser.TRANSACTION_, 0); }
		public TerminalNode TRIGGER_() { return getToken(SQLiteParser.TRIGGER_, 0); }
		public TerminalNode UNION_() { return getToken(SQLiteParser.UNION_, 0); }
		public TerminalNode UNIQUE_() { return getToken(SQLiteParser.UNIQUE_, 0); }
		public TerminalNode UPDATE_() { return getToken(SQLiteParser.UPDATE_, 0); }
		public TerminalNode USING_() { return getToken(SQLiteParser.USING_, 0); }
		public TerminalNode VACUUM_() { return getToken(SQLiteParser.VACUUM_, 0); }
		public TerminalNode VALUES_() { return getToken(SQLiteParser.VALUES_, 0); }
		public TerminalNode VIEW_() { return getToken(SQLiteParser.VIEW_, 0); }
		public TerminalNode VIRTUAL_() { return getToken(SQLiteParser.VIRTUAL_, 0); }
		public TerminalNode WHEN_() { return getToken(SQLiteParser.WHEN_, 0); }
		public TerminalNode WHERE_() { return getToken(SQLiteParser.WHERE_, 0); }
		public TerminalNode WITH_() { return getToken(SQLiteParser.WITH_, 0); }
		public TerminalNode WITHOUT_() { return getToken(SQLiteParser.WITHOUT_, 0); }
		public TerminalNode FIRST_VALUE_() { return getToken(SQLiteParser.FIRST_VALUE_, 0); }
		public TerminalNode OVER_() { return getToken(SQLiteParser.OVER_, 0); }
		public TerminalNode PARTITION_() { return getToken(SQLiteParser.PARTITION_, 0); }
		public TerminalNode RANGE_() { return getToken(SQLiteParser.RANGE_, 0); }
		public TerminalNode PRECEDING_() { return getToken(SQLiteParser.PRECEDING_, 0); }
		public TerminalNode UNBOUNDED_() { return getToken(SQLiteParser.UNBOUNDED_, 0); }
		public TerminalNode CURRENT_() { return getToken(SQLiteParser.CURRENT_, 0); }
		public TerminalNode FOLLOWING_() { return getToken(SQLiteParser.FOLLOWING_, 0); }
		public TerminalNode CUME_DIST_() { return getToken(SQLiteParser.CUME_DIST_, 0); }
		public TerminalNode DENSE_RANK_() { return getToken(SQLiteParser.DENSE_RANK_, 0); }
		public TerminalNode LAG_() { return getToken(SQLiteParser.LAG_, 0); }
		public TerminalNode LAST_VALUE_() { return getToken(SQLiteParser.LAST_VALUE_, 0); }
		public TerminalNode LEAD_() { return getToken(SQLiteParser.LEAD_, 0); }
		public TerminalNode NTH_VALUE_() { return getToken(SQLiteParser.NTH_VALUE_, 0); }
		public TerminalNode NTILE_() { return getToken(SQLiteParser.NTILE_, 0); }
		public TerminalNode PERCENT_RANK_() { return getToken(SQLiteParser.PERCENT_RANK_, 0); }
		public TerminalNode RANK_() { return getToken(SQLiteParser.RANK_, 0); }
		public TerminalNode ROW_NUMBER_() { return getToken(SQLiteParser.ROW_NUMBER_, 0); }
		public TerminalNode GENERATED_() { return getToken(SQLiteParser.GENERATED_, 0); }
		public TerminalNode ALWAYS_() { return getToken(SQLiteParser.ALWAYS_, 0); }
		public TerminalNode STORED_() { return getToken(SQLiteParser.STORED_, 0); }
		public TerminalNode TRUE_() { return getToken(SQLiteParser.TRUE_, 0); }
		public TerminalNode FALSE_() { return getToken(SQLiteParser.FALSE_, 0); }
		public TerminalNode WINDOW_() { return getToken(SQLiteParser.WINDOW_, 0); }
		public TerminalNode NULLS_() { return getToken(SQLiteParser.NULLS_, 0); }
		public TerminalNode FIRST_() { return getToken(SQLiteParser.FIRST_, 0); }
		public TerminalNode LAST_() { return getToken(SQLiteParser.LAST_, 0); }
		public TerminalNode FILTER_() { return getToken(SQLiteParser.FILTER_, 0); }
		public TerminalNode GROUPS_() { return getToken(SQLiteParser.GROUPS_, 0); }
		public TerminalNode EXCLUDE_() { return getToken(SQLiteParser.EXCLUDE_, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -33554432L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1152921504606846977L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 9007199254740991L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSchema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitWindow_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilenameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitFilename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_window_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Base_window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterBase_window_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitBase_window_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitBase_window_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_window_nameContext base_window_name() throws RecognitionException {
		Base_window_nameContext _localctx = new Base_window_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_base_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Simple_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterSimple_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitSimple_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitSimple_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_funcContext simple_func() throws RecognitionException {
		Simple_funcContext _localctx = new Simple_funcContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_simple_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_funcContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAggregate_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAggregate_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAggregate_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_aggregate_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterTable_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitTable_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitTable_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteParserListener ) ((SQLiteParserListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteParserVisitor ) return ((SQLiteParserVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_any_name);
		try {
			setState(2102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				match(IDENTIFIER);
				}
				break;
			case ABORT_:
			case ACTION_:
			case ADD_:
			case AFTER_:
			case ALL_:
			case ALTER_:
			case ANALYZE_:
			case AND_:
			case AS_:
			case ASC_:
			case ATTACH_:
			case AUTOINCREMENT_:
			case BEFORE_:
			case BEGIN_:
			case BETWEEN_:
			case BY_:
			case CASCADE_:
			case CASE_:
			case CAST_:
			case CHECK_:
			case COLLATE_:
			case COLUMN_:
			case COMMIT_:
			case CONFLICT_:
			case CONSTRAINT_:
			case CREATE_:
			case CROSS_:
			case CURRENT_DATE_:
			case CURRENT_TIME_:
			case CURRENT_TIMESTAMP_:
			case DATABASE_:
			case DEFAULT_:
			case DEFERRABLE_:
			case DEFERRED_:
			case DELETE_:
			case DESC_:
			case DETACH_:
			case DISTINCT_:
			case DROP_:
			case EACH_:
			case ELSE_:
			case END_:
			case ESCAPE_:
			case EXCEPT_:
			case EXCLUSIVE_:
			case EXISTS_:
			case EXPLAIN_:
			case FAIL_:
			case FOR_:
			case FOREIGN_:
			case FROM_:
			case FULL_:
			case GLOB_:
			case GROUP_:
			case HAVING_:
			case IF_:
			case IGNORE_:
			case IMMEDIATE_:
			case IN_:
			case INDEX_:
			case INDEXED_:
			case INITIALLY_:
			case INNER_:
			case INSERT_:
			case INSTEAD_:
			case INTERSECT_:
			case INTO_:
			case IS_:
			case ISNULL_:
			case JOIN_:
			case KEY_:
			case LEFT_:
			case LIKE_:
			case LIMIT_:
			case MATCH_:
			case NATURAL_:
			case NO_:
			case NOT_:
			case NOTNULL_:
			case NULL_:
			case OF_:
			case OFFSET_:
			case ON_:
			case OR_:
			case ORDER_:
			case OUTER_:
			case PLAN_:
			case PRAGMA_:
			case PRIMARY_:
			case QUERY_:
			case RAISE_:
			case RECURSIVE_:
			case REFERENCES_:
			case REGEXP_:
			case REINDEX_:
			case RELEASE_:
			case RENAME_:
			case REPLACE_:
			case RESTRICT_:
			case RIGHT_:
			case ROLLBACK_:
			case ROW_:
			case ROWS_:
			case SAVEPOINT_:
			case SELECT_:
			case SET_:
			case TABLE_:
			case TEMP_:
			case TEMPORARY_:
			case THEN_:
			case TO_:
			case TRANSACTION_:
			case TRIGGER_:
			case UNION_:
			case UNIQUE_:
			case UPDATE_:
			case USING_:
			case VACUUM_:
			case VALUES_:
			case VIEW_:
			case VIRTUAL_:
			case WHEN_:
			case WHERE_:
			case WITH_:
			case WITHOUT_:
			case FIRST_VALUE_:
			case OVER_:
			case PARTITION_:
			case RANGE_:
			case PRECEDING_:
			case UNBOUNDED_:
			case CURRENT_:
			case FOLLOWING_:
			case CUME_DIST_:
			case DENSE_RANK_:
			case LAG_:
			case LAST_VALUE_:
			case LEAD_:
			case NTH_VALUE_:
			case NTILE_:
			case PERCENT_RANK_:
			case RANK_:
			case ROW_NUMBER_:
			case GENERATED_:
			case ALWAYS_:
			case STORED_:
			case TRUE_:
			case FALSE_:
			case WINDOW_:
			case NULLS_:
			case FIRST_:
			case LAST_:
			case FILTER_:
			case GROUPS_:
			case EXCLUDE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2097);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2098);
				match(OPEN_PAR);
				setState(2099);
				any_name();
				setState(2100);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c1\u0839\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0001\u0000"+
		"\u0005\u0000\u00fa\b\u0000\n\u0000\f\u0000\u00fd\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001\u0102\b\u0001\n\u0001\f\u0001\u0105\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0109\b\u0001\u000b\u0001\f\u0001"+
		"\u010a\u0001\u0001\u0005\u0001\u010e\b\u0001\n\u0001\f\u0001\u0111\t\u0001"+
		"\u0001\u0001\u0005\u0001\u0114\b\u0001\n\u0001\f\u0001\u0117\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u011c\b\u0002\u0003\u0002\u011e"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0138\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u013f\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0146\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u014c\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0150\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0155\b\u0003\u0001\u0003\u0003\u0003\u0158\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u015f\b\u0004"+
		"\u0001\u0004\u0003\u0004\u0162\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0166\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u016e\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0172\b\u0006\u0003\u0006\u0174\b\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0178\b\u0007\u0001\b\u0001\b\u0003\b\u017c\b\b\u0001\b\u0001\b"+
		"\u0003\b\u0180\b\b\u0001\b\u0003\b\u0183\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0003\n\u018a\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0190\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0196\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u019b"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u01a4\b\u000b\n\u000b\f\u000b\u01a7\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01ac\b\u000b\u0001\f"+
		"\u0001\f\u0003\f\u01b0\b\f\u0001\f\u0001\f\u0003\f\u01b4\b\f\u0001\f\u0003"+
		"\f\u01b7\b\f\u0001\r\u0001\r\u0003\r\u01bb\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u01c1\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u01c6\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01cd\b\r\n\r\f\r\u01d0\t\r"+
		"\u0001\r\u0001\r\u0005\r\u01d4\b\r\n\r\f\r\u01d7\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u01dc\b\r\u0001\r\u0001\r\u0003\r\u01e0\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01e4\b\u000e\u0001\u000e\u0005\u000e\u01e7\b\u000e"+
		"\n\u000e\f\u000e\u01ea\t\u000e\u0001\u000f\u0004\u000f\u01ed\b\u000f\u000b"+
		"\u000f\f\u000f\u01ee\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01fb\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u01ff\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0204\b\u0010\u0001\u0010"+
		"\u0003\u0010\u0207\b\u0010\u0001\u0010\u0003\u0010\u020a\b\u0010\u0001"+
		"\u0010\u0003\u0010\u020d\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0211"+
		"\b\u0010\u0001\u0010\u0003\u0010\u0214\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0222\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0229\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0230\b\u0010\u0003\u0010\u0232\b\u0010\u0001\u0011\u0003"+
		"\u0011\u0235\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u023b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0240"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0246"+
		"\b\u0012\n\u0012\f\u0012\u0249\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u024d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u025a\b\u0012\n\u0012\f\u0012\u025d\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0262\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u026a\b\u0013\n"+
		"\u0013\f\u0013\u026d\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0271"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u027b\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u027f\b\u0013\n\u0013\f\u0013\u0282\t\u0013\u0001\u0013"+
		"\u0003\u0013\u0285\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u028a\b\u0013\u0003\u0013\u028c\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0294\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u029a\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u029f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u02a6\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u02af\b\u0015\n\u0015\f\u0015\u02b2\t\u0015\u0003\u0015"+
		"\u02b4\b\u0015\u0003\u0015\u02b6\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u02bd\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u02c1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u02c8\b\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u02cc\b\u0015\u000b\u0015\f\u0015\u02cd\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u02d4\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u02da\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u02df\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u02e6\b\u0016\n\u0016\f\u0016\u02e9"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u02ed\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u02f8\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u02fd\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0306\b\u0017"+
		"\n\u0017\f\u0017\u0309\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u030d"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0311\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u031f\b\u0018\n\u0018\f\u0018\u0322\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0329\b\u0019\n\u0019\f\u0019"+
		"\u032c\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0330\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0338\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0342\b\u001b\n"+
		"\u001b\f\u001b\u0345\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0349"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0003\u001c\u0351\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0358\b\u001c\u0001\u001c\u0003\u001c\u035b"+
		"\b\u001c\u0001\u001d\u0003\u001d\u035e\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0365\b\u001d\u0001\u001d"+
		"\u0003\u001d\u0368\b\u001d\u0001\u001d\u0003\u001d\u036b\b\u001d\u0001"+
		"\u001d\u0003\u001d\u036e\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0372"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u037a\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u037f\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0389\b \u0001 \u0001 \u0001 \u0003 \u038e\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0397\b \u0001 \u0001"+
		" \u0001 \u0005 \u039c\b \n \f \u039f\t \u0001 \u0003 \u03a2\b \u0001 "+
		"\u0001 \u0003 \u03a6\b \u0001 \u0003 \u03a9\b \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u03af\b \n \f \u03b2\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u03be\b \u0001 \u0003 \u03c1\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u03c9\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0004 \u03d0\b \u000b \f \u03d1\u0001 \u0001 \u0003 \u03d6"+
		"\b \u0001 \u0001 \u0001 \u0003 \u03db\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u03fb\b \u0001 \u0001 \u0001"+
		" \u0003 \u0400\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u040c\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0412"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u041a\b \u0001 \u0001"+
		" \u0003 \u041e\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0426"+
		"\b \n \f \u0429\t \u0003 \u042b\b \u0001 \u0001 \u0001 \u0001 \u0003 "+
		"\u0431\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0437\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u043e\b \n \f \u0441\t \u0003 \u0443\b \u0001 "+
		"\u0001 \u0003 \u0447\b \u0005 \u0449\b \n \f \u044c\t \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u045c\b\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u046a\b&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u0474\b(\n"+
		"(\f(\u0477\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u047f\b"+
		")\n)\f)\u0482\t)\u0001*\u0003*\u0485\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u048c\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0492\b*\u0001*\u0001"+
		"*\u0001*\u0003*\u0497\b*\u0001*\u0001*\u0001*\u0001*\u0005*\u049d\b*\n"+
		"*\f*\u04a0\t*\u0001*\u0001*\u0003*\u04a4\b*\u0001*\u0001*\u0003*\u04a8"+
		"\b*\u0001*\u0003*\u04ab\b*\u0001*\u0001*\u0003*\u04af\b*\u0001*\u0003"+
		"*\u04b2\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u04b8\b+\n+\f+\u04bb\t+"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u04c3\b,\n,\f,\u04c6"+
		"\t,\u0001,\u0001,\u0001,\u0003,\u04cb\b,\u0003,\u04cd\b,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u04d5\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u04dc\b,\u0001,\u0001,\u0001,\u0005,\u04e1\b,\n,\f,\u04e4"+
		"\t,\u0001,\u0001,\u0003,\u04e8\b,\u0003,\u04ea\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u04f0\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u04f9\b-\u0001.\u0001.\u0001.\u0003.\u04fe\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0505\b/\u0001/\u0001/\u0003/\u0509\b/\u0003/\u050b"+
		"\b/\u00010\u00030\u050e\b0\u00010\u00010\u00010\u00010\u00050\u0514\b"+
		"0\n0\f0\u0517\t0\u00010\u00030\u051a\b0\u00010\u00030\u051d\b0\u00011"+
		"\u00011\u00011\u00011\u00031\u0523\b1\u00051\u0525\b1\n1\f1\u0528\t1\u0001"+
		"2\u00012\u00032\u052c\b2\u00012\u00012\u00012\u00052\u0531\b2\n2\f2\u0534"+
		"\t2\u00012\u00012\u00012\u00012\u00052\u053a\b2\n2\f2\u053d\t2\u00012"+
		"\u00032\u0540\b2\u00032\u0542\b2\u00012\u00032\u0545\b2\u00012\u00012"+
		"\u00032\u0549\b2\u00032\u054b\b2\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00052\u0556\b2\n2\f2\u0559\t2\u00032\u055b\b2"+
		"\u00012\u00032\u055e\b2\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00054\u0568\b4\n4\f4\u056b\t4\u00015\u00015\u00015\u00016\u0001"+
		"6\u00017\u00037\u0573\b7\u00017\u00017\u00037\u0577\b7\u00017\u00037\u057a"+
		"\b7\u00018\u00038\u057d\b8\u00018\u00018\u00018\u00038\u0582\b8\u0001"+
		"8\u00018\u00038\u0586\b8\u00018\u00048\u0589\b8\u000b8\f8\u058a\u0001"+
		"8\u00038\u058e\b8\u00018\u00038\u0591\b8\u00019\u00019\u00019\u00039\u0596"+
		"\b9\u00019\u00019\u00039\u059a\b9\u00019\u00039\u059d\b9\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u05a4\b9\u00019\u00019\u00019\u00039\u05a9"+
		"\b9\u00019\u00019\u00019\u00019\u00019\u00059\u05b0\b9\n9\f9\u05b3\t9"+
		"\u00019\u00019\u00039\u05b7\b9\u00019\u00039\u05ba\b9\u00019\u00019\u0001"+
		"9\u00019\u00059\u05c0\b9\n9\f9\u05c3\t9\u00019\u00039\u05c6\b9\u00019"+
		"\u00019\u00019\u00039\u05cb\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u05d1"+
		"\b:\u0001:\u0003:\u05d4\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u05dd\b;\u0001;\u0003;\u05e0\b;\u0003;\u05e2\b;\u0001<\u0001"+
		"<\u0001=\u0001=\u0003=\u05e8\b=\u0001=\u0001=\u0003=\u05ec\b=\u0001=\u0001"+
		"=\u0003=\u05f0\b=\u0001=\u0003=\u05f3\b=\u0001>\u0001>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0005?\u05fe\b?\n?\f?\u0601\t?\u0001?\u0001"+
		"?\u0003?\u0605\b?\u0001@\u0001@\u0003@\u0609\b@\u0001@\u0001@\u0003@\u060d"+
		"\b@\u0001A\u0003A\u0610\bA\u0001A\u0001A\u0001A\u0003A\u0615\bA\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u061b\bA\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0622\bA\u0001A\u0001A\u0001A\u0005A\u0627\bA\nA\fA\u062a\tA"+
		"\u0001A\u0001A\u0001A\u0001A\u0005A\u0630\bA\nA\fA\u0633\tA\u0001A\u0003"+
		"A\u0636\bA\u0003A\u0638\bA\u0001A\u0001A\u0003A\u063c\bA\u0001A\u0003"+
		"A\u063f\bA\u0001B\u0001B\u0001B\u0001B\u0005B\u0645\bB\nB\fB\u0648\tB"+
		"\u0001B\u0001B\u0001C\u0003C\u064d\bC\u0001C\u0001C\u0001C\u0003C\u0652"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0658\bC\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u065f\bC\u0001C\u0001C\u0001C\u0005C\u0664\bC\nC\fC\u0667"+
		"\tC\u0001C\u0001C\u0003C\u066b\bC\u0001C\u0003C\u066e\bC\u0001C\u0003"+
		"C\u0671\bC\u0001C\u0003C\u0674\bC\u0001D\u0001D\u0001D\u0003D\u0679\b"+
		"D\u0001D\u0001D\u0001D\u0003D\u067e\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0685\bD\u0001E\u0001E\u0003E\u0689\bE\u0001E\u0001E\u0003E\u068d"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0003G\u0697"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u069e\bG\nG\fG\u06a1\tG"+
		"\u0003G\u06a3\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u06aa\bG\n"+
		"G\fG\u06ad\tG\u0001G\u0003G\u06b0\bG\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u06b8\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u06bf"+
		"\bH\nH\fH\u06c2\tH\u0003H\u06c4\bH\u0001H\u0001H\u0001H\u0001H\u0001H"+
		"\u0005H\u06cb\bH\nH\fH\u06ce\tH\u0003H\u06d0\bH\u0001H\u0003H\u06d3\b"+
		"H\u0001H\u0003H\u06d6\bH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u06e0\bI\u0003I\u06e2\bI\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0003J\u06eb\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u06f2\bK\nK\fK\u06f5\tK\u0001K\u0003K\u06f8\bK\u0001K\u0001K\u0001L"+
		"\u0001L\u0001L\u0003L\u06ff\bL\u0001L\u0001L\u0001L\u0005L\u0704\bL\n"+
		"L\fL\u0707\tL\u0001L\u0003L\u070a\bL\u0001L\u0001L\u0003L\u070e\bL\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0005M\u0715\bM\nM\fM\u0718\tM\u0001M\u0003"+
		"M\u071b\bM\u0001M\u0001M\u0003M\u071f\bM\u0001M\u0001M\u0001M\u0003M\u0724"+
		"\bM\u0001N\u0001N\u0003N\u0728\bN\u0001N\u0001N\u0001N\u0005N\u072d\b"+
		"N\nN\fN\u0730\tN\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u0737\bO\n"+
		"O\fO\u073a\tO\u0001P\u0001P\u0001P\u0001P\u0003P\u0740\bP\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0745\bQ\u0001Q\u0003Q\u0748\bQ\u0001Q\u0001Q\u0003Q\u074c"+
		"\bQ\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u075a\bS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0003T\u0766\bT\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0003U\u076f\bU\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0003V\u0778\bV\u0001V\u0001V\u0003V\u077c\bV\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0786\bV\u0001V\u0003"+
		"V\u0789\bV\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0792"+
		"\bV\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u079b\bV\u0001"+
		"V\u0003V\u079e\bV\u0001V\u0001V\u0001V\u0001V\u0003V\u07a4\bV\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0003V\u07b2\bV\u0001V\u0001V\u0003V\u07b6\bV\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u07c1\bV\u0001V\u0001V\u0001"+
		"V\u0003V\u07c6\bV\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001"+
		"Y\u0001Y\u0004Y\u07d1\bY\u000bY\fY\u07d2\u0001Z\u0001Z\u0001Z\u0004Z\u07d8"+
		"\bZ\u000bZ\fZ\u07d9\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0003"+
		"\\\u07e2\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u07e7\b\\\u0005\\\u07e9\b"+
		"\\\n\\\f\\\u07ec\t\\\u0001]\u0001]\u0001^\u0001^\u0001_\u0001_\u0001_"+
		"\u0001_\u0003_\u07f6\b_\u0001`\u0001`\u0001a\u0001a\u0003a\u07fc\ba\u0001"+
		"b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001e\u0001e\u0001f\u0001f\u0001"+
		"g\u0001g\u0001h\u0001h\u0001i\u0001i\u0001j\u0001j\u0001k\u0001k\u0001"+
		"l\u0001l\u0001m\u0001m\u0001n\u0001n\u0001o\u0001o\u0001p\u0001p\u0001"+
		"q\u0001q\u0001r\u0001r\u0001s\u0001s\u0001t\u0001t\u0001u\u0001u\u0001"+
		"v\u0001v\u0001w\u0001w\u0001x\u0001x\u0001y\u0001y\u0001z\u0001z\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003{\u0837\b{\u0001{\u0002"+
		"\u01ce\u01ee\u0001@|\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u0000\u001b\u0003\u0000::EERR\u0002\u0000//BB\u0001\u0000"+
		"\u0085\u0086\u0002\u0000\u0092\u0092\u00ab\u00ab\u0001\u0000\b\t\u0002"+
		"\u0000;;\u008d\u008d\u0002\u000088hh\u0002\u0000::RR\u0005\u0000\u0019"+
		"\u0019HHQQzz~~\u0004\u0000TT\u0084\u0084\u008a\u008a\u0091\u0091\u0002"+
		"\u0000\u0007\u0007\f\r\u0001\u0000\u000e\u0011\u0001\u0000\u0012\u0015"+
		"\u0004\u0000MMaaccvv\u0003\u0000\u0019\u0019HH~~\u0005\u000046hh\u00ac"+
		"\u00ad\u00ba\u00ba\u00bc\u00bd\u0002\u0000\u001d\u001d>>\u0003\u0000\u0080"+
		"\u0080\u009a\u009a\u00b3\u00b3\u0002\u0000\u0005\u0005jj\u0001\u0000\u00b0"+
		"\u00b1\u0002\u0000\"\"<<\u0002\u0000\u0097\u0097\u00a2\u00a2\u0002\u0000"+
		"\u009f\u009f\u00a6\u00a6\u0002\u0000\u00a0\u00a0\u00a7\u00a8\u0002\u0000"+
		"\u00a1\u00a1\u00a3\u00a3\u0002\u0000\u00b9\u00b9\u00bc\u00bc\u0002\u0000"+
		"\u0019{}\u00b4\u094b\u0000\u00fb\u0001\u0000\u0000\u0000\u0002\u0103\u0001"+
		"\u0000\u0000\u0000\u0004\u011d\u0001\u0000\u0000\u0000\u0006\u0139\u0001"+
		"\u0000\u0000\u0000\b\u0159\u0001\u0000\u0000\u0000\n\u0163\u0001\u0000"+
		"\u0000\u0000\f\u016b\u0001\u0000\u0000\u0000\u000e\u0175\u0001\u0000\u0000"+
		"\u0000\u0010\u0179\u0001\u0000\u0000\u0000\u0012\u0184\u0001\u0000\u0000"+
		"\u0000\u0014\u0187\u0001\u0000\u0000\u0000\u0016\u018d\u0001\u0000\u0000"+
		"\u0000\u0018\u01af\u0001\u0000\u0000\u0000\u001a\u01b8\u0001\u0000\u0000"+
		"\u0000\u001c\u01e1\u0001\u0000\u0000\u0000\u001e\u01ec\u0001\u0000\u0000"+
		"\u0000 \u01fe\u0001\u0000\u0000\u0000\"\u0234\u0001\u0000\u0000\u0000"+
		"$\u023a\u0001\u0000\u0000\u0000&\u0263\u0001\u0000\u0000\u0000(\u028d"+
		"\u0001\u0000\u0000\u0000*\u0291\u0001\u0000\u0000\u0000,\u02d1\u0001\u0000"+
		"\u0000\u0000.\u02f1\u0001\u0000\u0000\u00000\u030e\u0001\u0000\u0000\u0000"+
		"2\u0323\u0001\u0000\u0000\u00004\u0331\u0001\u0000\u0000\u00006\u033c"+
		"\u0001\u0000\u0000\u00008\u0350\u0001\u0000\u0000\u0000:\u035d\u0001\u0000"+
		"\u0000\u0000<\u036f\u0001\u0000\u0000\u0000>\u0375\u0001\u0000\u0000\u0000"+
		"@\u03da\u0001\u0000\u0000\u0000B\u044d\u0001\u0000\u0000\u0000D\u045b"+
		"\u0001\u0000\u0000\u0000F\u045d\u0001\u0000\u0000\u0000H\u045f\u0001\u0000"+
		"\u0000\u0000J\u0461\u0001\u0000\u0000\u0000L\u0463\u0001\u0000\u0000\u0000"+
		"N\u046d\u0001\u0000\u0000\u0000P\u046f\u0001\u0000\u0000\u0000R\u047a"+
		"\u0001\u0000\u0000\u0000T\u0484\u0001\u0000\u0000\u0000V\u04b3\u0001\u0000"+
		"\u0000\u0000X\u04bc\u0001\u0000\u0000\u0000Z\u04eb\u0001\u0000\u0000\u0000"+
		"\\\u04fd\u0001\u0000\u0000\u0000^\u04ff\u0001\u0000\u0000\u0000`\u050d"+
		"\u0001\u0000\u0000\u0000b\u051e\u0001\u0000\u0000\u0000d\u055d\u0001\u0000"+
		"\u0000\u0000f\u055f\u0001\u0000\u0000\u0000h\u0562\u0001\u0000\u0000\u0000"+
		"j\u056c\u0001\u0000\u0000\u0000l\u056f\u0001\u0000\u0000\u0000n\u0572"+
		"\u0001\u0000\u0000\u0000p\u057c\u0001\u0000\u0000\u0000r\u05ca\u0001\u0000"+
		"\u0000\u0000t\u05cc\u0001\u0000\u0000\u0000v\u05e1\u0001\u0000\u0000\u0000"+
		"x\u05e3\u0001\u0000\u0000\u0000z\u05f2\u0001\u0000\u0000\u0000|\u05f4"+
		"\u0001\u0000\u0000\u0000~\u0604\u0001\u0000\u0000\u0000\u0080\u060c\u0001"+
		"\u0000\u0000\u0000\u0082\u060f\u0001\u0000\u0000\u0000\u0084\u0640\u0001"+
		"\u0000\u0000\u0000\u0086\u064c\u0001\u0000\u0000\u0000\u0088\u0678\u0001"+
		"\u0000\u0000\u0000\u008a\u0686\u0001\u0000\u0000\u0000\u008c\u068e\u0001"+
		"\u0000\u0000\u0000\u008e\u0694\u0001\u0000\u0000\u0000\u0090\u06b3\u0001"+
		"\u0000\u0000\u0000\u0092\u06d7\u0001\u0000\u0000\u0000\u0094\u06e3\u0001"+
		"\u0000\u0000\u0000\u0096\u06ec\u0001\u0000\u0000\u0000\u0098\u06fb\u0001"+
		"\u0000\u0000\u0000\u009a\u070f\u0001\u0000\u0000\u0000\u009c\u0725\u0001"+
		"\u0000\u0000\u0000\u009e\u0731\u0001\u0000\u0000\u0000\u00a0\u073b\u0001"+
		"\u0000\u0000\u0000\u00a2\u0741\u0001\u0000\u0000\u0000\u00a4\u074d\u0001"+
		"\u0000\u0000\u0000\u00a6\u0759\u0001\u0000\u0000\u0000\u00a8\u0765\u0001"+
		"\u0000\u0000\u0000\u00aa\u076e\u0001\u0000\u0000\u0000\u00ac\u07c5\u0001"+
		"\u0000\u0000\u0000\u00ae\u07c7\u0001\u0000\u0000\u0000\u00b0\u07ca\u0001"+
		"\u0000\u0000\u0000\u00b2\u07cd\u0001\u0000\u0000\u0000\u00b4\u07d4\u0001"+
		"\u0000\u0000\u0000\u00b6\u07db\u0001\u0000\u0000\u0000\u00b8\u07df\u0001"+
		"\u0000\u0000\u0000\u00ba\u07ed\u0001\u0000\u0000\u0000\u00bc\u07ef\u0001"+
		"\u0000\u0000\u0000\u00be\u07f5\u0001\u0000\u0000\u0000\u00c0\u07f7\u0001"+
		"\u0000\u0000\u0000\u00c2\u07fb\u0001\u0000\u0000\u0000\u00c4\u07fd\u0001"+
		"\u0000\u0000\u0000\u00c6\u07ff\u0001\u0000\u0000\u0000\u00c8\u0801\u0001"+
		"\u0000\u0000\u0000\u00ca\u0803\u0001\u0000\u0000\u0000\u00cc\u0805\u0001"+
		"\u0000\u0000\u0000\u00ce\u0807\u0001\u0000\u0000\u0000\u00d0\u0809\u0001"+
		"\u0000\u0000\u0000\u00d2\u080b\u0001\u0000\u0000\u0000\u00d4\u080d\u0001"+
		"\u0000\u0000\u0000\u00d6\u080f\u0001\u0000\u0000\u0000\u00d8\u0811\u0001"+
		"\u0000\u0000\u0000\u00da\u0813\u0001\u0000\u0000\u0000\u00dc\u0815\u0001"+
		"\u0000\u0000\u0000\u00de\u0817\u0001\u0000\u0000\u0000\u00e0\u0819\u0001"+
		"\u0000\u0000\u0000\u00e2\u081b\u0001\u0000\u0000\u0000\u00e4\u081d\u0001"+
		"\u0000\u0000\u0000\u00e6\u081f\u0001\u0000\u0000\u0000\u00e8\u0821\u0001"+
		"\u0000\u0000\u0000\u00ea\u0823\u0001\u0000\u0000\u0000\u00ec\u0825\u0001"+
		"\u0000\u0000\u0000\u00ee\u0827\u0001\u0000\u0000\u0000\u00f0\u0829\u0001"+
		"\u0000\u0000\u0000\u00f2\u082b\u0001\u0000\u0000\u0000\u00f4\u082d\u0001"+
		"\u0000\u0000\u0000\u00f6\u0836\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003"+
		"\u0002\u0001\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005\u0000\u0000\u0001\u00ff\u0001\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0005\u0001\u0000\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u010f\u0003"+
		"\u0004\u0002\u0000\u0107\u0109\u0005\u0001\u0000\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0003\u0004\u0002\u0000\u010d\u0108\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0115\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u0005"+
		"\u0001\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0003\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0005G\u0000\u0000\u0119\u011a\u0005r\u0000"+
		"\u0000\u011a\u011c\u0005o\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000"+
		"\u011d\u0118\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0137\u0001\u0000\u0000\u0000\u011f\u0138\u0003\u0006\u0003\u0000"+
		"\u0120\u0138\u0003\b\u0004\u0000\u0121\u0138\u0003\n\u0005\u0000\u0122"+
		"\u0138\u0003\f\u0006\u0000\u0123\u0138\u0003\u000e\u0007\u0000\u0124\u0138"+
		"\u0003\u0016\u000b\u0000\u0125\u0138\u0003\u001a\r\u0000\u0126\u0138\u0003"+
		"*\u0015\u0000\u0127\u0138\u0003,\u0016\u0000\u0128\u0138\u0003.\u0017"+
		"\u0000\u0129\u0138\u00038\u001c\u0000\u012a\u0138\u0003:\u001d\u0000\u012b"+
		"\u0138\u0003<\u001e\u0000\u012c\u0138\u0003>\u001f\u0000\u012d\u0138\u0003"+
		"T*\u0000\u012e\u0138\u0003Z-\u0000\u012f\u0138\u0003^/\u0000\u0130\u0138"+
		"\u0003\u0014\n\u0000\u0131\u0138\u0003\u0010\b\u0000\u0132\u0138\u0003"+
		"\u0012\t\u0000\u0133\u0138\u0003`0\u0000\u0134\u0138\u0003\u0082A\u0000"+
		"\u0135\u0138\u0003\u0086C\u0000\u0136\u0138\u0003\u008aE\u0000\u0137\u011f"+
		"\u0001\u0000\u0000\u0000\u0137\u0120\u0001\u0000\u0000\u0000\u0137\u0121"+
		"\u0001\u0000\u0000\u0000\u0137\u0122\u0001\u0000\u0000\u0000\u0137\u0123"+
		"\u0001\u0000\u0000\u0000\u0137\u0124\u0001\u0000\u0000\u0000\u0137\u0125"+
		"\u0001\u0000\u0000\u0000\u0137\u0126\u0001\u0000\u0000\u0000\u0137\u0127"+
		"\u0001\u0000\u0000\u0000\u0137\u0128\u0001\u0000\u0000\u0000\u0137\u0129"+
		"\u0001\u0000\u0000\u0000\u0137\u012a\u0001\u0000\u0000\u0000\u0137\u012b"+
		"\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012d"+
		"\u0001\u0000\u0000\u0000\u0137\u012e\u0001\u0000\u0000\u0000\u0137\u012f"+
		"\u0001\u0000\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0131"+
		"\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000\u0000\u0137\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0005"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001e\u0000\u0000\u013a\u013e"+
		"\u0005\u0084\u0000\u0000\u013b\u013c\u0003\u00ccf\u0000\u013c\u013d\u0005"+
		"\u0002\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0157\u0003\u00ceg\u0000\u0141\u014b\u0005y\u0000"+
		"\u0000\u0142\u0143\u0005\u0088\u0000\u0000\u0143\u014c\u0003\u00ceg\u0000"+
		"\u0144\u0146\u0005.\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0003\u00d2i\u0000\u0148\u0149\u0005\u0088\u0000\u0000\u0149\u014a"+
		"\u0003\u00d2i\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0142\u0001"+
		"\u0000\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014c\u0158\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0005\u001b\u0000\u0000\u014e\u0150\u0005"+
		".\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0158\u0003\u001c"+
		"\u000e\u0000\u0152\u0154\u0005?\u0000\u0000\u0153\u0155\u0005.\u0000\u0000"+
		"\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0003\u00d2i\u0000\u0157"+
		"\u0141\u0001\u0000\u0000\u0000\u0157\u014d\u0001\u0000\u0000\u0000\u0157"+
		"\u0152\u0001\u0000\u0000\u0000\u0158\u0007\u0001\u0000\u0000\u0000\u0159"+
		"\u0161\u0005\u001f\u0000\u0000\u015a\u0162\u0003\u00ccf\u0000\u015b\u015c"+
		"\u0003\u00ccf\u0000\u015c\u015d\u0005\u0002\u0000\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0003"+
		"\u00d0h\u0000\u0161\u015a\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\t\u0001\u0000\u0000"+
		"\u0000\u0163\u0165\u0005#\u0000\u0000\u0164\u0166\u00057\u0000\u0000\u0165"+
		"\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0003@ \u0000\u0168\u0169\u0005"+
		"!\u0000\u0000\u0169\u016a\u0003\u00ccf\u0000\u016a\u000b\u0001\u0000\u0000"+
		"\u0000\u016b\u016d\u0005&\u0000\u0000\u016c\u016e\u0007\u0000\u0000\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u0173\u0001\u0000\u0000\u0000\u016f\u0171\u0005\u0089\u0000\u0000"+
		"\u0170\u0172\u0003\u00e6s\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173"+
		"\u016f\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\r\u0001\u0000\u0000\u0000\u0175\u0177\u0007\u0001\u0000\u0000\u0176\u0178"+
		"\u0005\u0089\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u000f\u0001\u0000\u0000\u0000\u0179\u017b"+
		"\u0005~\u0000\u0000\u017a\u017c\u0005\u0089\u0000\u0000\u017b\u017a\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u0182\u0001"+
		"\u0000\u0000\u0000\u017d\u017f\u0005\u0088\u0000\u0000\u017e\u0180\u0005"+
		"\u0081\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0003"+
		"\u00e2q\u0000\u0182\u017d\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0011\u0001\u0000\u0000\u0000\u0184\u0185\u0005\u0081"+
		"\u0000\u0000\u0185\u0186\u0003\u00e2q\u0000\u0186\u0013\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0005x\u0000\u0000\u0188\u018a\u0005\u0081\u0000\u0000"+
		"\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0003\u00e2q\u0000\u018c"+
		"\u0015\u0001\u0000\u0000\u0000\u018d\u018f\u00052\u0000\u0000\u018e\u0190"+
		"\u0005\u008c\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0195"+
		"\u0005T\u0000\u0000\u0192\u0193\u0005P\u0000\u0000\u0193\u0194\u0005f"+
		"\u0000\u0000\u0194\u0196\u0005F\u0000\u0000\u0195\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u019a\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0003\u00ccf\u0000\u0198\u0199\u0005\u0002\u0000\u0000"+
		"\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0003\u00d8l\u0000\u019d\u019e\u0005k\u0000\u0000\u019e\u019f"+
		"\u0003\u00ceg\u0000\u019f\u01a0\u0005\u0003\u0000\u0000\u01a0\u01a5\u0003"+
		"\u0018\f\u0000\u01a1\u01a2\u0005\u0005\u0000\u0000\u01a2\u01a4\u0003\u0018"+
		"\f\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ab\u0005\u0004\u0000\u0000\u01a9\u01aa\u0005\u0094\u0000"+
		"\u0000\u01aa\u01ac\u0003@ \u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u0017\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b0\u0003\u00d2i\u0000\u01ae\u01b0\u0003@ \u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005-\u0000\u0000\u01b2\u01b4\u0003\u00d4"+
		"j\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003\u00a4R\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u0019\u0001\u0000\u0000\u0000\u01b8\u01ba\u00052\u0000\u0000\u01b9"+
		"\u01bb\u0007\u0002\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc"+
		"\u01c0\u0005\u0084\u0000\u0000\u01bd\u01be\u0005P\u0000\u0000\u01be\u01bf"+
		"\u0005f\u0000\u0000\u01bf\u01c1\u0005F\u0000\u0000\u01c0\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0003\u00ccf\u0000\u01c3\u01c4\u0005\u0002\u0000"+
		"\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01df\u0003\u00ceg\u0000\u01c8\u01c9\u0005\u0003\u0000\u0000"+
		"\u01c9\u01ce\u0003\u001c\u000e\u0000\u01ca\u01cb\u0005\u0005\u0000\u0000"+
		"\u01cb\u01cd\u0003\u001c\u000e\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0005\u0000\u0000"+
		"\u01d2\u01d4\u0003$\u0012\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0005\u0004\u0000\u0000\u01d9"+
		"\u01da\u0005\u0096\u0000\u0000\u01da\u01dc\u0005\u00b9\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01e0\u0001\u0000\u0000\u0000\u01dd\u01de\u0005!\u0000\u0000\u01de\u01e0"+
		"\u0003`0\u0000\u01df\u01c8\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e0\u001b\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003\u00d2"+
		"i\u0000\u01e2\u01e4\u0003\u001e\u000f\u0000\u01e3\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e7\u0003 \u0010\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u001d\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003\u00c8d\u0000\u01ec"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef"+
		"\u01fa\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0003\u0000\u0000\u01f1"+
		"\u01f2\u0003\"\u0011\u0000\u01f2\u01f3\u0005\u0004\u0000\u0000\u01f3\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000\u01f5\u01f6"+
		"\u0003\"\u0011\u0000\u01f6\u01f7\u0005\u0005\u0000\u0000\u01f7\u01f8\u0003"+
		"\"\u0011\u0000\u01f8\u01f9\u0005\u0004\u0000\u0000\u01f9\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f0\u0001\u0000\u0000\u0000\u01fa\u01f4\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u001f\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u00051\u0000\u0000\u01fd\u01ff\u0003\u00c8d\u0000"+
		"\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0231\u0001\u0000\u0000\u0000\u0200\u0201\u0005q\u0000\u0000\u0201"+
		"\u0203\u0005_\u0000\u0000\u0202\u0204\u0003\u00a4R\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001"+
		"\u0000\u0000\u0000\u0205\u0207\u0003(\u0014\u0000\u0206\u0205\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000"+
		"\u0000\u0000\u0208\u020a\u0005$\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0232\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0005f\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u0211\u0005h\u0000\u0000\u020f\u0211\u0005\u008c\u0000\u0000\u0210"+
		"\u020c\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211"+
		"\u0213\u0001\u0000\u0000\u0000\u0212\u0214\u0003(\u0014\u0000\u0213\u0212"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0232"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005,\u0000\u0000\u0216\u0217\u0005"+
		"\u0003\u0000\u0000\u0217\u0218\u0003@ \u0000\u0218\u0219\u0005\u0004\u0000"+
		"\u0000\u0219\u0232\u0001\u0000\u0000\u0000\u021a\u0221\u00058\u0000\u0000"+
		"\u021b\u0222\u0003\"\u0011\u0000\u021c\u0222\u0003N\'\u0000\u021d\u021e"+
		"\u0005\u0003\u0000\u0000\u021e\u021f\u0003@ \u0000\u021f\u0220\u0005\u0004"+
		"\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021b\u0001\u0000"+
		"\u0000\u0000\u0221\u021c\u0001\u0000\u0000\u0000\u0221\u021d\u0001\u0000"+
		"\u0000\u0000\u0222\u0232\u0001\u0000\u0000\u0000\u0223\u0224\u0005-\u0000"+
		"\u0000\u0224\u0232\u0003\u00d4j\u0000\u0225\u0232\u0003&\u0013\u0000\u0226"+
		"\u0227\u0005\u00a9\u0000\u0000\u0227\u0229\u0005\u00aa\u0000\u0000\u0228"+
		"\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0005!\u0000\u0000\u022b\u022c"+
		"\u0005\u0003\u0000\u0000\u022c\u022d\u0003@ \u0000\u022d\u022f\u0005\u0004"+
		"\u0000\u0000\u022e\u0230\u0007\u0003\u0000\u0000\u022f\u022e\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000"+
		"\u0000\u0000\u0231\u0200\u0001\u0000\u0000\u0000\u0231\u0210\u0001\u0000"+
		"\u0000\u0000\u0231\u0215\u0001\u0000\u0000\u0000\u0231\u021a\u0001\u0000"+
		"\u0000\u0000\u0231\u0223\u0001\u0000\u0000\u0000\u0231\u0225\u0001\u0000"+
		"\u0000\u0000\u0231\u0228\u0001\u0000\u0000\u0000\u0232!\u0001\u0000\u0000"+
		"\u0000\u0233\u0235\u0007\u0004\u0000\u0000\u0234\u0233\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0005\u00ba\u0000\u0000\u0237#\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u00051\u0000\u0000\u0239\u023b\u0003\u00c8d\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0261"+
		"\u0001\u0000\u0000\u0000\u023c\u023d\u0005q\u0000\u0000\u023d\u0240\u0005"+
		"_\u0000\u0000\u023e\u0240\u0005\u008c\u0000\u0000\u023f\u023c\u0001\u0000"+
		"\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0005\u0003\u0000\u0000\u0242\u0247\u0003\u0018"+
		"\f\u0000\u0243\u0244\u0005\u0005\u0000\u0000\u0244\u0246\u0003\u0018\f"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000"+
		"\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000"+
		"\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u024a\u024c\u0005\u0004\u0000\u0000\u024b\u024d\u0003(\u0014\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u0262\u0001\u0000\u0000\u0000\u024e\u024f\u0005,\u0000\u0000\u024f"+
		"\u0250\u0005\u0003\u0000\u0000\u0250\u0251\u0003@ \u0000\u0251\u0252\u0005"+
		"\u0004\u0000\u0000\u0252\u0262\u0001\u0000\u0000\u0000\u0253\u0254\u0005"+
		"J\u0000\u0000\u0254\u0255\u0005_\u0000\u0000\u0255\u0256\u0005\u0003\u0000"+
		"\u0000\u0256\u025b\u0003\u00d2i\u0000\u0257\u0258\u0005\u0005\u0000\u0000"+
		"\u0258\u025a\u0003\u00d2i\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a"+
		"\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0004\u0000\u0000\u025f"+
		"\u0260\u0003&\u0013\u0000\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u023f"+
		"\u0001\u0000\u0000\u0000\u0261\u024e\u0001\u0000\u0000\u0000\u0261\u0253"+
		"\u0001\u0000\u0000\u0000\u0262%\u0001\u0000\u0000\u0000\u0263\u0264\u0005"+
		"u\u0000\u0000\u0264\u0270\u0003\u00d6k\u0000\u0265\u0266\u0005\u0003\u0000"+
		"\u0000\u0266\u026b\u0003\u00d2i\u0000\u0267\u0268\u0005\u0005\u0000\u0000"+
		"\u0268\u026a\u0003\u00d2i\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a"+
		"\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0001\u0000\u0000\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d"+
		"\u026b\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u0004\u0000\u0000\u026f"+
		"\u0271\u0001\u0000\u0000\u0000\u0270\u0265\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u0001\u0000\u0000\u0000\u0271\u0280\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0005k\u0000\u0000\u0273\u027a\u0007\u0005\u0000\u0000\u0274\u0275"+
		"\u0005\u0083\u0000\u0000\u0275\u027b\u0007\u0006\u0000\u0000\u0276\u027b"+
		"\u0005)\u0000\u0000\u0277\u027b\u0005{\u0000\u0000\u0278\u0279\u0005e"+
		"\u0000\u0000\u0279\u027b\u0005\u001a\u0000\u0000\u027a\u0274\u0001\u0000"+
		"\u0000\u0000\u027a\u0276\u0001\u0000\u0000\u0000\u027a\u0277\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027f\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0005c\u0000\u0000\u027d\u027f\u0003\u00c8d\u0000"+
		"\u027e\u0272\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u028b\u0001\u0000\u0000\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0285\u0005f\u0000\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0289\u00059\u0000\u0000\u0287\u0288"+
		"\u0005V\u0000\u0000\u0288\u028a\u0007\u0007\u0000\u0000\u0289\u0287\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001"+
		"\u0000\u0000\u0000\u028b\u0284\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\'\u0001\u0000\u0000\u0000\u028d\u028e\u0005k"+
		"\u0000\u0000\u028e\u028f\u00050\u0000\u0000\u028f\u0290\u0007\b\u0000"+
		"\u0000\u0290)\u0001\u0000\u0000\u0000\u0291\u0293\u00052\u0000\u0000\u0292"+
		"\u0294\u0007\u0002\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		"\u0299\u0005\u008a\u0000\u0000\u0296\u0297\u0005P\u0000\u0000\u0297\u0298"+
		"\u0005f\u0000\u0000\u0298\u029a\u0005F\u0000\u0000\u0299\u0296\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029e\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0003\u00ccf\u0000\u029c\u029d\u0005\u0002\u0000"+
		"\u0000\u029d\u029f\u0001\u0000\u0000\u0000\u029e\u029b\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a5\u0003\u00dam\u0000\u02a1\u02a6\u0005%\u0000\u0000\u02a2"+
		"\u02a6\u0005\u001c\u0000\u0000\u02a3\u02a4\u0005Y\u0000\u0000\u02a4\u02a6"+
		"\u0005i\u0000\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a5\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a6\u02b5\u0001\u0000\u0000\u0000\u02a7\u02b6\u0005"+
		";\u0000\u0000\u02a8\u02b6\u0005X\u0000\u0000\u02a9\u02b3\u0005\u008d\u0000"+
		"\u0000\u02aa\u02ab\u0005i\u0000\u0000\u02ab\u02b0\u0003\u00d2i\u0000\u02ac"+
		"\u02ad\u0005\u0005\u0000\u0000\u02ad\u02af\u0003\u00d2i\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b5\u02a7\u0001\u0000\u0000\u0000\u02b5\u02a8"+
		"\u0001\u0000\u0000\u0000\u02b5\u02a9\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005k\u0000\u0000\u02b8\u02bc\u0003"+
		"\u00ceg\u0000\u02b9\u02ba\u0005I\u0000\u0000\u02ba\u02bb\u0005@\u0000"+
		"\u0000\u02bb\u02bd\u0005\u007f\u0000\u0000\u02bc\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0005\u0093\u0000\u0000\u02bf\u02c1\u0003@ \u0000\u02c0"+
		"\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c2\u0001\u0000\u0000\u0000\u02c2\u02cb\u0005&\u0000\u0000\u02c3\u02c8"+
		"\u0003\u0082A\u0000\u02c4\u02c8\u0003T*\u0000\u02c5\u02c8\u00038\u001c"+
		"\u0000\u02c6\u02c8\u0003`0\u0000\u02c7\u02c3\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0005\u0001\u0000\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb"+
		"\u02c7\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005B\u0000\u0000\u02d0+\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d3\u00052\u0000\u0000\u02d2\u02d4\u0007\u0002"+
		"\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d9\u0005\u0091"+
		"\u0000\u0000\u02d6\u02d7\u0005P\u0000\u0000\u02d7\u02d8\u0005f\u0000\u0000"+
		"\u02d8\u02da\u0005F\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0001\u0000\u0000\u0000\u02da\u02de\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0003\u00ccf\u0000\u02dc\u02dd\u0005\u0002\u0000\u0000\u02dd\u02df"+
		"\u0001\u0000\u0000\u0000\u02de\u02db\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02ec"+
		"\u0003\u00dcn\u0000\u02e1\u02e2\u0005\u0003\u0000\u0000\u02e2\u02e7\u0003"+
		"\u00d2i\u0000\u02e3\u02e4\u0005\u0005\u0000\u0000\u02e4\u02e6\u0003\u00d2"+
		"i\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0005\u0004\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ec\u02e1\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005!\u0000\u0000"+
		"\u02ef\u02f0\u0003`0\u0000\u02f0-\u0001\u0000\u0000\u0000\u02f1\u02f2"+
		"\u00052\u0000\u0000\u02f2\u02f3\u0005\u0092\u0000\u0000\u02f3\u02f7\u0005"+
		"\u0084\u0000\u0000\u02f4\u02f5\u0005P\u0000\u0000\u02f5\u02f6\u0005f\u0000"+
		"\u0000\u02f6\u02f8\u0005F\u0000\u0000\u02f7\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fc\u0001\u0000\u0000\u0000"+
		"\u02f9\u02fa\u0003\u00ccf\u0000\u02fa\u02fb\u0005\u0002\u0000\u0000\u02fb"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fc\u02f9\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0003\u00ceg\u0000\u02ff\u0300\u0005\u008e\u0000\u0000\u0300\u030c"+
		"\u0003\u00deo\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302\u0307\u0003"+
		"\u00c2a\u0000\u0303\u0304\u0005\u0005\u0000\u0000\u0304\u0306\u0003\u00c2"+
		"a\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000"+
		"\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000"+
		"\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0005\u0004\u0000\u0000\u030b\u030d\u0001\u0000\u0000"+
		"\u0000\u030c\u0301\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d/\u0001\u0000\u0000\u0000\u030e\u0310\u0005\u0095\u0000\u0000"+
		"\u030f\u0311\u0005t\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u00032\u0019\u0000\u0313\u0314\u0005!\u0000\u0000\u0314\u0315\u0005"+
		"\u0003\u0000\u0000\u0315\u0316\u0003`0\u0000\u0316\u0320\u0005\u0004\u0000"+
		"\u0000\u0317\u0318\u0005\u0005\u0000\u0000\u0318\u0319\u00032\u0019\u0000"+
		"\u0319\u031a\u0005!\u0000\u0000\u031a\u031b\u0005\u0003\u0000\u0000\u031b"+
		"\u031c\u0003`0\u0000\u031c\u031d\u0005\u0004\u0000\u0000\u031d\u031f\u0001"+
		"\u0000\u0000\u0000\u031e\u0317\u0001\u0000\u0000\u0000\u031f\u0322\u0001"+
		"\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001"+
		"\u0000\u0000\u0000\u03211\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000"+
		"\u0000\u0000\u0323\u032f\u0003\u00ceg\u0000\u0324\u0325\u0005\u0003\u0000"+
		"\u0000\u0325\u032a\u0003\u00d2i\u0000\u0326\u0327\u0005\u0005\u0000\u0000"+
		"\u0327\u0329\u0003\u00d2i\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0329"+
		"\u032c\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c"+
		"\u032a\u0001\u0000\u0000\u0000\u032d\u032e\u0005\u0004\u0000\u0000\u032e"+
		"\u0330\u0001\u0000\u0000\u0000\u032f\u0324\u0001\u0000\u0000\u0000\u032f"+
		"\u0330\u0001\u0000\u0000\u0000\u03303\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u00032\u0019\u0000\u0332\u0333\u0005!\u0000\u0000\u0333\u0334\u0005\u0003"+
		"\u0000\u0000\u0334\u0335\u0003\u00ba]\u0000\u0335\u0337\u0005\u008b\u0000"+
		"\u0000\u0336\u0338\u0005\u001d\u0000\u0000\u0337\u0336\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0003\u00bc^\u0000\u033a\u033b\u0005\u0004\u0000\u0000"+
		"\u033b5\u0001\u0000\u0000\u0000\u033c\u0348\u0003\u00ceg\u0000\u033d\u033e"+
		"\u0005\u0003\u0000\u0000\u033e\u0343\u0003\u00d2i\u0000\u033f\u0340\u0005"+
		"\u0005\u0000\u0000\u0340\u0342\u0003\u00d2i\u0000\u0341\u033f\u0001\u0000"+
		"\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000"+
		"\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0346\u0001\u0000"+
		"\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u0347\u0005\u0004"+
		"\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348\u033d\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000"+
		"\u0000\u0000\u034a\u034b\u0005!\u0000\u0000\u034b\u034c\u0005\u0003\u0000"+
		"\u0000\u034c\u034d\u0003`0\u0000\u034d\u034e\u0005\u0004\u0000\u0000\u034e"+
		"7\u0001\u0000\u0000\u0000\u034f\u0351\u00030\u0018\u0000\u0350\u034f\u0001"+
		"\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0005;\u0000\u0000\u0353\u0354\u0005K\u0000"+
		"\u0000\u0354\u0357\u0003\u0088D\u0000\u0355\u0356\u0005\u0094\u0000\u0000"+
		"\u0356\u0358\u0003@ \u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0001\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000\u0000\u0359\u035b"+
		"\u0003V+\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000"+
		"\u0000\u0000\u035b9\u0001\u0000\u0000\u0000\u035c\u035e\u00030\u0018\u0000"+
		"\u035d\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0005;\u0000\u0000\u0360"+
		"\u0361\u0005K\u0000\u0000\u0361\u0364\u0003\u0088D\u0000\u0362\u0363\u0005"+
		"\u0094\u0000\u0000\u0363\u0365\u0003@ \u0000\u0364\u0362\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0367\u0001\u0000\u0000"+
		"\u0000\u0366\u0368\u0003V+\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0367"+
		"\u0368\u0001\u0000\u0000\u0000\u0368\u036d\u0001\u0000\u0000\u0000\u0369"+
		"\u036b\u0003\u009eO\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e"+
		"\u0003\u00a0P\u0000\u036d\u036a\u0001\u0000\u0000\u0000\u036d\u036e\u0001"+
		"\u0000\u0000\u0000\u036e;\u0001\u0000\u0000\u0000\u036f\u0371\u0005=\u0000"+
		"\u0000\u0370\u0372\u00057\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000"+
		"\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000"+
		"\u0373\u0374\u0003\u00ccf\u0000\u0374=\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0005?\u0000\u0000\u0376\u0379\u0007\t\u0000\u0000\u0377\u0378\u0005"+
		"P\u0000\u0000\u0378\u037a\u0005F\u0000\u0000\u0379\u0377\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037e\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0003\u00ccf\u0000\u037c\u037d\u0005\u0002\u0000\u0000"+
		"\u037d\u037f\u0001\u0000\u0000\u0000\u037e\u037b\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000"+
		"\u0380\u0381\u0003\u00f6{\u0000\u0381?\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0006 \uffff\uffff\u0000\u0383\u03db\u0003N\'\u0000\u0384\u03db\u0005"+
		"\u00bb\u0000\u0000\u0385\u0386\u0003\u00ccf\u0000\u0386\u0387\u0005\u0002"+
		"\u0000\u0000\u0387\u0389\u0001\u0000\u0000\u0000\u0388\u0385\u0001\u0000"+
		"\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u038b\u0003\u00ceg\u0000\u038b\u038c\u0005\u0002\u0000"+
		"\u0000\u038c\u038e\u0001\u0000\u0000\u0000\u038d\u0388\u0001\u0000\u0000"+
		"\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u03db\u0003\u00d2i\u0000\u0390\u0391\u0003\u00be_\u0000\u0391"+
		"\u0392\u0003@ \u0015\u0392\u03db\u0001\u0000\u0000\u0000\u0393\u0394\u0003"+
		"\u00cae\u0000\u0394\u03a1\u0005\u0003\u0000\u0000\u0395\u0397\u0005>\u0000"+
		"\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039d\u0003@ \u0000\u0399"+
		"\u039a\u0005\u0005\u0000\u0000\u039a\u039c\u0003@ \u0000\u039b\u0399\u0001"+
		"\u0000\u0000\u0000\u039c\u039f\u0001\u0000\u0000\u0000\u039d\u039b\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u03a2\u0001"+
		"\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u03a0\u03a2\u0005"+
		"\u0007\u0000\u0000\u03a1\u0396\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a5\u0005\u0004\u0000\u0000\u03a4\u03a6\u0003"+
		"\u008cF\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a8\u0001\u0000\u0000\u0000\u03a7\u03a9\u0003\u0090"+
		"H\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u03db\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\u0003\u0000"+
		"\u0000\u03ab\u03b0\u0003@ \u0000\u03ac\u03ad\u0005\u0005\u0000\u0000\u03ad"+
		"\u03af\u0003@ \u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03af\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b4\u0005\u0004\u0000\u0000\u03b4\u03db\u0001"+
		"\u0000\u0000\u0000\u03b5\u03b6\u0005+\u0000\u0000\u03b6\u03b7\u0005\u0003"+
		"\u0000\u0000\u03b7\u03b8\u0003@ \u0000\u03b8\u03b9\u0005!\u0000\u0000"+
		"\u03b9\u03ba\u0003\u001e\u000f\u0000\u03ba\u03bb\u0005\u0004\u0000\u0000"+
		"\u03bb\u03db\u0001\u0000\u0000\u0000\u03bc\u03be\u0003J%\u0000\u03bd\u03bc"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c1\u0003B!\u0000\u03c0\u03bd\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c3\u0005\u0003\u0000\u0000\u03c3\u03c4\u0003`0\u0000"+
		"\u03c4\u03c5\u0005\u0004\u0000\u0000\u03c5\u03db\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c8\u0005*\u0000\u0000\u03c7\u03c9\u0003@ \u0000\u03c8\u03c7"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cf"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005\u0093\u0000\u0000\u03cb\u03cc"+
		"\u0003@ \u0000\u03cc\u03cd\u0005\u0087\u0000\u0000\u03cd\u03ce\u0003@"+
		" \u0000\u03ce\u03d0\u0001\u0000\u0000\u0000\u03cf\u03ca\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0005A\u0000\u0000\u03d4\u03d6\u0003@ \u0000\u03d5"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6"+
		"\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005B\u0000\u0000\u03d8\u03db"+
		"\u0001\u0000\u0000\u0000\u03d9\u03db\u0003L&\u0000\u03da\u0382\u0001\u0000"+
		"\u0000\u0000\u03da\u0384\u0001\u0000\u0000\u0000\u03da\u038d\u0001\u0000"+
		"\u0000\u0000\u03da\u0390\u0001\u0000\u0000\u0000\u03da\u0393\u0001\u0000"+
		"\u0000\u0000\u03da\u03aa\u0001\u0000\u0000\u0000\u03da\u03b5\u0001\u0000"+
		"\u0000\u0000\u03da\u03c0\u0001\u0000\u0000\u0000\u03da\u03c6\u0001\u0000"+
		"\u0000\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03db\u044a\u0001\u0000"+
		"\u0000\u0000\u03dc\u03dd\n\u0014\u0000\u0000\u03dd\u03de\u0005\u000b\u0000"+
		"\u0000\u03de\u0449\u0003@ \u0015\u03df\u03e0\n\u0013\u0000\u0000\u03e0"+
		"\u03e1\u0007\n\u0000\u0000\u03e1\u0449\u0003@ \u0014\u03e2\u03e3\n\u0012"+
		"\u0000\u0000\u03e3\u03e4\u0007\u0004\u0000\u0000\u03e4\u0449\u0003@ \u0013"+
		"\u03e5\u03e6\n\u0011\u0000\u0000\u03e6\u03e7\u0007\u000b\u0000\u0000\u03e7"+
		"\u0449\u0003@ \u0012\u03e8\u03e9\n\u0010\u0000\u0000\u03e9\u03ea\u0007"+
		"\f\u0000\u0000\u03ea\u0449\u0003@ \u0011\u03eb\u03ec\n\u000f\u0000\u0000"+
		"\u03ec\u03ed\u0003D\"\u0000\u03ed\u03ee\u0003@ \u0010\u03ee\u0449\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\n\u000e\u0000\u0000\u03f0\u03f1\u0003F"+
		"#\u0000\u03f1\u03f2\u0003@ \u000f\u03f2\u0449\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f4\n\r\u0000\u0000\u03f4\u03f5\u0003H$\u0000\u03f5\u03f6\u0003"+
		"@ \u000e\u03f6\u0449\u0001\u0000\u0000\u0000\u03f7\u03f8\n\u0006\u0000"+
		"\u0000\u03f8\u03fa\u0005\\\u0000\u0000\u03f9\u03fb\u0005f\u0000\u0000"+
		"\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u0449\u0003@ \u0007\u03fd\u03ff"+
		"\n\u0005\u0000\u0000\u03fe\u0400\u0003J%\u0000\u03ff\u03fe\u0001\u0000"+
		"\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u0005\'\u0000\u0000\u0402\u0403\u0003@ \u0000"+
		"\u0403\u0404\u0005 \u0000\u0000\u0404\u0405\u0003@ \u0006\u0405\u0449"+
		"\u0001\u0000\u0000\u0000\u0406\u0407\n\t\u0000\u0000\u0407\u0408\u0005"+
		"-\u0000\u0000\u0408\u0449\u0003\u00d4j\u0000\u0409\u040b\n\b\u0000\u0000"+
		"\u040a\u040c\u0003J%\u0000\u040b\u040a\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e"+
		"\u0007\r\u0000\u0000\u040e\u0411\u0003@ \u0000\u040f\u0410\u0005C\u0000"+
		"\u0000\u0410\u0412\u0003@ \u0000\u0411\u040f\u0001\u0000\u0000\u0000\u0411"+
		"\u0412\u0001\u0000\u0000\u0000\u0412\u0449\u0001\u0000\u0000\u0000\u0413"+
		"\u0419\n\u0007\u0000\u0000\u0414\u041a\u0005]\u0000\u0000\u0415\u041a"+
		"\u0005g\u0000\u0000\u0416\u0417\u0003J%\u0000\u0417\u0418\u0005h\u0000"+
		"\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419\u0414\u0001\u0000\u0000"+
		"\u0000\u0419\u0415\u0001\u0000\u0000\u0000\u0419\u0416\u0001\u0000\u0000"+
		"\u0000\u041a\u0449\u0001\u0000\u0000\u0000\u041b\u041d\n\u0004\u0000\u0000"+
		"\u041c\u041e\u0003J%\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0446"+
		"\u0005S\u0000\u0000\u0420\u042a\u0005\u0003\u0000\u0000\u0421\u042b\u0003"+
		"`0\u0000\u0422\u0427\u0003@ \u0000\u0423\u0424\u0005\u0005\u0000\u0000"+
		"\u0424\u0426\u0003@ \u0000\u0425\u0423\u0001\u0000\u0000\u0000\u0426\u0429"+
		"\u0001\u0000\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0427\u0428"+
		"\u0001\u0000\u0000\u0000\u0428\u042b\u0001\u0000\u0000\u0000\u0429\u0427"+
		"\u0001\u0000\u0000\u0000\u042a\u0421\u0001\u0000\u0000\u0000\u042a\u0422"+
		"\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u042c"+
		"\u0001\u0000\u0000\u0000\u042c\u0447\u0005\u0004\u0000\u0000\u042d\u042e"+
		"\u0003\u00ccf\u0000\u042e\u042f\u0005\u0002\u0000\u0000\u042f\u0431\u0001"+
		"\u0000\u0000\u0000\u0430\u042d\u0001\u0000\u0000\u0000\u0430\u0431\u0001"+
		"\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0447\u0003"+
		"\u00ceg\u0000\u0433\u0434\u0003\u00ccf\u0000\u0434\u0435\u0005\u0002\u0000"+
		"\u0000\u0435\u0437\u0001\u0000\u0000\u0000\u0436\u0433\u0001\u0000\u0000"+
		"\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u0439\u0003\u00f4z\u0000\u0439\u0442\u0005\u0003\u0000\u0000"+
		"\u043a\u043f\u0003@ \u0000\u043b\u043c\u0005\u0005\u0000\u0000\u043c\u043e"+
		"\u0003@ \u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043e\u0441\u0001\u0000"+
		"\u0000\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000"+
		"\u0000\u0000\u0440\u0443\u0001\u0000\u0000\u0000\u0441\u043f\u0001\u0000"+
		"\u0000\u0000\u0442\u043a\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0445\u0005\u0004"+
		"\u0000\u0000\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0420\u0001\u0000"+
		"\u0000\u0000\u0446\u0430\u0001\u0000\u0000\u0000\u0446\u0436\u0001\u0000"+
		"\u0000\u0000\u0447\u0449\u0001\u0000\u0000\u0000\u0448\u03dc\u0001\u0000"+
		"\u0000\u0000\u0448\u03df\u0001\u0000\u0000\u0000\u0448\u03e2\u0001\u0000"+
		"\u0000\u0000\u0448\u03e5\u0001\u0000\u0000\u0000\u0448\u03e8\u0001\u0000"+
		"\u0000\u0000\u0448\u03eb\u0001\u0000\u0000\u0000\u0448\u03ef\u0001\u0000"+
		"\u0000\u0000\u0448\u03f3\u0001\u0000\u0000\u0000\u0448\u03f7\u0001\u0000"+
		"\u0000\u0000\u0448\u03fd\u0001\u0000\u0000\u0000\u0448\u0406\u0001\u0000"+
		"\u0000\u0000\u0448\u0409\u0001\u0000\u0000\u0000\u0448\u0413\u0001\u0000"+
		"\u0000\u0000\u0448\u041b\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000"+
		"\u0000\u0000\u044a\u0448\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000"+
		"\u0000\u0000\u044bA\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0005F\u0000\u0000\u044eC\u0001\u0000\u0000\u0000\u044f"+
		"\u045c\u0005\u0006\u0000\u0000\u0450\u045c\u0005\u0016\u0000\u0000\u0451"+
		"\u045c\u0005\u0017\u0000\u0000\u0452\u045c\u0005\u0018\u0000\u0000\u0453"+
		"\u045c\u0005\\\u0000\u0000\u0454\u0455\u0005\\\u0000\u0000\u0455\u045c"+
		"\u0003J%\u0000\u0456\u045c\u0005S\u0000\u0000\u0457\u045c\u0005a\u0000"+
		"\u0000\u0458\u045c\u0005M\u0000\u0000\u0459\u045c\u0005c\u0000\u0000\u045a"+
		"\u045c\u0005v\u0000\u0000\u045b\u044f\u0001\u0000\u0000\u0000\u045b\u0450"+
		"\u0001\u0000\u0000\u0000\u045b\u0451\u0001\u0000\u0000\u0000\u045b\u0452"+
		"\u0001\u0000\u0000\u0000\u045b\u0453\u0001\u0000\u0000\u0000\u045b\u0454"+
		"\u0001\u0000\u0000\u0000\u045b\u0456\u0001\u0000\u0000\u0000\u045b\u0457"+
		"\u0001\u0000\u0000\u0000\u045b\u0458\u0001\u0000\u0000\u0000\u045b\u0459"+
		"\u0001\u0000\u0000\u0000\u045b\u045a\u0001\u0000\u0000\u0000\u045cE\u0001"+
		"\u0000\u0000\u0000\u045d\u045e\u0005 \u0000\u0000\u045eG\u0001\u0000\u0000"+
		"\u0000\u045f\u0460\u0005l\u0000\u0000\u0460I\u0001\u0000\u0000\u0000\u0461"+
		"\u0462\u0005f\u0000\u0000\u0462K\u0001\u0000\u0000\u0000\u0463\u0464\u0005"+
		"s\u0000\u0000\u0464\u0469\u0005\u0003\u0000\u0000\u0465\u046a\u0005Q\u0000"+
		"\u0000\u0466\u0467\u0007\u000e\u0000\u0000\u0467\u0468\u0005\u0005\u0000"+
		"\u0000\u0468\u046a\u0003\u00c0`\u0000\u0469\u0465\u0001\u0000\u0000\u0000"+
		"\u0469\u0466\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000"+
		"\u046b\u046c\u0005\u0004\u0000\u0000\u046cM\u0001\u0000\u0000\u0000\u046d"+
		"\u046e\u0007\u000f\u0000\u0000\u046eO\u0001\u0000\u0000\u0000\u046f\u0470"+
		"\u0005\u0003\u0000\u0000\u0470\u0475\u0003@ \u0000\u0471\u0472\u0005\u0005"+
		"\u0000\u0000\u0472\u0474\u0003@ \u0000\u0473\u0471\u0001\u0000\u0000\u0000"+
		"\u0474\u0477\u0001\u0000\u0000\u0000\u0475\u0473\u0001\u0000\u0000\u0000"+
		"\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0478\u0001\u0000\u0000\u0000"+
		"\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u0479\u0005\u0004\u0000\u0000"+
		"\u0479Q\u0001\u0000\u0000\u0000\u047a\u047b\u0005\u0090\u0000\u0000\u047b"+
		"\u0480\u0003P(\u0000\u047c\u047d\u0005\u0005\u0000\u0000\u047d\u047f\u0003"+
		"P(\u0000\u047e\u047c\u0001\u0000\u0000\u0000\u047f\u0482\u0001\u0000\u0000"+
		"\u0000\u0480\u047e\u0001\u0000\u0000\u0000\u0480\u0481\u0001\u0000\u0000"+
		"\u0000\u0481S\u0001\u0000\u0000\u0000\u0482\u0480\u0001\u0000\u0000\u0000"+
		"\u0483\u0485\u00030\u0018\u0000\u0484\u0483\u0001\u0000\u0000\u0000\u0484"+
		"\u0485\u0001\u0000\u0000\u0000\u0485\u048b\u0001\u0000\u0000\u0000\u0486"+
		"\u048c\u0005X\u0000\u0000\u0487\u048c\u0005z\u0000\u0000\u0488\u0489\u0005"+
		"X\u0000\u0000\u0489\u048a\u0005l\u0000\u0000\u048a\u048c\u0007\b\u0000"+
		"\u0000\u048b\u0486\u0001\u0000\u0000\u0000\u048b\u0487\u0001\u0000\u0000"+
		"\u0000\u048b\u0488\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u0491\u0005[\u0000\u0000\u048e\u048f\u0003\u00ccf\u0000\u048f"+
		"\u0490\u0005\u0002\u0000\u0000\u0490\u0492\u0001\u0000\u0000\u0000\u0491"+
		"\u048e\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492"+
		"\u0493\u0001\u0000\u0000\u0000\u0493\u0496\u0003\u00ceg\u0000\u0494\u0495"+
		"\u0005!\u0000\u0000\u0495\u0497\u0003\u00e4r\u0000\u0496\u0494\u0001\u0000"+
		"\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000\u0497\u04a3\u0001\u0000"+
		"\u0000\u0000\u0498\u0499\u0005\u0003\u0000\u0000\u0499\u049e\u0003\u00d2"+
		"i\u0000\u049a\u049b\u0005\u0005\u0000\u0000\u049b\u049d\u0003\u00d2i\u0000"+
		"\u049c\u049a\u0001\u0000\u0000\u0000\u049d\u04a0\u0001\u0000\u0000\u0000"+
		"\u049e\u049c\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000"+
		"\u049f\u04a1\u0001\u0000\u0000\u0000\u04a0\u049e\u0001\u0000\u0000\u0000"+
		"\u04a1\u04a2\u0005\u0004\u0000\u0000\u04a2\u04a4\u0001\u0000\u0000\u0000"+
		"\u04a3\u0498\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000"+
		"\u04a4\u04ae\u0001\u0000\u0000\u0000\u04a5\u04a8\u0003R)\u0000\u04a6\u04a8"+
		"\u0003`0\u0000\u04a7\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a6\u0001\u0000"+
		"\u0000\u0000\u04a8\u04aa\u0001\u0000\u0000\u0000\u04a9\u04ab\u0003X,\u0000"+
		"\u04aa\u04a9\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000"+
		"\u04ab\u04af\u0001\u0000\u0000\u0000\u04ac\u04ad\u00058\u0000\u0000\u04ad"+
		"\u04af\u0005\u0090\u0000\u0000\u04ae\u04a7\u0001\u0000\u0000\u0000\u04ae"+
		"\u04ac\u0001\u0000\u0000\u0000\u04af\u04b1\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b2\u0003V+\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b2U\u0001\u0000\u0000\u0000\u04b3\u04b4\u0005|\u0000"+
		"\u0000\u04b4\u04b9\u0003v;\u0000\u04b5\u04b6\u0005\u0005\u0000\u0000\u04b6"+
		"\u04b8\u0003v;\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b8\u04bb\u0001"+
		"\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001"+
		"\u0000\u0000\u0000\u04baW\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bc\u04bd\u0005k\u0000\u0000\u04bd\u04cc\u00050\u0000\u0000"+
		"\u04be\u04bf\u0005\u0003\u0000\u0000\u04bf\u04c4\u0003\u0018\f\u0000\u04c0"+
		"\u04c1\u0005\u0005\u0000\u0000\u04c1\u04c3\u0003\u0018\f\u0000\u04c2\u04c0"+
		"\u0001\u0000\u0000\u0000\u04c3\u04c6\u0001\u0000\u0000\u0000\u04c4\u04c2"+
		"\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c7\u04ca"+
		"\u0005\u0004\u0000\u0000\u04c8\u04c9\u0005\u0094\u0000\u0000\u04c9\u04cb"+
		"\u0003@ \u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000"+
		"\u0000\u0000\u04cb\u04cd\u0001\u0000\u0000\u0000\u04cc\u04be\u0001\u0000"+
		"\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000"+
		"\u0000\u0000\u04ce\u04e9\u0005\u00b7\u0000\u0000\u04cf\u04ea\u0005\u00b8"+
		"\u0000\u0000\u04d0\u04d1\u0005\u008d\u0000\u0000\u04d1\u04d4\u0005\u0083"+
		"\u0000\u0000\u04d2\u04d5\u0003\u00d2i\u0000\u04d3\u04d5\u0003\u0084B\u0000"+
		"\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d3\u0001\u0000\u0000\u0000"+
		"\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7\u0005\u0006\u0000\u0000"+
		"\u04d7\u04e2\u0003@ \u0000\u04d8\u04db\u0005\u0005\u0000\u0000\u04d9\u04dc"+
		"\u0003\u00d2i\u0000\u04da\u04dc\u0003\u0084B\u0000\u04db\u04d9\u0001\u0000"+
		"\u0000\u0000\u04db\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000"+
		"\u0000\u0000\u04dd\u04de\u0005\u0006\u0000\u0000\u04de\u04df\u0003@ \u0000"+
		"\u04df\u04e1\u0001\u0000\u0000\u0000\u04e0\u04d8\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e4\u0001\u0000\u0000\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e7\u0001\u0000\u0000\u0000"+
		"\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e5\u04e6\u0005\u0094\u0000\u0000"+
		"\u04e6\u04e8\u0003@ \u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8"+
		"\u0001\u0000\u0000\u0000\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04cf"+
		"\u0001\u0000\u0000\u0000\u04e9\u04d0\u0001\u0000\u0000\u0000\u04eaY\u0001"+
		"\u0000\u0000\u0000\u04eb\u04ef\u0005p\u0000\u0000\u04ec\u04ed\u0003\u00cc"+
		"f\u0000\u04ed\u04ee\u0005\u0002\u0000\u0000\u04ee\u04f0\u0001\u0000\u0000"+
		"\u0000\u04ef\u04ec\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f8\u0003\u00e0p\u0000"+
		"\u04f2\u04f3\u0005\u0006\u0000\u0000\u04f3\u04f9\u0003\\.\u0000\u04f4"+
		"\u04f5\u0005\u0003\u0000\u0000\u04f5\u04f6\u0003\\.\u0000\u04f6\u04f7"+
		"\u0005\u0004\u0000\u0000\u04f7\u04f9\u0001\u0000\u0000\u0000\u04f8\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f8\u04f4\u0001\u0000\u0000\u0000\u04f8\u04f9"+
		"\u0001\u0000\u0000\u0000\u04f9[\u0001\u0000\u0000\u0000\u04fa\u04fe\u0003"+
		"\"\u0011\u0000\u04fb\u04fe\u0003\u00c8d\u0000\u04fc\u04fe\u0005\u00bc"+
		"\u0000\u0000\u04fd\u04fa\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fe]\u0001\u0000\u0000"+
		"\u0000\u04ff\u050a\u0005w\u0000\u0000\u0500\u050b\u0003\u00d4j\u0000\u0501"+
		"\u0502\u0003\u00ccf\u0000\u0502\u0503\u0005\u0002\u0000\u0000\u0503\u0505"+
		"\u0001\u0000\u0000\u0000\u0504\u0501\u0001\u0000\u0000\u0000\u0504\u0505"+
		"\u0001\u0000\u0000\u0000\u0505\u0508\u0001\u0000\u0000\u0000\u0506\u0509"+
		"\u0003\u00ceg\u0000\u0507\u0509\u0003\u00d8l\u0000\u0508\u0506\u0001\u0000"+
		"\u0000\u0000\u0508\u0507\u0001\u0000\u0000\u0000\u0509\u050b\u0001\u0000"+
		"\u0000\u0000\u050a\u0500\u0001\u0000\u0000\u0000\u050a\u0504\u0001\u0000"+
		"\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000\u050b_\u0001\u0000\u0000"+
		"\u0000\u050c\u050e\u0003\u009cN\u0000\u050d\u050c\u0001\u0000\u0000\u0000"+
		"\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000"+
		"\u050f\u0515\u0003d2\u0000\u0510\u0511\u0003\u0080@\u0000\u0511\u0512"+
		"\u0003d2\u0000\u0512\u0514\u0001\u0000\u0000\u0000\u0513\u0510\u0001\u0000"+
		"\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000"+
		"\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0519\u0001\u0000"+
		"\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u051a\u0003\u009e"+
		"O\u0000\u0519\u0518\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000"+
		"\u0000\u051a\u051c\u0001\u0000\u0000\u0000\u051b\u051d\u0003\u00a0P\u0000"+
		"\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000"+
		"\u051da\u0001\u0000\u0000\u0000\u051e\u0526\u0003r9\u0000\u051f\u0520"+
		"\u0003z=\u0000\u0520\u0522\u0003r9\u0000\u0521\u0523\u0003~?\u0000\u0522"+
		"\u0521\u0001\u0000\u0000\u0000\u0522\u0523\u0001\u0000\u0000\u0000\u0523"+
		"\u0525\u0001\u0000\u0000\u0000\u0524\u051f\u0001\u0000\u0000\u0000\u0525"+
		"\u0528\u0001\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526"+
		"\u0527\u0001\u0000\u0000\u0000\u0527c\u0001\u0000\u0000\u0000\u0528\u0526"+
		"\u0001\u0000\u0000\u0000\u0529\u052b\u0005\u0082\u0000\u0000\u052a\u052c"+
		"\u0007\u0010\u0000\u0000\u052b\u052a\u0001\u0000\u0000\u0000\u052b\u052c"+
		"\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u0532"+
		"\u0003v;\u0000\u052e\u052f\u0005\u0005\u0000\u0000\u052f\u0531\u0003v"+
		";\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0531\u0534\u0001\u0000\u0000"+
		"\u0000\u0532\u0530\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000\u0000"+
		"\u0000\u0533\u0541\u0001\u0000\u0000\u0000\u0534\u0532\u0001\u0000\u0000"+
		"\u0000\u0535\u053f\u0005K\u0000\u0000\u0536\u053b\u0003r9\u0000\u0537"+
		"\u0538\u0005\u0005\u0000\u0000\u0538\u053a\u0003r9\u0000\u0539\u0537\u0001"+
		"\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000\u0000\u053b\u0539\u0001"+
		"\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u0540\u0001"+
		"\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053e\u0540\u0003"+
		"b1\u0000\u053f\u0536\u0001\u0000\u0000\u0000\u053f\u053e\u0001\u0000\u0000"+
		"\u0000\u0540\u0542\u0001\u0000\u0000\u0000\u0541\u0535\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0544\u0001\u0000\u0000"+
		"\u0000\u0543\u0545\u0003f3\u0000\u0544\u0543\u0001\u0000\u0000\u0000\u0544"+
		"\u0545\u0001\u0000\u0000\u0000\u0545\u054a\u0001\u0000\u0000\u0000\u0546"+
		"\u0548\u0003h4\u0000\u0547\u0549\u0003j5\u0000\u0548\u0547\u0001\u0000"+
		"\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054b\u0001\u0000"+
		"\u0000\u0000\u054a\u0546\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000"+
		"\u0000\u0000\u054b\u055a\u0001\u0000\u0000\u0000\u054c\u054d\u0005\u00ae"+
		"\u0000\u0000\u054d\u054e\u0003\u00e8t\u0000\u054e\u054f\u0005!\u0000\u0000"+
		"\u054f\u0557\u0003\u008eG\u0000\u0550\u0551\u0005\u0005\u0000\u0000\u0551"+
		"\u0552\u0003\u00e8t\u0000\u0552\u0553\u0005!\u0000\u0000\u0553\u0554\u0003"+
		"\u008eG\u0000\u0554\u0556\u0001\u0000\u0000\u0000\u0555\u0550\u0001\u0000"+
		"\u0000\u0000\u0556\u0559\u0001\u0000\u0000\u0000\u0557\u0555\u0001\u0000"+
		"\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558\u055b\u0001\u0000"+
		"\u0000\u0000\u0559\u0557\u0001\u0000\u0000\u0000\u055a\u054c\u0001\u0000"+
		"\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b\u055e\u0001\u0000"+
		"\u0000\u0000\u055c\u055e\u0003R)\u0000\u055d\u0529\u0001\u0000\u0000\u0000"+
		"\u055d\u055c\u0001\u0000\u0000\u0000\u055ee\u0001\u0000\u0000\u0000\u055f"+
		"\u0560\u0005\u0094\u0000\u0000\u0560\u0561\u0003@ \u0000\u0561g\u0001"+
		"\u0000\u0000\u0000\u0562\u0563\u0005N\u0000\u0000\u0563\u0564\u0005(\u0000"+
		"\u0000\u0564\u0569\u0003@ \u0000\u0565\u0566\u0005\u0005\u0000\u0000\u0566"+
		"\u0568\u0003@ \u0000\u0567\u0565\u0001\u0000\u0000\u0000\u0568\u056b\u0001"+
		"\u0000\u0000\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u0569\u056a\u0001"+
		"\u0000\u0000\u0000\u056ai\u0001\u0000\u0000\u0000\u056b\u0569\u0001\u0000"+
		"\u0000\u0000\u056c\u056d\u0005O\u0000\u0000\u056d\u056e\u0003@ \u0000"+
		"\u056ek\u0001\u0000\u0000\u0000\u056f\u0570\u0003`0\u0000\u0570m\u0001"+
		"\u0000\u0000\u0000\u0571\u0573\u0003\u009cN\u0000\u0572\u0571\u0001\u0000"+
		"\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0574\u0001\u0000"+
		"\u0000\u0000\u0574\u0576\u0003d2\u0000\u0575\u0577\u0003\u009eO\u0000"+
		"\u0576\u0575\u0001\u0000\u0000\u0000\u0576\u0577\u0001\u0000\u0000\u0000"+
		"\u0577\u0579\u0001\u0000\u0000\u0000\u0578\u057a\u0003\u00a0P\u0000\u0579"+
		"\u0578\u0001\u0000\u0000\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a"+
		"o\u0001\u0000\u0000\u0000\u057b\u057d\u0003\u009cN\u0000\u057c\u057b\u0001"+
		"\u0000\u0000\u0000\u057c\u057d\u0001\u0000\u0000\u0000\u057d\u057e\u0001"+
		"\u0000\u0000\u0000\u057e\u0588\u0003d2\u0000\u057f\u0581\u0005\u008b\u0000"+
		"\u0000\u0580\u0582\u0005\u001d\u0000\u0000\u0581\u0580\u0001\u0000\u0000"+
		"\u0000\u0581\u0582\u0001\u0000\u0000\u0000\u0582\u0586\u0001\u0000\u0000"+
		"\u0000\u0583\u0586\u0005Z\u0000\u0000\u0584\u0586\u0005D\u0000\u0000\u0585"+
		"\u057f\u0001\u0000\u0000\u0000\u0585\u0583\u0001\u0000\u0000\u0000\u0585"+
		"\u0584\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000\u0000\u0587"+
		"\u0589\u0003d2\u0000\u0588\u0585\u0001\u0000\u0000\u0000\u0589\u058a\u0001"+
		"\u0000\u0000\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058a\u058b\u0001"+
		"\u0000\u0000\u0000\u058b\u058d\u0001\u0000\u0000\u0000\u058c\u058e\u0003"+
		"\u009eO\u0000\u058d\u058c\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000"+
		"\u0000\u0000\u058e\u0590\u0001\u0000\u0000\u0000\u058f\u0591\u0003\u00a0"+
		"P\u0000\u0590\u058f\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000\u0000"+
		"\u0000\u0591q\u0001\u0000\u0000\u0000\u0592\u0593\u0003\u00ccf\u0000\u0593"+
		"\u0594\u0005\u0002\u0000\u0000\u0594\u0596\u0001\u0000\u0000\u0000\u0595"+
		"\u0592\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000\u0000\u0000\u0596"+
		"\u0597\u0001\u0000\u0000\u0000\u0597\u059c\u0003\u00ceg\u0000\u0598\u059a"+
		"\u0005!\u0000\u0000\u0599\u0598\u0001\u0000\u0000\u0000\u0599\u059a\u0001"+
		"\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059b\u059d\u0003"+
		"\u00e4r\u0000\u059c\u0599\u0001\u0000\u0000\u0000\u059c\u059d\u0001\u0000"+
		"\u0000\u0000\u059d\u05a3\u0001\u0000\u0000\u0000\u059e\u059f\u0005U\u0000"+
		"\u0000\u059f\u05a0\u0005(\u0000\u0000\u05a0\u05a4\u0003\u00d8l\u0000\u05a1"+
		"\u05a2\u0005f\u0000\u0000\u05a2\u05a4\u0005U\u0000\u0000\u05a3\u059e\u0001"+
		"\u0000\u0000\u0000\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001"+
		"\u0000\u0000\u0000\u05a4\u05cb\u0001\u0000\u0000\u0000\u05a5\u05a6\u0003"+
		"\u00ccf\u0000\u05a6\u05a7\u0005\u0002\u0000\u0000\u05a7\u05a9\u0001\u0000"+
		"\u0000\u0000\u05a8\u05a5\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001\u0000"+
		"\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000\u05aa\u05ab\u0003\u00f4"+
		"z\u0000\u05ab\u05ac\u0005\u0003\u0000\u0000\u05ac\u05b1\u0003@ \u0000"+
		"\u05ad\u05ae\u0005\u0005\u0000\u0000\u05ae\u05b0\u0003@ \u0000\u05af\u05ad"+
		"\u0001\u0000\u0000\u0000\u05b0\u05b3\u0001\u0000\u0000\u0000\u05b1\u05af"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2\u05b4"+
		"\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b4\u05b9"+
		"\u0005\u0004\u0000\u0000\u05b5\u05b7\u0005!\u0000\u0000\u05b6\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001"+
		"\u0000\u0000\u0000\u05b8\u05ba\u0003\u00e4r\u0000\u05b9\u05b6\u0001\u0000"+
		"\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000\u0000\u05ba\u05cb\u0001\u0000"+
		"\u0000\u0000\u05bb\u05c5\u0005\u0003\u0000\u0000\u05bc\u05c1\u0003r9\u0000"+
		"\u05bd\u05be\u0005\u0005\u0000\u0000\u05be\u05c0\u0003r9\u0000\u05bf\u05bd"+
		"\u0001\u0000\u0000\u0000\u05c0\u05c3\u0001\u0000\u0000\u0000\u05c1\u05bf"+
		"\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c6"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c1\u0001\u0000\u0000\u0000\u05c4\u05c6"+
		"\u0003b1\u0000\u05c5\u05bc\u0001\u0000\u0000\u0000\u05c5\u05c4\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c8\u0005\u0004"+
		"\u0000\u0000\u05c8\u05cb\u0001\u0000\u0000\u0000\u05c9\u05cb\u0003t:\u0000"+
		"\u05ca\u0595\u0001\u0000\u0000\u0000\u05ca\u05a8\u0001\u0000\u0000\u0000"+
		"\u05ca\u05bb\u0001\u0000\u0000\u0000\u05ca\u05c9\u0001\u0000\u0000\u0000"+
		"\u05cbs\u0001\u0000\u0000\u0000\u05cc\u05cd\u0005\u0003\u0000\u0000\u05cd"+
		"\u05ce\u0003`0\u0000\u05ce\u05d3\u0005\u0004\u0000\u0000\u05cf\u05d1\u0005"+
		"!\u0000\u0000\u05d0\u05cf\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d4\u0003\u00e4"+
		"r\u0000\u05d3\u05d0\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d4u\u0001\u0000\u0000\u0000\u05d5\u05e2\u0003x<\u0000\u05d6"+
		"\u05d7\u0003\u00ceg\u0000\u05d7\u05d8\u0005\u0002\u0000\u0000\u05d8\u05d9"+
		"\u0003x<\u0000\u05d9\u05e2\u0001\u0000\u0000\u0000\u05da\u05df\u0003@"+
		" \u0000\u05db\u05dd\u0005!\u0000\u0000\u05dc\u05db\u0001\u0000\u0000\u0000"+
		"\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000"+
		"\u05de\u05e0\u0003\u00c4b\u0000\u05df\u05dc\u0001\u0000\u0000\u0000\u05df"+
		"\u05e0\u0001\u0000\u0000\u0000\u05e0\u05e2\u0001\u0000\u0000\u0000\u05e1"+
		"\u05d5\u0001\u0000\u0000\u0000\u05e1\u05d6\u0001\u0000\u0000\u0000\u05e1"+
		"\u05da\u0001\u0000\u0000\u0000\u05e2w\u0001\u0000\u0000\u0000\u05e3\u05e4"+
		"\u0005\u0007\u0000\u0000\u05e4y\u0001\u0000\u0000\u0000\u05e5\u05f3\u0003"+
		"|>\u0000\u05e6\u05e8\u0005d\u0000\u0000\u05e7\u05e6\u0001\u0000\u0000"+
		"\u0000\u05e7\u05e8\u0001\u0000\u0000\u0000\u05e8\u05ef\u0001\u0000\u0000"+
		"\u0000\u05e9\u05eb\u0005`\u0000\u0000\u05ea\u05ec\u0005n\u0000\u0000\u05eb"+
		"\u05ea\u0001\u0000\u0000\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec"+
		"\u05f0\u0001\u0000\u0000\u0000\u05ed\u05f0\u0005W\u0000\u0000\u05ee\u05f0"+
		"\u00053\u0000\u0000\u05ef\u05e9\u0001\u0000\u0000\u0000\u05ef\u05ed\u0001"+
		"\u0000\u0000\u0000\u05ef\u05ee\u0001\u0000\u0000\u0000\u05ef\u05f0\u0001"+
		"\u0000\u0000\u0000\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1\u05f3\u0005"+
		"^\u0000\u0000\u05f2\u05e5\u0001\u0000\u0000\u0000\u05f2\u05e7\u0001\u0000"+
		"\u0000\u0000\u05f3{\u0001\u0000\u0000\u0000\u05f4\u05f5\u0005\u0005\u0000"+
		"\u0000\u05f5}\u0001\u0000\u0000\u0000\u05f6\u05f7\u0005k\u0000\u0000\u05f7"+
		"\u0605\u0003@ \u0000\u05f8\u05f9\u0005\u008e\u0000\u0000\u05f9\u05fa\u0005"+
		"\u0003\u0000\u0000\u05fa\u05ff\u0003\u00d2i\u0000\u05fb\u05fc\u0005\u0005"+
		"\u0000\u0000\u05fc\u05fe\u0003\u00d2i\u0000\u05fd\u05fb\u0001\u0000\u0000"+
		"\u0000\u05fe\u0601\u0001\u0000\u0000\u0000\u05ff\u05fd\u0001\u0000\u0000"+
		"\u0000\u05ff\u0600\u0001\u0000\u0000\u0000\u0600\u0602\u0001\u0000\u0000"+
		"\u0000\u0601\u05ff\u0001\u0000\u0000\u0000\u0602\u0603\u0005\u0004\u0000"+
		"\u0000\u0603\u0605\u0001\u0000\u0000\u0000\u0604\u05f6\u0001\u0000\u0000"+
		"\u0000\u0604\u05f8\u0001\u0000\u0000\u0000\u0605\u007f\u0001\u0000\u0000"+
		"\u0000\u0606\u0608\u0005\u008b\u0000\u0000\u0607\u0609\u0005\u001d\u0000"+
		"\u0000\u0608\u0607\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000"+
		"\u0000\u0609\u060d\u0001\u0000\u0000\u0000\u060a\u060d\u0005Z\u0000\u0000"+
		"\u060b\u060d\u0005D\u0000\u0000\u060c\u0606\u0001\u0000\u0000\u0000\u060c"+
		"\u060a\u0001\u0000\u0000\u0000\u060c\u060b\u0001\u0000\u0000\u0000\u060d"+
		"\u0081\u0001\u0000\u0000\u0000\u060e\u0610\u00030\u0018\u0000\u060f\u060e"+
		"\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000\u0610\u0611"+
		"\u0001\u0000\u0000\u0000\u0611\u0614\u0005\u008d\u0000\u0000\u0612\u0613"+
		"\u0005l\u0000\u0000\u0613\u0615\u0007\b\u0000\u0000\u0614\u0612\u0001"+
		"\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000\u0000\u0615\u0616\u0001"+
		"\u0000\u0000\u0000\u0616\u0617\u0003\u0088D\u0000\u0617\u061a\u0005\u0083"+
		"\u0000\u0000\u0618\u061b\u0003\u00d2i\u0000\u0619\u061b\u0003\u0084B\u0000"+
		"\u061a\u0618\u0001\u0000\u0000\u0000\u061a\u0619\u0001\u0000\u0000\u0000"+
		"\u061b\u061c\u0001\u0000\u0000\u0000\u061c\u061d\u0005\u0006\u0000\u0000"+
		"\u061d\u0628\u0003@ \u0000\u061e\u0621\u0005\u0005\u0000\u0000\u061f\u0622"+
		"\u0003\u00d2i\u0000\u0620\u0622\u0003\u0084B\u0000\u0621\u061f\u0001\u0000"+
		"\u0000\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000"+
		"\u0000\u0000\u0623\u0624\u0005\u0006\u0000\u0000\u0624\u0625\u0003@ \u0000"+
		"\u0625\u0627\u0001\u0000\u0000\u0000\u0626\u061e\u0001\u0000\u0000\u0000"+
		"\u0627\u062a\u0001\u0000\u0000\u0000\u0628\u0626\u0001\u0000\u0000\u0000"+
		"\u0628\u0629\u0001\u0000\u0000\u0000\u0629\u0637\u0001\u0000\u0000\u0000"+
		"\u062a\u0628\u0001\u0000\u0000\u0000\u062b\u0635\u0005K\u0000\u0000\u062c"+
		"\u0631\u0003r9\u0000\u062d\u062e\u0005\u0005\u0000\u0000\u062e\u0630\u0003"+
		"r9\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u0630\u0633\u0001\u0000\u0000"+
		"\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0631\u0632\u0001\u0000\u0000"+
		"\u0000\u0632\u0636\u0001\u0000\u0000\u0000\u0633\u0631\u0001\u0000\u0000"+
		"\u0000\u0634\u0636\u0003b1\u0000\u0635\u062c\u0001\u0000\u0000\u0000\u0635"+
		"\u0634\u0001\u0000\u0000\u0000\u0636\u0638\u0001\u0000\u0000\u0000\u0637"+
		"\u062b\u0001\u0000\u0000\u0000\u0637\u0638\u0001\u0000\u0000\u0000\u0638"+
		"\u063b\u0001\u0000\u0000\u0000\u0639\u063a\u0005\u0094\u0000\u0000\u063a"+
		"\u063c\u0003@ \u0000\u063b\u0639\u0001\u0000\u0000\u0000\u063b\u063c\u0001"+
		"\u0000\u0000\u0000\u063c\u063e\u0001\u0000\u0000\u0000\u063d\u063f\u0003"+
		"V+\u0000\u063e\u063d\u0001\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000"+
		"\u0000\u063f\u0083\u0001\u0000\u0000\u0000\u0640\u0641\u0005\u0003\u0000"+
		"\u0000\u0641\u0646\u0003\u00d2i\u0000\u0642\u0643\u0005\u0005\u0000\u0000"+
		"\u0643\u0645\u0003\u00d2i\u0000\u0644\u0642\u0001\u0000\u0000\u0000\u0645"+
		"\u0648\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000\u0000\u0000\u0646"+
		"\u0647\u0001\u0000\u0000\u0000\u0647\u0649\u0001\u0000\u0000\u0000\u0648"+
		"\u0646\u0001\u0000\u0000\u0000\u0649\u064a\u0005\u0004\u0000\u0000\u064a"+
		"\u0085\u0001\u0000\u0000\u0000\u064b\u064d\u00030\u0018\u0000\u064c\u064b"+
		"\u0001\u0000\u0000\u0000\u064c\u064d\u0001\u0000\u0000\u0000\u064d\u064e"+
		"\u0001\u0000\u0000\u0000\u064e\u0651\u0005\u008d\u0000\u0000\u064f\u0650"+
		"\u0005l\u0000\u0000\u0650\u0652\u0007\b\u0000\u0000\u0651\u064f\u0001"+
		"\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0653\u0001"+
		"\u0000\u0000\u0000\u0653\u0654\u0003\u0088D\u0000\u0654\u0657\u0005\u0083"+
		"\u0000\u0000\u0655\u0658\u0003\u00d2i\u0000\u0656\u0658\u0003\u0084B\u0000"+
		"\u0657\u0655\u0001\u0000\u0000\u0000\u0657\u0656\u0001\u0000\u0000\u0000"+
		"\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u065a\u0005\u0006\u0000\u0000"+
		"\u065a\u0665\u0003@ \u0000\u065b\u065e\u0005\u0005\u0000\u0000\u065c\u065f"+
		"\u0003\u00d2i\u0000\u065d\u065f\u0003\u0084B\u0000\u065e\u065c\u0001\u0000"+
		"\u0000\u0000\u065e\u065d\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000"+
		"\u0000\u0000\u0660\u0661\u0005\u0006\u0000\u0000\u0661\u0662\u0003@ \u0000"+
		"\u0662\u0664\u0001\u0000\u0000\u0000\u0663\u065b\u0001\u0000\u0000\u0000"+
		"\u0664\u0667\u0001\u0000\u0000\u0000\u0665\u0663\u0001\u0000\u0000\u0000"+
		"\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u066a\u0001\u0000\u0000\u0000"+
		"\u0667\u0665\u0001\u0000\u0000\u0000\u0668\u0669\u0005\u0094\u0000\u0000"+
		"\u0669\u066b\u0003@ \u0000\u066a\u0668\u0001\u0000\u0000\u0000\u066a\u066b"+
		"\u0001\u0000\u0000\u0000\u066b\u066d\u0001\u0000\u0000\u0000\u066c\u066e"+
		"\u0003V+\u0000\u066d\u066c\u0001\u0000\u0000\u0000\u066d\u066e\u0001\u0000"+
		"\u0000\u0000\u066e\u0673\u0001\u0000\u0000\u0000\u066f\u0671\u0003\u009e"+
		"O\u0000\u0670\u066f\u0001\u0000\u0000\u0000\u0670\u0671\u0001\u0000\u0000"+
		"\u0000\u0671\u0672\u0001\u0000\u0000\u0000\u0672\u0674\u0003\u00a0P\u0000"+
		"\u0673\u0670\u0001\u0000\u0000\u0000\u0673\u0674\u0001\u0000\u0000\u0000"+
		"\u0674\u0087\u0001\u0000\u0000\u0000\u0675\u0676\u0003\u00ccf\u0000\u0676"+
		"\u0677\u0005\u0002\u0000\u0000\u0677\u0679\u0001\u0000\u0000\u0000\u0678"+
		"\u0675\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000\u0000\u0679"+
		"\u067a\u0001\u0000\u0000\u0000\u067a\u067d\u0003\u00ceg\u0000\u067b\u067c"+
		"\u0005!\u0000\u0000\u067c\u067e\u0003\u00eau\u0000\u067d\u067b\u0001\u0000"+
		"\u0000\u0000\u067d\u067e\u0001\u0000\u0000\u0000\u067e\u0684\u0001\u0000"+
		"\u0000\u0000\u067f\u0680\u0005U\u0000\u0000\u0680\u0681\u0005(\u0000\u0000"+
		"\u0681\u0685\u0003\u00d8l\u0000\u0682\u0683\u0005f\u0000\u0000\u0683\u0685"+
		"\u0005U\u0000\u0000\u0684\u067f\u0001\u0000\u0000\u0000\u0684\u0682\u0001"+
		"\u0000\u0000\u0000\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u0089\u0001"+
		"\u0000\u0000\u0000\u0686\u0688\u0005\u008f\u0000\u0000\u0687\u0689\u0003"+
		"\u00ccf\u0000\u0688\u0687\u0001\u0000\u0000\u0000\u0688\u0689\u0001\u0000"+
		"\u0000\u0000\u0689\u068c\u0001\u0000\u0000\u0000\u068a\u068b\u0005[\u0000"+
		"\u0000\u068b\u068d\u0003\u00ecv\u0000\u068c\u068a\u0001\u0000\u0000\u0000"+
		"\u068c\u068d\u0001\u0000\u0000\u0000\u068d\u008b\u0001\u0000\u0000\u0000"+
		"\u068e\u068f\u0005\u00b2\u0000\u0000\u068f\u0690\u0005\u0003\u0000\u0000"+
		"\u0690\u0691\u0005\u0094\u0000\u0000\u0691\u0692\u0003@ \u0000\u0692\u0693"+
		"\u0005\u0004\u0000\u0000\u0693\u008d\u0001\u0000\u0000\u0000\u0694\u0696"+
		"\u0005\u0003\u0000\u0000\u0695\u0697\u0003\u00eew\u0000\u0696\u0695\u0001"+
		"\u0000\u0000\u0000\u0696\u0697\u0001\u0000\u0000\u0000\u0697\u06a2\u0001"+
		"\u0000\u0000\u0000\u0698\u0699\u0005\u0099\u0000\u0000\u0699\u069a\u0005"+
		"(\u0000\u0000\u069a\u069f\u0003@ \u0000\u069b\u069c\u0005\u0005\u0000"+
		"\u0000\u069c\u069e\u0003@ \u0000\u069d\u069b\u0001\u0000\u0000\u0000\u069e"+
		"\u06a1\u0001\u0000\u0000\u0000\u069f\u069d\u0001\u0000\u0000\u0000\u069f"+
		"\u06a0\u0001\u0000\u0000\u0000\u06a0\u06a3\u0001\u0000\u0000\u0000\u06a1"+
		"\u069f\u0001\u0000\u0000\u0000\u06a2\u0698\u0001\u0000\u0000\u0000\u06a2"+
		"\u06a3\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000\u06a4"+
		"\u06a5\u0005m\u0000\u0000\u06a5\u06a6\u0005(\u0000\u0000\u06a6\u06ab\u0003"+
		"\u00a2Q\u0000\u06a7\u06a8\u0005\u0005\u0000\u0000\u06a8\u06aa\u0003\u00a2"+
		"Q\u0000\u06a9\u06a7\u0001\u0000\u0000\u0000\u06aa\u06ad\u0001\u0000\u0000"+
		"\u0000\u06ab\u06a9\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000"+
		"\u0000\u06ac\u06af\u0001\u0000\u0000\u0000\u06ad\u06ab\u0001\u0000\u0000"+
		"\u0000\u06ae\u06b0\u0003\u0092I\u0000\u06af\u06ae\u0001\u0000\u0000\u0000"+
		"\u06af\u06b0\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b2\u0005\u0004\u0000\u0000\u06b2\u008f\u0001\u0000\u0000\u0000"+
		"\u06b3\u06d5\u0005\u0098\u0000\u0000\u06b4\u06d6\u0003\u00e8t\u0000\u06b5"+
		"\u06b7\u0005\u0003\u0000\u0000\u06b6\u06b8\u0003\u00eew\u0000\u06b7\u06b6"+
		"\u0001\u0000\u0000\u0000\u06b7\u06b8\u0001\u0000\u0000\u0000\u06b8\u06c3"+
		"\u0001\u0000\u0000\u0000\u06b9\u06ba\u0005\u0099\u0000\u0000\u06ba\u06bb"+
		"\u0005(\u0000\u0000\u06bb\u06c0\u0003@ \u0000\u06bc\u06bd\u0005\u0005"+
		"\u0000\u0000\u06bd\u06bf\u0003@ \u0000\u06be\u06bc\u0001\u0000\u0000\u0000"+
		"\u06bf\u06c2\u0001\u0000\u0000\u0000\u06c0\u06be\u0001\u0000\u0000\u0000"+
		"\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06c4\u0001\u0000\u0000\u0000"+
		"\u06c2\u06c0\u0001\u0000\u0000\u0000\u06c3\u06b9\u0001\u0000\u0000\u0000"+
		"\u06c3\u06c4\u0001\u0000\u0000\u0000\u06c4\u06cf\u0001\u0000\u0000\u0000"+
		"\u06c5\u06c6\u0005m\u0000\u0000\u06c6\u06c7\u0005(\u0000\u0000\u06c7\u06cc"+
		"\u0003\u00a2Q\u0000\u06c8\u06c9\u0005\u0005\u0000\u0000\u06c9\u06cb\u0003"+
		"\u00a2Q\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06cb\u06ce\u0001\u0000"+
		"\u0000\u0000\u06cc\u06ca\u0001\u0000\u0000\u0000\u06cc\u06cd\u0001\u0000"+
		"\u0000\u0000\u06cd\u06d0\u0001\u0000\u0000\u0000\u06ce\u06cc\u0001\u0000"+
		"\u0000\u0000\u06cf\u06c5\u0001\u0000\u0000\u0000\u06cf\u06d0\u0001\u0000"+
		"\u0000\u0000\u06d0\u06d2\u0001\u0000\u0000\u0000\u06d1\u06d3\u0003\u0092"+
		"I\u0000\u06d2\u06d1\u0001\u0000\u0000\u0000\u06d2\u06d3\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000\u06d4\u06d6\u0005\u0004\u0000"+
		"\u0000\u06d5\u06b4\u0001\u0000\u0000\u0000\u06d5\u06b5\u0001\u0000\u0000"+
		"\u0000\u06d6\u0091\u0001\u0000\u0000\u0000\u06d7\u06e1\u0003\u0094J\u0000"+
		"\u06d8\u06df\u0005\u00b4\u0000\u0000\u06d9\u06da\u0005e\u0000\u0000\u06da"+
		"\u06e0\u0005\u00b6\u0000\u0000\u06db\u06dc\u0005\u009d\u0000\u0000\u06dc"+
		"\u06e0\u0005\u007f\u0000\u0000\u06dd\u06e0\u0005N\u0000\u0000\u06de\u06e0"+
		"\u0005\u00b5\u0000\u0000\u06df\u06d9\u0001\u0000\u0000\u0000\u06df\u06db"+
		"\u0001\u0000\u0000\u0000\u06df\u06dd\u0001\u0000\u0000\u0000\u06df\u06de"+
		"\u0001\u0000\u0000\u0000\u06e0\u06e2\u0001\u0000\u0000\u0000\u06e1\u06d8"+
		"\u0001\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000\u0000\u06e2\u0093"+
		"\u0001\u0000\u0000\u0000\u06e3\u06ea\u0007\u0011\u0000\u0000\u06e4\u06eb"+
		"\u0003\u00aaU\u0000\u06e5\u06e6\u0005\'\u0000\u0000\u06e6\u06e7\u0003"+
		"\u00a6S\u0000\u06e7\u06e8\u0005 \u0000\u0000\u06e8\u06e9\u0003\u00a8T"+
		"\u0000\u06e9\u06eb\u0001\u0000\u0000\u0000\u06ea\u06e4\u0001\u0000\u0000"+
		"\u0000\u06ea\u06e5\u0001\u0000\u0000\u0000\u06eb\u0095\u0001\u0000\u0000"+
		"\u0000\u06ec\u06ed\u0003\u00f0x\u0000\u06ed\u06f7\u0005\u0003\u0000\u0000"+
		"\u06ee\u06f3\u0003@ \u0000\u06ef\u06f0\u0005\u0005\u0000\u0000\u06f0\u06f2"+
		"\u0003@ \u0000\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f2\u06f5\u0001\u0000"+
		"\u0000\u0000\u06f3\u06f1\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000"+
		"\u0000\u0000\u06f4\u06f8\u0001\u0000\u0000\u0000\u06f5\u06f3\u0001\u0000"+
		"\u0000\u0000\u06f6\u06f8\u0005\u0007\u0000\u0000\u06f7\u06ee\u0001\u0000"+
		"\u0000\u0000\u06f7\u06f6\u0001\u0000\u0000\u0000\u06f8\u06f9\u0001\u0000"+
		"\u0000\u0000\u06f9\u06fa\u0005\u0004\u0000\u0000\u06fa\u0097\u0001\u0000"+
		"\u0000\u0000\u06fb\u06fc\u0003\u00f2y\u0000\u06fc\u0709\u0005\u0003\u0000"+
		"\u0000\u06fd\u06ff\u0005>\u0000\u0000\u06fe\u06fd\u0001\u0000\u0000\u0000"+
		"\u06fe\u06ff\u0001\u0000\u0000\u0000\u06ff\u0700\u0001\u0000\u0000\u0000"+
		"\u0700\u0705\u0003@ \u0000\u0701\u0702\u0005\u0005\u0000\u0000\u0702\u0704"+
		"\u0003@ \u0000\u0703\u0701\u0001\u0000\u0000\u0000\u0704\u0707\u0001\u0000"+
		"\u0000\u0000\u0705\u0703\u0001\u0000\u0000\u0000\u0705\u0706\u0001\u0000"+
		"\u0000\u0000\u0706\u070a\u0001\u0000\u0000\u0000\u0707\u0705\u0001\u0000"+
		"\u0000\u0000\u0708\u070a\u0005\u0007\u0000\u0000\u0709\u06fe\u0001\u0000"+
		"\u0000\u0000\u0709\u0708\u0001\u0000\u0000\u0000\u0709\u070a\u0001\u0000"+
		"\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b\u070d\u0005\u0004"+
		"\u0000\u0000\u070c\u070e\u0003\u008cF\u0000\u070d\u070c\u0001\u0000\u0000"+
		"\u0000\u070d\u070e\u0001\u0000\u0000\u0000\u070e\u0099\u0001\u0000\u0000"+
		"\u0000\u070f\u0710\u0003\u00acV\u0000\u0710\u071a\u0005\u0003\u0000\u0000"+
		"\u0711\u0716\u0003@ \u0000\u0712\u0713\u0005\u0005\u0000\u0000\u0713\u0715"+
		"\u0003@ \u0000\u0714\u0712\u0001\u0000\u0000\u0000\u0715\u0718\u0001\u0000"+
		"\u0000\u0000\u0716\u0714\u0001\u0000\u0000\u0000\u0716\u0717\u0001\u0000"+
		"\u0000\u0000\u0717\u071b\u0001\u0000\u0000\u0000\u0718\u0716\u0001\u0000"+
		"\u0000\u0000\u0719\u071b\u0005\u0007\u0000\u0000\u071a\u0711\u0001\u0000"+
		"\u0000\u0000\u071a\u0719\u0001\u0000\u0000\u0000\u071a\u071b\u0001\u0000"+
		"\u0000\u0000\u071b\u071c\u0001\u0000\u0000\u0000\u071c\u071e\u0005\u0004"+
		"\u0000\u0000\u071d\u071f\u0003\u008cF\u0000\u071e\u071d\u0001\u0000\u0000"+
		"\u0000\u071e\u071f\u0001\u0000\u0000\u0000\u071f\u0720\u0001\u0000\u0000"+
		"\u0000\u0720\u0723\u0005\u0098\u0000\u0000\u0721\u0724\u0003\u008eG\u0000"+
		"\u0722\u0724\u0003\u00e8t\u0000\u0723\u0721\u0001\u0000\u0000\u0000\u0723"+
		"\u0722\u0001\u0000\u0000\u0000\u0724\u009b\u0001\u0000\u0000\u0000\u0725"+
		"\u0727\u0005\u0095\u0000\u0000\u0726\u0728\u0005t\u0000\u0000\u0727\u0726"+
		"\u0001\u0000\u0000\u0000\u0727\u0728\u0001\u0000\u0000\u0000\u0728\u0729"+
		"\u0001\u0000\u0000\u0000\u0729\u072e\u00036\u001b\u0000\u072a\u072b\u0005"+
		"\u0005\u0000\u0000\u072b\u072d\u00036\u001b\u0000\u072c\u072a\u0001\u0000"+
		"\u0000\u0000\u072d\u0730\u0001\u0000\u0000\u0000\u072e\u072c\u0001\u0000"+
		"\u0000\u0000\u072e\u072f\u0001\u0000\u0000\u0000\u072f\u009d\u0001\u0000"+
		"\u0000\u0000\u0730\u072e\u0001\u0000\u0000\u0000\u0731\u0732\u0005m\u0000"+
		"\u0000\u0732\u0733\u0005(\u0000\u0000\u0733\u0738\u0003\u00a2Q\u0000\u0734"+
		"\u0735\u0005\u0005\u0000\u0000\u0735\u0737\u0003\u00a2Q\u0000\u0736\u0734"+
		"\u0001\u0000\u0000\u0000\u0737\u073a\u0001\u0000\u0000\u0000\u0738\u0736"+
		"\u0001\u0000\u0000\u0000\u0738\u0739\u0001\u0000\u0000\u0000\u0739\u009f"+
		"\u0001\u0000\u0000\u0000\u073a\u0738\u0001\u0000\u0000\u0000\u073b\u073c"+
		"\u0005b\u0000\u0000\u073c\u073f\u0003@ \u0000\u073d\u073e\u0007\u0012"+
		"\u0000\u0000\u073e\u0740\u0003@ \u0000\u073f\u073d\u0001\u0000\u0000\u0000"+
		"\u073f\u0740\u0001\u0000\u0000\u0000\u0740\u00a1\u0001\u0000\u0000\u0000"+
		"\u0741\u0744\u0003@ \u0000\u0742\u0743\u0005-\u0000\u0000\u0743\u0745"+
		"\u0003\u00d4j\u0000\u0744\u0742\u0001\u0000\u0000\u0000\u0744\u0745\u0001"+
		"\u0000\u0000\u0000\u0745\u0747\u0001\u0000\u0000\u0000\u0746\u0748\u0003"+
		"\u00a4R\u0000\u0747\u0746\u0001\u0000\u0000\u0000\u0747\u0748\u0001\u0000"+
		"\u0000\u0000\u0748\u074b\u0001\u0000\u0000\u0000\u0749\u074a\u0005\u00af"+
		"\u0000\u0000\u074a\u074c\u0007\u0013\u0000\u0000\u074b\u0749\u0001\u0000"+
		"\u0000\u0000\u074b\u074c\u0001\u0000\u0000\u0000\u074c\u00a3\u0001\u0000"+
		"\u0000\u0000\u074d\u074e\u0007\u0014\u0000\u0000\u074e\u00a5\u0001\u0000"+
		"\u0000\u0000\u074f\u0750\u0003@ \u0000\u0750\u0751\u0005\u009b\u0000\u0000"+
		"\u0751\u075a\u0001\u0000\u0000\u0000\u0752\u0753\u0003@ \u0000\u0753\u0754"+
		"\u0005\u009e\u0000\u0000\u0754\u075a\u0001\u0000\u0000\u0000\u0755\u0756"+
		"\u0005\u009d\u0000\u0000\u0756\u075a\u0005\u007f\u0000\u0000\u0757\u0758"+
		"\u0005\u009c\u0000\u0000\u0758\u075a\u0005\u009b\u0000\u0000\u0759\u074f"+
		"\u0001\u0000\u0000\u0000\u0759\u0752\u0001\u0000\u0000\u0000\u0759\u0755"+
		"\u0001\u0000\u0000\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u075a\u00a7"+
		"\u0001\u0000\u0000\u0000\u075b\u075c\u0003@ \u0000\u075c\u075d\u0005\u009b"+
		"\u0000\u0000\u075d\u0766\u0001\u0000\u0000\u0000\u075e\u075f\u0003@ \u0000"+
		"\u075f\u0760\u0005\u009e\u0000\u0000\u0760\u0766\u0001\u0000\u0000\u0000"+
		"\u0761\u0762\u0005\u009d\u0000\u0000\u0762\u0766\u0005\u007f\u0000\u0000"+
		"\u0763\u0764\u0005\u009c\u0000\u0000\u0764\u0766\u0005\u009e\u0000\u0000"+
		"\u0765\u075b\u0001\u0000\u0000\u0000\u0765\u075e\u0001\u0000\u0000\u0000"+
		"\u0765\u0761\u0001\u0000\u0000\u0000\u0765\u0763\u0001\u0000\u0000\u0000"+
		"\u0766\u00a9\u0001\u0000\u0000\u0000\u0767\u0768\u0003@ \u0000\u0768\u0769"+
		"\u0005\u009b\u0000\u0000\u0769\u076f\u0001\u0000\u0000\u0000\u076a\u076b"+
		"\u0005\u009c\u0000\u0000\u076b\u076f\u0005\u009b\u0000\u0000\u076c\u076d"+
		"\u0005\u009d\u0000\u0000\u076d\u076f\u0005\u007f\u0000\u0000\u076e\u0767"+
		"\u0001\u0000\u0000\u0000\u076e\u076a\u0001\u0000\u0000\u0000\u076e\u076c"+
		"\u0001\u0000\u0000\u0000\u076f\u00ab\u0001\u0000\u0000\u0000\u0770\u0771"+
		"\u0007\u0015\u0000\u0000\u0771\u0772\u0005\u0003\u0000\u0000\u0772\u0773"+
		"\u0003@ \u0000\u0773\u0774\u0005\u0004\u0000\u0000\u0774\u0775\u0005\u0098"+
		"\u0000\u0000\u0775\u0777\u0005\u0003\u0000\u0000\u0776\u0778\u0003\u00b2"+
		"Y\u0000\u0777\u0776\u0001\u0000\u0000\u0000\u0777\u0778\u0001\u0000\u0000"+
		"\u0000\u0778\u0779\u0001\u0000\u0000\u0000\u0779\u077b\u0003\u00b6[\u0000"+
		"\u077a\u077c\u0003\u0094J\u0000\u077b\u077a\u0001\u0000\u0000\u0000\u077b"+
		"\u077c\u0001\u0000\u0000\u0000\u077c\u077d\u0001\u0000\u0000\u0000\u077d"+
		"\u077e\u0005\u0004\u0000\u0000\u077e\u07c6\u0001\u0000\u0000\u0000\u077f"+
		"\u0780\u0007\u0016\u0000\u0000\u0780\u0781\u0005\u0003\u0000\u0000\u0781"+
		"\u0782\u0005\u0004\u0000\u0000\u0782\u0783\u0005\u0098\u0000\u0000\u0783"+
		"\u0785\u0005\u0003\u0000\u0000\u0784\u0786\u0003\u00b2Y\u0000\u0785\u0784"+
		"\u0001\u0000\u0000\u0000\u0785\u0786\u0001\u0000\u0000\u0000\u0786\u0788"+
		"\u0001\u0000\u0000\u0000\u0787\u0789\u0003\u00b4Z\u0000\u0788\u0787\u0001"+
		"\u0000\u0000\u0000\u0788\u0789\u0001\u0000\u0000\u0000\u0789\u078a\u0001"+
		"\u0000\u0000\u0000\u078a\u07c6\u0005\u0004\u0000\u0000\u078b\u078c\u0007"+
		"\u0017\u0000\u0000\u078c\u078d\u0005\u0003\u0000\u0000\u078d\u078e\u0005"+
		"\u0004\u0000\u0000\u078e\u078f\u0005\u0098\u0000\u0000\u078f\u0791\u0005"+
		"\u0003\u0000\u0000\u0790\u0792\u0003\u00b2Y\u0000\u0791\u0790\u0001\u0000"+
		"\u0000\u0000\u0791\u0792\u0001\u0000\u0000\u0000\u0792\u0793\u0001\u0000"+
		"\u0000\u0000\u0793\u0794\u0003\u00b6[\u0000\u0794\u0795\u0005\u0004\u0000"+
		"\u0000\u0795\u07c6\u0001\u0000\u0000\u0000\u0796\u0797\u0007\u0018\u0000"+
		"\u0000\u0797\u0798\u0005\u0003\u0000\u0000\u0798\u079a\u0003@ \u0000\u0799"+
		"\u079b\u0003\u00aeW\u0000\u079a\u0799\u0001\u0000\u0000\u0000\u079a\u079b"+
		"\u0001\u0000\u0000\u0000\u079b\u079d\u0001\u0000\u0000\u0000\u079c\u079e"+
		"\u0003\u00b0X\u0000\u079d\u079c\u0001\u0000\u0000\u0000\u079d\u079e\u0001"+
		"\u0000\u0000\u0000\u079e\u079f\u0001\u0000\u0000\u0000\u079f\u07a0\u0005"+
		"\u0004\u0000\u0000\u07a0\u07a1\u0005\u0098\u0000\u0000\u07a1\u07a3\u0005"+
		"\u0003\u0000\u0000\u07a2\u07a4\u0003\u00b2Y\u0000\u07a3\u07a2\u0001\u0000"+
		"\u0000\u0000\u07a3\u07a4\u0001\u0000\u0000\u0000\u07a4\u07a5\u0001\u0000"+
		"\u0000\u0000\u07a5\u07a6\u0003\u00b6[\u0000\u07a6\u07a7\u0005\u0004\u0000"+
		"\u0000\u07a7\u07c6\u0001\u0000\u0000\u0000\u07a8\u07a9\u0005\u00a4\u0000"+
		"\u0000\u07a9\u07aa\u0005\u0003\u0000\u0000\u07aa\u07ab\u0003@ \u0000\u07ab"+
		"\u07ac\u0005\u0005\u0000\u0000\u07ac\u07ad\u0003\"\u0011\u0000\u07ad\u07ae"+
		"\u0005\u0004\u0000\u0000\u07ae\u07af\u0005\u0098\u0000\u0000\u07af\u07b1"+
		"\u0005\u0003\u0000\u0000\u07b0\u07b2\u0003\u00b2Y\u0000\u07b1\u07b0\u0001"+
		"\u0000\u0000\u0000\u07b1\u07b2\u0001\u0000\u0000\u0000\u07b2\u07b3\u0001"+
		"\u0000\u0000\u0000\u07b3\u07b5\u0003\u00b6[\u0000\u07b4\u07b6\u0003\u0094"+
		"J\u0000\u07b5\u07b4\u0001\u0000\u0000\u0000\u07b5\u07b6\u0001\u0000\u0000"+
		"\u0000\u07b6\u07b7\u0001\u0000\u0000\u0000\u07b7\u07b8\u0005\u0004\u0000"+
		"\u0000\u07b8\u07c6\u0001\u0000\u0000\u0000\u07b9\u07ba\u0005\u00a5\u0000"+
		"\u0000\u07ba\u07bb\u0005\u0003\u0000\u0000\u07bb\u07bc\u0003@ \u0000\u07bc"+
		"\u07bd\u0005\u0004\u0000\u0000\u07bd\u07be\u0005\u0098\u0000\u0000\u07be"+
		"\u07c0\u0005\u0003\u0000\u0000\u07bf\u07c1\u0003\u00b2Y\u0000\u07c0\u07bf"+
		"\u0001\u0000\u0000\u0000\u07c0\u07c1\u0001\u0000\u0000\u0000\u07c1\u07c2"+
		"\u0001\u0000\u0000\u0000\u07c2\u07c3\u0003\u00b6[\u0000\u07c3\u07c4\u0005"+
		"\u0004\u0000\u0000\u07c4\u07c6\u0001\u0000\u0000\u0000\u07c5\u0770\u0001"+
		"\u0000\u0000\u0000\u07c5\u077f\u0001\u0000\u0000\u0000\u07c5\u078b\u0001"+
		"\u0000\u0000\u0000\u07c5\u0796\u0001\u0000\u0000\u0000\u07c5\u07a8\u0001"+
		"\u0000\u0000\u0000\u07c5\u07b9\u0001\u0000\u0000\u0000\u07c6\u00ad\u0001"+
		"\u0000\u0000\u0000\u07c7\u07c8\u0005\u0005\u0000\u0000\u07c8\u07c9\u0003"+
		"\"\u0011\u0000\u07c9\u00af\u0001\u0000\u0000\u0000\u07ca\u07cb\u0005\u0005"+
		"\u0000\u0000\u07cb\u07cc\u0003\"\u0011\u0000\u07cc\u00b1\u0001\u0000\u0000"+
		"\u0000\u07cd\u07ce\u0005\u0099\u0000\u0000\u07ce\u07d0\u0005(\u0000\u0000"+
		"\u07cf\u07d1\u0003@ \u0000\u07d0\u07cf\u0001\u0000\u0000\u0000\u07d1\u07d2"+
		"\u0001\u0000\u0000\u0000\u07d2\u07d0\u0001\u0000\u0000\u0000\u07d2\u07d3"+
		"\u0001\u0000\u0000\u0000\u07d3\u00b3\u0001\u0000\u0000\u0000\u07d4\u07d5"+
		"\u0005m\u0000\u0000\u07d5\u07d7\u0005(\u0000\u0000\u07d6\u07d8\u0003@"+
		" \u0000\u07d7\u07d6\u0001\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000"+
		"\u0000\u07d9\u07d7\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000\u0000"+
		"\u0000\u07da\u00b5\u0001\u0000\u0000\u0000\u07db\u07dc\u0005m\u0000\u0000"+
		"\u07dc\u07dd\u0005(\u0000\u0000\u07dd\u07de\u0003\u00b8\\\u0000\u07de"+
		"\u00b7\u0001\u0000\u0000\u0000\u07df\u07e1\u0003@ \u0000\u07e0\u07e2\u0003"+
		"\u00a4R\u0000\u07e1\u07e0\u0001\u0000\u0000\u0000\u07e1\u07e2\u0001\u0000"+
		"\u0000\u0000\u07e2\u07ea\u0001\u0000\u0000\u0000\u07e3\u07e4\u0005\u0005"+
		"\u0000\u0000\u07e4\u07e6\u0003@ \u0000\u07e5\u07e7\u0003\u00a4R\u0000"+
		"\u07e6\u07e5\u0001\u0000\u0000\u0000\u07e6\u07e7\u0001\u0000\u0000\u0000"+
		"\u07e7\u07e9\u0001\u0000\u0000\u0000\u07e8\u07e3\u0001\u0000\u0000\u0000"+
		"\u07e9\u07ec\u0001\u0000\u0000\u0000\u07ea\u07e8\u0001\u0000\u0000\u0000"+
		"\u07ea\u07eb\u0001\u0000\u0000\u0000\u07eb\u00b9\u0001\u0000\u0000\u0000"+
		"\u07ec\u07ea\u0001\u0000\u0000\u0000\u07ed\u07ee\u0003`0\u0000\u07ee\u00bb"+
		"\u0001\u0000\u0000\u0000\u07ef\u07f0\u0003`0\u0000\u07f0\u00bd\u0001\u0000"+
		"\u0000\u0000\u07f1\u07f6\u0005\t\u0000\u0000\u07f2\u07f6\u0005\b\u0000"+
		"\u0000\u07f3\u07f6\u0005\n\u0000\u0000\u07f4\u07f6\u0003J%\u0000\u07f5"+
		"\u07f1\u0001\u0000\u0000\u0000\u07f5\u07f2\u0001\u0000\u0000\u0000\u07f5"+
		"\u07f3\u0001\u0000\u0000\u0000\u07f5\u07f4\u0001\u0000\u0000\u0000\u07f6"+
		"\u00bf\u0001\u0000\u0000\u0000\u07f7\u07f8\u0005\u00bc\u0000\u0000\u07f8"+
		"\u00c1\u0001\u0000\u0000\u0000\u07f9\u07fc\u0003@ \u0000\u07fa\u07fc\u0003"+
		"\u001c\u000e\u0000\u07fb\u07f9\u0001\u0000\u0000\u0000\u07fb\u07fa\u0001"+
		"\u0000\u0000\u0000\u07fc\u00c3\u0001\u0000\u0000\u0000\u07fd\u07fe\u0007"+
		"\u0019\u0000\u0000\u07fe\u00c5\u0001\u0000\u0000\u0000\u07ff\u0800\u0007"+
		"\u001a\u0000\u0000\u0800\u00c7\u0001\u0000\u0000\u0000\u0801\u0802\u0003"+
		"\u00f6{\u0000\u0802\u00c9\u0001\u0000\u0000\u0000\u0803\u0804\u0003\u00f6"+
		"{\u0000\u0804\u00cb\u0001\u0000\u0000\u0000\u0805\u0806\u0003\u00f6{\u0000"+
		"\u0806\u00cd\u0001\u0000\u0000\u0000\u0807\u0808\u0003\u00f6{\u0000\u0808"+
		"\u00cf\u0001\u0000\u0000\u0000\u0809\u080a\u0003\u00f6{\u0000\u080a\u00d1"+
		"\u0001\u0000\u0000\u0000\u080b\u080c\u0003\u00f6{\u0000\u080c\u00d3\u0001"+
		"\u0000\u0000\u0000\u080d\u080e\u0003\u00f6{\u0000\u080e\u00d5\u0001\u0000"+
		"\u0000\u0000\u080f\u0810\u0003\u00f6{\u0000\u0810\u00d7\u0001\u0000\u0000"+
		"\u0000\u0811\u0812\u0003\u00f6{\u0000\u0812\u00d9\u0001\u0000\u0000\u0000"+
		"\u0813\u0814\u0003\u00f6{\u0000\u0814\u00db\u0001\u0000\u0000\u0000\u0815"+
		"\u0816\u0003\u00f6{\u0000\u0816\u00dd\u0001\u0000\u0000\u0000\u0817\u0818"+
		"\u0003\u00f6{\u0000\u0818\u00df\u0001\u0000\u0000\u0000\u0819\u081a\u0003"+
		"\u00f6{\u0000\u081a\u00e1\u0001\u0000\u0000\u0000\u081b\u081c\u0003\u00f6"+
		"{\u0000\u081c\u00e3\u0001\u0000\u0000\u0000\u081d\u081e\u0003\u00f6{\u0000"+
		"\u081e\u00e5\u0001\u0000\u0000\u0000\u081f\u0820\u0003\u00f6{\u0000\u0820"+
		"\u00e7\u0001\u0000\u0000\u0000\u0821\u0822\u0003\u00f6{\u0000\u0822\u00e9"+
		"\u0001\u0000\u0000\u0000\u0823\u0824\u0003\u00f6{\u0000\u0824\u00eb\u0001"+
		"\u0000\u0000\u0000\u0825\u0826\u0003\u00f6{\u0000\u0826\u00ed\u0001\u0000"+
		"\u0000\u0000\u0827\u0828\u0003\u00f6{\u0000\u0828\u00ef\u0001\u0000\u0000"+
		"\u0000\u0829\u082a\u0003\u00f6{\u0000\u082a\u00f1\u0001\u0000\u0000\u0000"+
		"\u082b\u082c\u0003\u00f6{\u0000\u082c\u00f3\u0001\u0000\u0000\u0000\u082d"+
		"\u082e\u0003\u00f6{\u0000\u082e\u00f5\u0001\u0000\u0000\u0000\u082f\u0837"+
		"\u0005\u00b9\u0000\u0000\u0830\u0837\u0003\u00c6c\u0000\u0831\u0837\u0005"+
		"\u00bc\u0000\u0000\u0832\u0833\u0005\u0003\u0000\u0000\u0833\u0834\u0003"+
		"\u00f6{\u0000\u0834\u0835\u0005\u0004\u0000\u0000\u0835\u0837\u0001\u0000"+
		"\u0000\u0000\u0836\u082f\u0001\u0000\u0000\u0000\u0836\u0830\u0001\u0000"+
		"\u0000\u0000\u0836\u0831\u0001\u0000\u0000\u0000\u0836\u0832\u0001\u0000"+
		"\u0000\u0000\u0837\u00f7\u0001\u0000\u0000\u0000\u0129\u00fb\u0103\u010a"+
		"\u010f\u0115\u011b\u011d\u0137\u013e\u0145\u014b\u014f\u0154\u0157\u015e"+
		"\u0161\u0165\u016d\u0171\u0173\u0177\u017b\u017f\u0182\u0189\u018f\u0195"+
		"\u019a\u01a5\u01ab\u01af\u01b3\u01b6\u01ba\u01c0\u01c5\u01ce\u01d5\u01db"+
		"\u01df\u01e3\u01e8\u01ee\u01fa\u01fe\u0203\u0206\u0209\u020c\u0210\u0213"+
		"\u0221\u0228\u022f\u0231\u0234\u023a\u023f\u0247\u024c\u025b\u0261\u026b"+
		"\u0270\u027a\u027e\u0280\u0284\u0289\u028b\u0293\u0299\u029e\u02a5\u02b0"+
		"\u02b3\u02b5\u02bc\u02c0\u02c7\u02cd\u02d3\u02d9\u02de\u02e7\u02ec\u02f7"+
		"\u02fc\u0307\u030c\u0310\u0320\u032a\u032f\u0337\u0343\u0348\u0350\u0357"+
		"\u035a\u035d\u0364\u0367\u036a\u036d\u0371\u0379\u037e\u0388\u038d\u0396"+
		"\u039d\u03a1\u03a5\u03a8\u03b0\u03bd\u03c0\u03c8\u03d1\u03d5\u03da\u03fa"+
		"\u03ff\u040b\u0411\u0419\u041d\u0427\u042a\u0430\u0436\u043f\u0442\u0446"+
		"\u0448\u044a\u045b\u0469\u0475\u0480\u0484\u048b\u0491\u0496\u049e\u04a3"+
		"\u04a7\u04aa\u04ae\u04b1\u04b9\u04c4\u04ca\u04cc\u04d4\u04db\u04e2\u04e7"+
		"\u04e9\u04ef\u04f8\u04fd\u0504\u0508\u050a\u050d\u0515\u0519\u051c\u0522"+
		"\u0526\u052b\u0532\u053b\u053f\u0541\u0544\u0548\u054a\u0557\u055a\u055d"+
		"\u0569\u0572\u0576\u0579\u057c\u0581\u0585\u058a\u058d\u0590\u0595\u0599"+
		"\u059c\u05a3\u05a8\u05b1\u05b6\u05b9\u05c1\u05c5\u05ca\u05d0\u05d3\u05dc"+
		"\u05df\u05e1\u05e7\u05eb\u05ef\u05f2\u05ff\u0604\u0608\u060c\u060f\u0614"+
		"\u061a\u0621\u0628\u0631\u0635\u0637\u063b\u063e\u0646\u064c\u0651\u0657"+
		"\u065e\u0665\u066a\u066d\u0670\u0673\u0678\u067d\u0684\u0688\u068c\u0696"+
		"\u069f\u06a2\u06ab\u06af\u06b7\u06c0\u06c3\u06cc\u06cf\u06d2\u06d5\u06df"+
		"\u06e1\u06ea\u06f3\u06f7\u06fe\u0705\u0709\u070d\u0716\u071a\u071e\u0723"+
		"\u0727\u072e\u0738\u073f\u0744\u0747\u074b\u0759\u0765\u076e\u0777\u077b"+
		"\u0785\u0788\u0791\u079a\u079d\u07a3\u07b1\u07b5\u07c0\u07c5\u07d2\u07d9"+
		"\u07e1\u07e6\u07ea\u07f5\u07fb\u0836";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}