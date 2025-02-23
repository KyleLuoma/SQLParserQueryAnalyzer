// Generated from SQLiteLexer.g4 by ANTLR 4.9.3
package sqlite;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
			"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "ABORT_", "ACTION_", 
			"ADD_", "AFTER_", "ALL_", "ALTER_", "ANALYZE_", "AND_", "AS_", "ASC_", 
			"ATTACH_", "AUTOINCREMENT_", "BEFORE_", "BEGIN_", "BETWEEN_", "BY_", 
			"CASCADE_", "CASE_", "CAST_", "CHECK_", "COLLATE_", "COLUMN_", "COMMIT_", 
			"CONFLICT_", "CONSTRAINT_", "CREATE_", "CROSS_", "CURRENT_DATE_", "CURRENT_TIME_", 
			"CURRENT_TIMESTAMP_", "DATABASE_", "DEFAULT_", "DEFERRABLE_", "DEFERRED_", 
			"DELETE_", "DESC_", "DETACH_", "DISTINCT_", "DROP_", "EACH_", "ELSE_", 
			"END_", "ESCAPE_", "EXCEPT_", "EXCLUSIVE_", "EXISTS_", "EXPLAIN_", "FAIL_", 
			"FOR_", "FOREIGN_", "FROM_", "FULL_", "GLOB_", "GROUP_", "HAVING_", "IF_", 
			"IGNORE_", "IMMEDIATE_", "IN_", "INDEX_", "INDEXED_", "INITIALLY_", "INNER_", 
			"INSERT_", "INSTEAD_", "INTERSECT_", "INTO_", "IS_", "ISNULL_", "JOIN_", 
			"KEY_", "LEFT_", "LIKE_", "LIMIT_", "MATCH_", "NATURAL_", "NO_", "NOT_", 
			"NOTNULL_", "NULL_", "OF_", "OFFSET_", "ON_", "OR_", "ORDER_", "OUTER_", 
			"PLAN_", "PRAGMA_", "PRIMARY_", "QUERY_", "RAISE_", "RECURSIVE_", "REFERENCES_", 
			"REGEXP_", "REINDEX_", "RELEASE_", "RENAME_", "REPLACE_", "RESTRICT_", 
			"RETURNING_", "RIGHT_", "ROLLBACK_", "ROW_", "ROWS_", "SAVEPOINT_", "SELECT_", 
			"SET_", "TABLE_", "TEMP_", "TEMPORARY_", "THEN_", "TO_", "TRANSACTION_", 
			"TRIGGER_", "UNION_", "UNIQUE_", "UPDATE_", "USING_", "VACUUM_", "VALUES_", 
			"VIEW_", "VIRTUAL_", "WHEN_", "WHERE_", "WITH_", "WITHOUT_", "FIRST_VALUE_", 
			"OVER_", "PARTITION_", "RANGE_", "PRECEDING_", "UNBOUNDED_", "CURRENT_", 
			"FOLLOWING_", "CUME_DIST_", "DENSE_RANK_", "LAG_", "LAST_VALUE_", "LEAD_", 
			"NTH_VALUE_", "NTILE_", "PERCENT_RANK_", "RANK_", "ROW_NUMBER_", "GENERATED_", 
			"ALWAYS_", "STORED_", "TRUE_", "FALSE_", "WINDOW_", "NULLS_", "FIRST_", 
			"LAST_", "FILTER_", "GROUPS_", "EXCLUDE_", "TIES_", "OTHERS_", "DO_", 
			"NOTHING_", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR", "HEX_DIGIT", "DIGIT"
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


	public SQLiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLiteLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00c3\u06aa\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3="+
		"\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A"+
		"\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E"+
		"\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L"+
		"\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3"+
		"^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3"+
		"b\3b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3j\3j\3j\3"+
		"k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3m\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3"+
		"o\3o\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3s\3"+
		"s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3v\3v\3"+
		"v\3v\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3"+
		"x\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3~\3~\3~\3"+
		"~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u061c\n\u00ba"+
		"\f\u00ba\16\u00ba\u061f\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\7\u00ba\u0626\n\u00ba\f\u00ba\16\u00ba\u0629\13\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\7\u00ba\u062e\n\u00ba\f\u00ba\16\u00ba\u0631\13\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\7\u00ba\u0636\n\u00ba\f\u00ba\16\u00ba\u0639\13\u00ba"+
		"\5\u00ba\u063b\n\u00ba\3\u00bb\6\u00bb\u063e\n\u00bb\r\u00bb\16\u00bb"+
		"\u063f\3\u00bb\3\u00bb\7\u00bb\u0644\n\u00bb\f\u00bb\16\u00bb\u0647\13"+
		"\u00bb\5\u00bb\u0649\n\u00bb\3\u00bb\3\u00bb\6\u00bb\u064d\n\u00bb\r\u00bb"+
		"\16\u00bb\u064e\5\u00bb\u0651\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0655\n"+
		"\u00bb\3\u00bb\6\u00bb\u0658\n\u00bb\r\u00bb\16\u00bb\u0659\5\u00bb\u065c"+
		"\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\6\u00bb\u0662\n\u00bb\r\u00bb"+
		"\16\u00bb\u0663\5\u00bb\u0666\n\u00bb\3\u00bc\3\u00bc\7\u00bc\u066a\n"+
		"\u00bc\f\u00bc\16\u00bc\u066d\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0671\n"+
		"\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0677\n\u00bd\f\u00bd\16"+
		"\u00bd\u067a\13\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0685\n\u00bf\f\u00bf\16\u00bf\u0688"+
		"\13\u00bf\3\u00bf\5\u00bf\u068b\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u068f"+
		"\n\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u0697"+
		"\n\u00c0\f\u00c0\16\u00c0\u069a\13\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\3\u0698\2\u00c5\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1"+
		"b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5"+
		"l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9"+
		"v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd"+
		"\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105\u0084\u0107\u0085\u0109"+
		"\u0086\u010b\u0087\u010d\u0088\u010f\u0089\u0111\u008a\u0113\u008b\u0115"+
		"\u008c\u0117\u008d\u0119\u008e\u011b\u008f\u011d\u0090\u011f\u0091\u0121"+
		"\u0092\u0123\u0093\u0125\u0094\u0127\u0095\u0129\u0096\u012b\u0097\u012d"+
		"\u0098\u012f\u0099\u0131\u009a\u0133\u009b\u0135\u009c\u0137\u009d\u0139"+
		"\u009e\u013b\u009f\u013d\u00a0\u013f\u00a1\u0141\u00a2\u0143\u00a3\u0145"+
		"\u00a4\u0147\u00a5\u0149\u00a6\u014b\u00a7\u014d\u00a8\u014f\u00a9\u0151"+
		"\u00aa\u0153\u00ab\u0155\u00ac\u0157\u00ad\u0159\u00ae\u015b\u00af\u015d"+
		"\u00b0\u015f\u00b1\u0161\u00b2\u0163\u00b3\u0165\u00b4\u0167\u00b5\u0169"+
		"\u00b6\u016b\u00b7\u016d\u00b8\u016f\u00b9\u0171\u00ba\u0173\u00bb\u0175"+
		"\u00bc\u0177\u00bd\u0179\u00be\u017b\u00bf\u017d\u00c0\u017f\u00c1\u0181"+
		"\u00c2\u0183\u00c3\u0185\2\u0187\2\3\2\16\3\2$$\3\2bb\3\2__\4\2C\\aa\5"+
		"\2\62;C\\aa\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17\5\2\13\r\17\17\"\"\4"+
		"\2\62;CH\3\2\62;\2\u06c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af"+
		"\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1"+
		"\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2"+
		"\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7"+
		"\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109"+
		"\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b"+
		"\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2"+
		"\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d"+
		"\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2"+
		"\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\2\u013f"+
		"\3\2\2\2\2\u0141\3\2\2\2\2\u0143\3\2\2\2\2\u0145\3\2\2\2\2\u0147\3\2\2"+
		"\2\2\u0149\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0151"+
		"\3\2\2\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2\2\2\u0159\3\2\2"+
		"\2\2\u015b\3\2\2\2\2\u015d\3\2\2\2\2\u015f\3\2\2\2\2\u0161\3\2\2\2\2\u0163"+
		"\3\2\2\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2\2\2\u016b\3\2\2"+
		"\2\2\u016d\3\2\2\2\2\u016f\3\2\2\2\2\u0171\3\2\2\2\2\u0173\3\2\2\2\2\u0175"+
		"\3\2\2\2\2\u0177\3\2\2\2\2\u0179\3\2\2\2\2\u017b\3\2\2\2\2\u017d\3\2\2"+
		"\2\2\u017f\3\2\2\2\2\u0181\3\2\2\2\2\u0183\3\2\2\2\3\u0189\3\2\2\2\5\u018b"+
		"\3\2\2\2\7\u018d\3\2\2\2\t\u018f\3\2\2\2\13\u0191\3\2\2\2\r\u0193\3\2"+
		"\2\2\17\u0195\3\2\2\2\21\u0197\3\2\2\2\23\u0199\3\2\2\2\25\u019b\3\2\2"+
		"\2\27\u019d\3\2\2\2\31\u01a0\3\2\2\2\33\u01a2\3\2\2\2\35\u01a4\3\2\2\2"+
		"\37\u01a7\3\2\2\2!\u01aa\3\2\2\2#\u01ac\3\2\2\2%\u01ae\3\2\2\2\'\u01b0"+
		"\3\2\2\2)\u01b3\3\2\2\2+\u01b5\3\2\2\2-\u01b8\3\2\2\2/\u01bb\3\2\2\2\61"+
		"\u01be\3\2\2\2\63\u01c1\3\2\2\2\65\u01c7\3\2\2\2\67\u01ce\3\2\2\29\u01d2"+
		"\3\2\2\2;\u01d8\3\2\2\2=\u01dc\3\2\2\2?\u01e2\3\2\2\2A\u01ea\3\2\2\2C"+
		"\u01ee\3\2\2\2E\u01f1\3\2\2\2G\u01f5\3\2\2\2I\u01fc\3\2\2\2K\u020a\3\2"+
		"\2\2M\u0211\3\2\2\2O\u0217\3\2\2\2Q\u021f\3\2\2\2S\u0222\3\2\2\2U\u022a"+
		"\3\2\2\2W\u022f\3\2\2\2Y\u0234\3\2\2\2[\u023a\3\2\2\2]\u0242\3\2\2\2_"+
		"\u0249\3\2\2\2a\u0250\3\2\2\2c\u0259\3\2\2\2e\u0264\3\2\2\2g\u026b\3\2"+
		"\2\2i\u0271\3\2\2\2k\u027e\3\2\2\2m\u028b\3\2\2\2o\u029d\3\2\2\2q\u02a6"+
		"\3\2\2\2s\u02ae\3\2\2\2u\u02b9\3\2\2\2w\u02c2\3\2\2\2y\u02c9\3\2\2\2{"+
		"\u02ce\3\2\2\2}\u02d5\3\2\2\2\177\u02de\3\2\2\2\u0081\u02e3\3\2\2\2\u0083"+
		"\u02e8\3\2\2\2\u0085\u02ed\3\2\2\2\u0087\u02f1\3\2\2\2\u0089\u02f8\3\2"+
		"\2\2\u008b\u02ff\3\2\2\2\u008d\u0309\3\2\2\2\u008f\u0310\3\2\2\2\u0091"+
		"\u0318\3\2\2\2\u0093\u031d\3\2\2\2\u0095\u0321\3\2\2\2\u0097\u0329\3\2"+
		"\2\2\u0099\u032e\3\2\2\2\u009b\u0333\3\2\2\2\u009d\u0338\3\2\2\2\u009f"+
		"\u033e\3\2\2\2\u00a1\u0345\3\2\2\2\u00a3\u0348\3\2\2\2\u00a5\u034f\3\2"+
		"\2\2\u00a7\u0359\3\2\2\2\u00a9\u035c\3\2\2\2\u00ab\u0362\3\2\2\2\u00ad"+
		"\u036a\3\2\2\2\u00af\u0374\3\2\2\2\u00b1\u037a\3\2\2\2\u00b3\u0381\3\2"+
		"\2\2\u00b5\u0389\3\2\2\2\u00b7\u0393\3\2\2\2\u00b9\u0398\3\2\2\2\u00bb"+
		"\u039b\3\2\2\2\u00bd\u03a2\3\2\2\2\u00bf\u03a7\3\2\2\2\u00c1\u03ab\3\2"+
		"\2\2\u00c3\u03b0\3\2\2\2\u00c5\u03b5\3\2\2\2\u00c7\u03bb\3\2\2\2\u00c9"+
		"\u03c1\3\2\2\2\u00cb\u03c9\3\2\2\2\u00cd\u03cc\3\2\2\2\u00cf\u03d0\3\2"+
		"\2\2\u00d1\u03d8\3\2\2\2\u00d3\u03dd\3\2\2\2\u00d5\u03e0\3\2\2\2\u00d7"+
		"\u03e7\3\2\2\2\u00d9\u03ea\3\2\2\2\u00db\u03ed\3\2\2\2\u00dd\u03f3\3\2"+
		"\2\2\u00df\u03f9\3\2\2\2\u00e1\u03fe\3\2\2\2\u00e3\u0405\3\2\2\2\u00e5"+
		"\u040d\3\2\2\2\u00e7\u0413\3\2\2\2\u00e9\u0419\3\2\2\2\u00eb\u0423\3\2"+
		"\2\2\u00ed\u042e\3\2\2\2\u00ef\u0435\3\2\2\2\u00f1\u043d\3\2\2\2\u00f3"+
		"\u0445\3\2\2\2\u00f5\u044c\3\2\2\2\u00f7\u0454\3\2\2\2\u00f9\u045d\3\2"+
		"\2\2\u00fb\u0467\3\2\2\2\u00fd\u046d\3\2\2\2\u00ff\u0476\3\2\2\2\u0101"+
		"\u047a\3\2\2\2\u0103\u047f\3\2\2\2\u0105\u0489\3\2\2\2\u0107\u0490\3\2"+
		"\2\2\u0109\u0494\3\2\2\2\u010b\u049a\3\2\2\2\u010d\u049f\3\2\2\2\u010f"+
		"\u04a9\3\2\2\2\u0111\u04ae\3\2\2\2\u0113\u04b1\3\2\2\2\u0115\u04bd\3\2"+
		"\2\2\u0117\u04c5\3\2\2\2\u0119\u04cb\3\2\2\2\u011b\u04d2\3\2\2\2\u011d"+
		"\u04d9\3\2\2\2\u011f\u04df\3\2\2\2\u0121\u04e6\3\2\2\2\u0123\u04ed\3\2"+
		"\2\2\u0125\u04f2\3\2\2\2\u0127\u04fa\3\2\2\2\u0129\u04ff\3\2\2\2\u012b"+
		"\u0505\3\2\2\2\u012d\u050a\3\2\2\2\u012f\u0512\3\2\2\2\u0131\u051e\3\2"+
		"\2\2\u0133\u0523\3\2\2\2\u0135\u052d\3\2\2\2\u0137\u0533\3\2\2\2\u0139"+
		"\u053d\3\2\2\2\u013b\u0547\3\2\2\2\u013d\u054f\3\2\2\2\u013f\u0559\3\2"+
		"\2\2\u0141\u0563\3\2\2\2\u0143\u056e\3\2\2\2\u0145\u0572\3\2\2\2\u0147"+
		"\u057d\3\2\2\2\u0149\u0582\3\2\2\2\u014b\u058c\3\2\2\2\u014d\u0592\3\2"+
		"\2\2\u014f\u059f\3\2\2\2\u0151\u05a4\3\2\2\2\u0153\u05af\3\2\2\2\u0155"+
		"\u05b9\3\2\2\2\u0157\u05c0\3\2\2\2\u0159\u05c7\3\2\2\2\u015b\u05cc\3\2"+
		"\2\2\u015d\u05d2\3\2\2\2\u015f\u05d9\3\2\2\2\u0161\u05df\3\2\2\2\u0163"+
		"\u05e5\3\2\2\2\u0165\u05ea\3\2\2\2\u0167\u05f1\3\2\2\2\u0169\u05f8\3\2"+
		"\2\2\u016b\u0600\3\2\2\2\u016d\u0605\3\2\2\2\u016f\u060c\3\2\2\2\u0171"+
		"\u060f\3\2\2\2\u0173\u063a\3\2\2\2\u0175\u0665\3\2\2\2\u0177\u0670\3\2"+
		"\2\2\u0179\u0672\3\2\2\2\u017b\u067d\3\2\2\2\u017d\u0680\3\2\2\2\u017f"+
		"\u0692\3\2\2\2\u0181\u06a0\3\2\2\2\u0183\u06a4\3\2\2\2\u0185\u06a6\3\2"+
		"\2\2\u0187\u06a8\3\2\2\2\u0189\u018a\7=\2\2\u018a\4\3\2\2\2\u018b\u018c"+
		"\7\60\2\2\u018c\6\3\2\2\2\u018d\u018e\7*\2\2\u018e\b\3\2\2\2\u018f\u0190"+
		"\7+\2\2\u0190\n\3\2\2\2\u0191\u0192\7.\2\2\u0192\f\3\2\2\2\u0193\u0194"+
		"\7?\2\2\u0194\16\3\2\2\2\u0195\u0196\7,\2\2\u0196\20\3\2\2\2\u0197\u0198"+
		"\7-\2\2\u0198\22\3\2\2\2\u0199\u019a\7/\2\2\u019a\24\3\2\2\2\u019b\u019c"+
		"\7\u0080\2\2\u019c\26\3\2\2\2\u019d\u019e\7~\2\2\u019e\u019f\7~\2\2\u019f"+
		"\30\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\32\3\2\2\2\u01a2\u01a3\7\'\2\2"+
		"\u01a3\34\3\2\2\2\u01a4\u01a5\7>\2\2\u01a5\u01a6\7>\2\2\u01a6\36\3\2\2"+
		"\2\u01a7\u01a8\7@\2\2\u01a8\u01a9\7@\2\2\u01a9 \3\2\2\2\u01aa\u01ab\7"+
		"(\2\2\u01ab\"\3\2\2\2\u01ac\u01ad\7~\2\2\u01ad$\3\2\2\2\u01ae\u01af\7"+
		">\2\2\u01af&\3\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2\7?\2\2\u01b2(\3\2"+
		"\2\2\u01b3\u01b4\7@\2\2\u01b4*\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\u01b7"+
		"\7?\2\2\u01b7,\3\2\2\2\u01b8\u01b9\7?\2\2\u01b9\u01ba\7?\2\2\u01ba.\3"+
		"\2\2\2\u01bb\u01bc\7#\2\2\u01bc\u01bd\7?\2\2\u01bd\60\3\2\2\2\u01be\u01bf"+
		"\7>\2\2\u01bf\u01c0\7@\2\2\u01c0\62\3\2\2\2\u01c1\u01c2\7C\2\2\u01c2\u01c3"+
		"\7D\2\2\u01c3\u01c4\7Q\2\2\u01c4\u01c5\7T\2\2\u01c5\u01c6\7V\2\2\u01c6"+
		"\64\3\2\2\2\u01c7\u01c8\7C\2\2\u01c8\u01c9\7E\2\2\u01c9\u01ca\7V\2\2\u01ca"+
		"\u01cb\7K\2\2\u01cb\u01cc\7Q\2\2\u01cc\u01cd\7P\2\2\u01cd\66\3\2\2\2\u01ce"+
		"\u01cf\7C\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\7F\2\2\u01d18\3\2\2\2\u01d2"+
		"\u01d3\7C\2\2\u01d3\u01d4\7H\2\2\u01d4\u01d5\7V\2\2\u01d5\u01d6\7G\2\2"+
		"\u01d6\u01d7\7T\2\2\u01d7:\3\2\2\2\u01d8\u01d9\7C\2\2\u01d9\u01da\7N\2"+
		"\2\u01da\u01db\7N\2\2\u01db<\3\2\2\2\u01dc\u01dd\7C\2\2\u01dd\u01de\7"+
		"N\2\2\u01de\u01df\7V\2\2\u01df\u01e0\7G\2\2\u01e0\u01e1\7T\2\2\u01e1>"+
		"\3\2\2\2\u01e2\u01e3\7C\2\2\u01e3\u01e4\7P\2\2\u01e4\u01e5\7C\2\2\u01e5"+
		"\u01e6\7N\2\2\u01e6\u01e7\7[\2\2\u01e7\u01e8\7\\\2\2\u01e8\u01e9\7G\2"+
		"\2\u01e9@\3\2\2\2\u01ea\u01eb\7C\2\2\u01eb\u01ec\7P\2\2\u01ec\u01ed\7"+
		"F\2\2\u01edB\3\2\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7U\2\2\u01f0D\3\2"+
		"\2\2\u01f1\u01f2\7C\2\2\u01f2\u01f3\7U\2\2\u01f3\u01f4\7E\2\2\u01f4F\3"+
		"\2\2\2\u01f5\u01f6\7C\2\2\u01f6\u01f7\7V\2\2\u01f7\u01f8\7V\2\2\u01f8"+
		"\u01f9\7C\2\2\u01f9\u01fa\7E\2\2\u01fa\u01fb\7J\2\2\u01fbH\3\2\2\2\u01fc"+
		"\u01fd\7C\2\2\u01fd\u01fe\7W\2\2\u01fe\u01ff\7V\2\2\u01ff\u0200\7Q\2\2"+
		"\u0200\u0201\7K\2\2\u0201\u0202\7P\2\2\u0202\u0203\7E\2\2\u0203\u0204"+
		"\7T\2\2\u0204\u0205\7G\2\2\u0205\u0206\7O\2\2\u0206\u0207\7G\2\2\u0207"+
		"\u0208\7P\2\2\u0208\u0209\7V\2\2\u0209J\3\2\2\2\u020a\u020b\7D\2\2\u020b"+
		"\u020c\7G\2\2\u020c\u020d\7H\2\2\u020d\u020e\7Q\2\2\u020e\u020f\7T\2\2"+
		"\u020f\u0210\7G\2\2\u0210L\3\2\2\2\u0211\u0212\7D\2\2\u0212\u0213\7G\2"+
		"\2\u0213\u0214\7I\2\2\u0214\u0215\7K\2\2\u0215\u0216\7P\2\2\u0216N\3\2"+
		"\2\2\u0217\u0218\7D\2\2\u0218\u0219\7G\2\2\u0219\u021a\7V\2\2\u021a\u021b"+
		"\7Y\2\2\u021b\u021c\7G\2\2\u021c\u021d\7G\2\2\u021d\u021e\7P\2\2\u021e"+
		"P\3\2\2\2\u021f\u0220\7D\2\2\u0220\u0221\7[\2\2\u0221R\3\2\2\2\u0222\u0223"+
		"\7E\2\2\u0223\u0224\7C\2\2\u0224\u0225\7U\2\2\u0225\u0226\7E\2\2\u0226"+
		"\u0227\7C\2\2\u0227\u0228\7F\2\2\u0228\u0229\7G\2\2\u0229T\3\2\2\2\u022a"+
		"\u022b\7E\2\2\u022b\u022c\7C\2\2\u022c\u022d\7U\2\2\u022d\u022e\7G\2\2"+
		"\u022eV\3\2\2\2\u022f\u0230\7E\2\2\u0230\u0231\7C\2\2\u0231\u0232\7U\2"+
		"\2\u0232\u0233\7V\2\2\u0233X\3\2\2\2\u0234\u0235\7E\2\2\u0235\u0236\7"+
		"J\2\2\u0236\u0237\7G\2\2\u0237\u0238\7E\2\2\u0238\u0239\7M\2\2\u0239Z"+
		"\3\2\2\2\u023a\u023b\7E\2\2\u023b\u023c\7Q\2\2\u023c\u023d\7N\2\2\u023d"+
		"\u023e\7N\2\2\u023e\u023f\7C\2\2\u023f\u0240\7V\2\2\u0240\u0241\7G\2\2"+
		"\u0241\\\3\2\2\2\u0242\u0243\7E\2\2\u0243\u0244\7Q\2\2\u0244\u0245\7N"+
		"\2\2\u0245\u0246\7W\2\2\u0246\u0247\7O\2\2\u0247\u0248\7P\2\2\u0248^\3"+
		"\2\2\2\u0249\u024a\7E\2\2\u024a\u024b\7Q\2\2\u024b\u024c\7O\2\2\u024c"+
		"\u024d\7O\2\2\u024d\u024e\7K\2\2\u024e\u024f\7V\2\2\u024f`\3\2\2\2\u0250"+
		"\u0251\7E\2\2\u0251\u0252\7Q\2\2\u0252\u0253\7P\2\2\u0253\u0254\7H\2\2"+
		"\u0254\u0255\7N\2\2\u0255\u0256\7K\2\2\u0256\u0257\7E\2\2\u0257\u0258"+
		"\7V\2\2\u0258b\3\2\2\2\u0259\u025a\7E\2\2\u025a\u025b\7Q\2\2\u025b\u025c"+
		"\7P\2\2\u025c\u025d\7U\2\2\u025d\u025e\7V\2\2\u025e\u025f\7T\2\2\u025f"+
		"\u0260\7C\2\2\u0260\u0261\7K\2\2\u0261\u0262\7P\2\2\u0262\u0263\7V\2\2"+
		"\u0263d\3\2\2\2\u0264\u0265\7E\2\2\u0265\u0266\7T\2\2\u0266\u0267\7G\2"+
		"\2\u0267\u0268\7C\2\2\u0268\u0269\7V\2\2\u0269\u026a\7G\2\2\u026af\3\2"+
		"\2\2\u026b\u026c\7E\2\2\u026c\u026d\7T\2\2\u026d\u026e\7Q\2\2\u026e\u026f"+
		"\7U\2\2\u026f\u0270\7U\2\2\u0270h\3\2\2\2\u0271\u0272\7E\2\2\u0272\u0273"+
		"\7W\2\2\u0273\u0274\7T\2\2\u0274\u0275\7T\2\2\u0275\u0276\7G\2\2\u0276"+
		"\u0277\7P\2\2\u0277\u0278\7V\2\2\u0278\u0279\7a\2\2\u0279\u027a\7F\2\2"+
		"\u027a\u027b\7C\2\2\u027b\u027c\7V\2\2\u027c\u027d\7G\2\2\u027dj\3\2\2"+
		"\2\u027e\u027f\7E\2\2\u027f\u0280\7W\2\2\u0280\u0281\7T\2\2\u0281\u0282"+
		"\7T\2\2\u0282\u0283\7G\2\2\u0283\u0284\7P\2\2\u0284\u0285\7V\2\2\u0285"+
		"\u0286\7a\2\2\u0286\u0287\7V\2\2\u0287\u0288\7K\2\2\u0288\u0289\7O\2\2"+
		"\u0289\u028a\7G\2\2\u028al\3\2\2\2\u028b\u028c\7E\2\2\u028c\u028d\7W\2"+
		"\2\u028d\u028e\7T\2\2\u028e\u028f\7T\2\2\u028f\u0290\7G\2\2\u0290\u0291"+
		"\7P\2\2\u0291\u0292\7V\2\2\u0292\u0293\7a\2\2\u0293\u0294\7V\2\2\u0294"+
		"\u0295\7K\2\2\u0295\u0296\7O\2\2\u0296\u0297\7G\2\2\u0297\u0298\7U\2\2"+
		"\u0298\u0299\7V\2\2\u0299\u029a\7C\2\2\u029a\u029b\7O\2\2\u029b\u029c"+
		"\7R\2\2\u029cn\3\2\2\2\u029d\u029e\7F\2\2\u029e\u029f\7C\2\2\u029f\u02a0"+
		"\7V\2\2\u02a0\u02a1\7C\2\2\u02a1\u02a2\7D\2\2\u02a2\u02a3\7C\2\2\u02a3"+
		"\u02a4\7U\2\2\u02a4\u02a5\7G\2\2\u02a5p\3\2\2\2\u02a6\u02a7\7F\2\2\u02a7"+
		"\u02a8\7G\2\2\u02a8\u02a9\7H\2\2\u02a9\u02aa\7C\2\2\u02aa\u02ab\7W\2\2"+
		"\u02ab\u02ac\7N\2\2\u02ac\u02ad\7V\2\2\u02adr\3\2\2\2\u02ae\u02af\7F\2"+
		"\2\u02af\u02b0\7G\2\2\u02b0\u02b1\7H\2\2\u02b1\u02b2\7G\2\2\u02b2\u02b3"+
		"\7T\2\2\u02b3\u02b4\7T\2\2\u02b4\u02b5\7C\2\2\u02b5\u02b6\7D\2\2\u02b6"+
		"\u02b7\7N\2\2\u02b7\u02b8\7G\2\2\u02b8t\3\2\2\2\u02b9\u02ba\7F\2\2\u02ba"+
		"\u02bb\7G\2\2\u02bb\u02bc\7H\2\2\u02bc\u02bd\7G\2\2\u02bd\u02be\7T\2\2"+
		"\u02be\u02bf\7T\2\2\u02bf\u02c0\7G\2\2\u02c0\u02c1\7F\2\2\u02c1v\3\2\2"+
		"\2\u02c2\u02c3\7F\2\2\u02c3\u02c4\7G\2\2\u02c4\u02c5\7N\2\2\u02c5\u02c6"+
		"\7G\2\2\u02c6\u02c7\7V\2\2\u02c7\u02c8\7G\2\2\u02c8x\3\2\2\2\u02c9\u02ca"+
		"\7F\2\2\u02ca\u02cb\7G\2\2\u02cb\u02cc\7U\2\2\u02cc\u02cd\7E\2\2\u02cd"+
		"z\3\2\2\2\u02ce\u02cf\7F\2\2\u02cf\u02d0\7G\2\2\u02d0\u02d1\7V\2\2\u02d1"+
		"\u02d2\7C\2\2\u02d2\u02d3\7E\2\2\u02d3\u02d4\7J\2\2\u02d4|\3\2\2\2\u02d5"+
		"\u02d6\7F\2\2\u02d6\u02d7\7K\2\2\u02d7\u02d8\7U\2\2\u02d8\u02d9\7V\2\2"+
		"\u02d9\u02da\7K\2\2\u02da\u02db\7P\2\2\u02db\u02dc\7E\2\2\u02dc\u02dd"+
		"\7V\2\2\u02dd~\3\2\2\2\u02de\u02df\7F\2\2\u02df\u02e0\7T\2\2\u02e0\u02e1"+
		"\7Q\2\2\u02e1\u02e2\7R\2\2\u02e2\u0080\3\2\2\2\u02e3\u02e4\7G\2\2\u02e4"+
		"\u02e5\7C\2\2\u02e5\u02e6\7E\2\2\u02e6\u02e7\7J\2\2\u02e7\u0082\3\2\2"+
		"\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\7N\2\2\u02ea\u02eb\7U\2\2\u02eb\u02ec"+
		"\7G\2\2\u02ec\u0084\3\2\2\2\u02ed\u02ee\7G\2\2\u02ee\u02ef\7P\2\2\u02ef"+
		"\u02f0\7F\2\2\u02f0\u0086\3\2\2\2\u02f1\u02f2\7G\2\2\u02f2\u02f3\7U\2"+
		"\2\u02f3\u02f4\7E\2\2\u02f4\u02f5\7C\2\2\u02f5\u02f6\7R\2\2\u02f6\u02f7"+
		"\7G\2\2\u02f7\u0088\3\2\2\2\u02f8\u02f9\7G\2\2\u02f9\u02fa\7Z\2\2\u02fa"+
		"\u02fb\7E\2\2\u02fb\u02fc\7G\2\2\u02fc\u02fd\7R\2\2\u02fd\u02fe\7V\2\2"+
		"\u02fe\u008a\3\2\2\2\u02ff\u0300\7G\2\2\u0300\u0301\7Z\2\2\u0301\u0302"+
		"\7E\2\2\u0302\u0303\7N\2\2\u0303\u0304\7W\2\2\u0304\u0305\7U\2\2\u0305"+
		"\u0306\7K\2\2\u0306\u0307\7X\2\2\u0307\u0308\7G\2\2\u0308\u008c\3\2\2"+
		"\2\u0309\u030a\7G\2\2\u030a\u030b\7Z\2\2\u030b\u030c\7K\2\2\u030c\u030d"+
		"\7U\2\2\u030d\u030e\7V\2\2\u030e\u030f\7U\2\2\u030f\u008e\3\2\2\2\u0310"+
		"\u0311\7G\2\2\u0311\u0312\7Z\2\2\u0312\u0313\7R\2\2\u0313\u0314\7N\2\2"+
		"\u0314\u0315\7C\2\2\u0315\u0316\7K\2\2\u0316\u0317\7P\2\2\u0317\u0090"+
		"\3\2\2\2\u0318\u0319\7H\2\2\u0319\u031a\7C\2\2\u031a\u031b\7K\2\2\u031b"+
		"\u031c\7N\2\2\u031c\u0092\3\2\2\2\u031d\u031e\7H\2\2\u031e\u031f\7Q\2"+
		"\2\u031f\u0320\7T\2\2\u0320\u0094\3\2\2\2\u0321\u0322\7H\2\2\u0322\u0323"+
		"\7Q\2\2\u0323\u0324\7T\2\2\u0324\u0325\7G\2\2\u0325\u0326\7K\2\2\u0326"+
		"\u0327\7I\2\2\u0327\u0328\7P\2\2\u0328\u0096\3\2\2\2\u0329\u032a\7H\2"+
		"\2\u032a\u032b\7T\2\2\u032b\u032c\7Q\2\2\u032c\u032d\7O\2\2\u032d\u0098"+
		"\3\2\2\2\u032e\u032f\7H\2\2\u032f\u0330\7W\2\2\u0330\u0331\7N\2\2\u0331"+
		"\u0332\7N\2\2\u0332\u009a\3\2\2\2\u0333\u0334\7I\2\2\u0334\u0335\7N\2"+
		"\2\u0335\u0336\7Q\2\2\u0336\u0337\7D\2\2\u0337\u009c\3\2\2\2\u0338\u0339"+
		"\7I\2\2\u0339\u033a\7T\2\2\u033a\u033b\7Q\2\2\u033b\u033c\7W\2\2\u033c"+
		"\u033d\7R\2\2\u033d\u009e\3\2\2\2\u033e\u033f\7J\2\2\u033f\u0340\7C\2"+
		"\2\u0340\u0341\7X\2\2\u0341\u0342\7K\2\2\u0342\u0343\7P\2\2\u0343\u0344"+
		"\7I\2\2\u0344\u00a0\3\2\2\2\u0345\u0346\7K\2\2\u0346\u0347\7H\2\2\u0347"+
		"\u00a2\3\2\2\2\u0348\u0349\7K\2\2\u0349\u034a\7I\2\2\u034a\u034b\7P\2"+
		"\2\u034b\u034c\7Q\2\2\u034c\u034d\7T\2\2\u034d\u034e\7G\2\2\u034e\u00a4"+
		"\3\2\2\2\u034f\u0350\7K\2\2\u0350\u0351\7O\2\2\u0351\u0352\7O\2\2\u0352"+
		"\u0353\7G\2\2\u0353\u0354\7F\2\2\u0354\u0355\7K\2\2\u0355\u0356\7C\2\2"+
		"\u0356\u0357\7V\2\2\u0357\u0358\7G\2\2\u0358\u00a6\3\2\2\2\u0359\u035a"+
		"\7K\2\2\u035a\u035b\7P\2\2\u035b\u00a8\3\2\2\2\u035c\u035d\7K\2\2\u035d"+
		"\u035e\7P\2\2\u035e\u035f\7F\2\2\u035f\u0360\7G\2\2\u0360\u0361\7Z\2\2"+
		"\u0361\u00aa\3\2\2\2\u0362\u0363\7K\2\2\u0363\u0364\7P\2\2\u0364\u0365"+
		"\7F\2\2\u0365\u0366\7G\2\2\u0366\u0367\7Z\2\2\u0367\u0368\7G\2\2\u0368"+
		"\u0369\7F\2\2\u0369\u00ac\3\2\2\2\u036a\u036b\7K\2\2\u036b\u036c\7P\2"+
		"\2\u036c\u036d\7K\2\2\u036d\u036e\7V\2\2\u036e\u036f\7K\2\2\u036f\u0370"+
		"\7C\2\2\u0370\u0371\7N\2\2\u0371\u0372\7N\2\2\u0372\u0373\7[\2\2\u0373"+
		"\u00ae\3\2\2\2\u0374\u0375\7K\2\2\u0375\u0376\7P\2\2\u0376\u0377\7P\2"+
		"\2\u0377\u0378\7G\2\2\u0378\u0379\7T\2\2\u0379\u00b0\3\2\2\2\u037a\u037b"+
		"\7K\2\2\u037b\u037c\7P\2\2\u037c\u037d\7U\2\2\u037d\u037e\7G\2\2\u037e"+
		"\u037f\7T\2\2\u037f\u0380\7V\2\2\u0380\u00b2\3\2\2\2\u0381\u0382\7K\2"+
		"\2\u0382\u0383\7P\2\2\u0383\u0384\7U\2\2\u0384\u0385\7V\2\2\u0385\u0386"+
		"\7G\2\2\u0386\u0387\7C\2\2\u0387\u0388\7F\2\2\u0388\u00b4\3\2\2\2\u0389"+
		"\u038a\7K\2\2\u038a\u038b\7P\2\2\u038b\u038c\7V\2\2\u038c\u038d\7G\2\2"+
		"\u038d\u038e\7T\2\2\u038e\u038f\7U\2\2\u038f\u0390\7G\2\2\u0390\u0391"+
		"\7E\2\2\u0391\u0392\7V\2\2\u0392\u00b6\3\2\2\2\u0393\u0394\7K\2\2\u0394"+
		"\u0395\7P\2\2\u0395\u0396\7V\2\2\u0396\u0397\7Q\2\2\u0397\u00b8\3\2\2"+
		"\2\u0398\u0399\7K\2\2\u0399\u039a\7U\2\2\u039a\u00ba\3\2\2\2\u039b\u039c"+
		"\7K\2\2\u039c\u039d\7U\2\2\u039d\u039e\7P\2\2\u039e\u039f\7W\2\2\u039f"+
		"\u03a0\7N\2\2\u03a0\u03a1\7N\2\2\u03a1\u00bc\3\2\2\2\u03a2\u03a3\7L\2"+
		"\2\u03a3\u03a4\7Q\2\2\u03a4\u03a5\7K\2\2\u03a5\u03a6\7P\2\2\u03a6\u00be"+
		"\3\2\2\2\u03a7\u03a8\7M\2\2\u03a8\u03a9\7G\2\2\u03a9\u03aa\7[\2\2\u03aa"+
		"\u00c0\3\2\2\2\u03ab\u03ac\7N\2\2\u03ac\u03ad\7G\2\2\u03ad\u03ae\7H\2"+
		"\2\u03ae\u03af\7V\2\2\u03af\u00c2\3\2\2\2\u03b0\u03b1\7N\2\2\u03b1\u03b2"+
		"\7K\2\2\u03b2\u03b3\7M\2\2\u03b3\u03b4\7G\2\2\u03b4\u00c4\3\2\2\2\u03b5"+
		"\u03b6\7N\2\2\u03b6\u03b7\7K\2\2\u03b7\u03b8\7O\2\2\u03b8\u03b9\7K\2\2"+
		"\u03b9\u03ba\7V\2\2\u03ba\u00c6\3\2\2\2\u03bb\u03bc\7O\2\2\u03bc\u03bd"+
		"\7C\2\2\u03bd\u03be\7V\2\2\u03be\u03bf\7E\2\2\u03bf\u03c0\7J\2\2\u03c0"+
		"\u00c8\3\2\2\2\u03c1\u03c2\7P\2\2\u03c2\u03c3\7C\2\2\u03c3\u03c4\7V\2"+
		"\2\u03c4\u03c5\7W\2\2\u03c5\u03c6\7T\2\2\u03c6\u03c7\7C\2\2\u03c7\u03c8"+
		"\7N\2\2\u03c8\u00ca\3\2\2\2\u03c9\u03ca\7P\2\2\u03ca\u03cb\7Q\2\2\u03cb"+
		"\u00cc\3\2\2\2\u03cc\u03cd\7P\2\2\u03cd\u03ce\7Q\2\2\u03ce\u03cf\7V\2"+
		"\2\u03cf\u00ce\3\2\2\2\u03d0\u03d1\7P\2\2\u03d1\u03d2\7Q\2\2\u03d2\u03d3"+
		"\7V\2\2\u03d3\u03d4\7P\2\2\u03d4\u03d5\7W\2\2\u03d5\u03d6\7N\2\2\u03d6"+
		"\u03d7\7N\2\2\u03d7\u00d0\3\2\2\2\u03d8\u03d9\7P\2\2\u03d9\u03da\7W\2"+
		"\2\u03da\u03db\7N\2\2\u03db\u03dc\7N\2\2\u03dc\u00d2\3\2\2\2\u03dd\u03de"+
		"\7Q\2\2\u03de\u03df\7H\2\2\u03df\u00d4\3\2\2\2\u03e0\u03e1\7Q\2\2\u03e1"+
		"\u03e2\7H\2\2\u03e2\u03e3\7H\2\2\u03e3\u03e4\7U\2\2\u03e4\u03e5\7G\2\2"+
		"\u03e5\u03e6\7V\2\2\u03e6\u00d6\3\2\2\2\u03e7\u03e8\7Q\2\2\u03e8\u03e9"+
		"\7P\2\2\u03e9\u00d8\3\2\2\2\u03ea\u03eb\7Q\2\2\u03eb\u03ec\7T\2\2\u03ec"+
		"\u00da\3\2\2\2\u03ed\u03ee\7Q\2\2\u03ee\u03ef\7T\2\2\u03ef\u03f0\7F\2"+
		"\2\u03f0\u03f1\7G\2\2\u03f1\u03f2\7T\2\2\u03f2\u00dc\3\2\2\2\u03f3\u03f4"+
		"\7Q\2\2\u03f4\u03f5\7W\2\2\u03f5\u03f6\7V\2\2\u03f6\u03f7\7G\2\2\u03f7"+
		"\u03f8\7T\2\2\u03f8\u00de\3\2\2\2\u03f9\u03fa\7R\2\2\u03fa\u03fb\7N\2"+
		"\2\u03fb\u03fc\7C\2\2\u03fc\u03fd\7P\2\2\u03fd\u00e0\3\2\2\2\u03fe\u03ff"+
		"\7R\2\2\u03ff\u0400\7T\2\2\u0400\u0401\7C\2\2\u0401\u0402\7I\2\2\u0402"+
		"\u0403\7O\2\2\u0403\u0404\7C\2\2\u0404\u00e2\3\2\2\2\u0405\u0406\7R\2"+
		"\2\u0406\u0407\7T\2\2\u0407\u0408\7K\2\2\u0408\u0409\7O\2\2\u0409\u040a"+
		"\7C\2\2\u040a\u040b\7T\2\2\u040b\u040c\7[\2\2\u040c\u00e4\3\2\2\2\u040d"+
		"\u040e\7S\2\2\u040e\u040f\7W\2\2\u040f\u0410\7G\2\2\u0410\u0411\7T\2\2"+
		"\u0411\u0412\7[\2\2\u0412\u00e6\3\2\2\2\u0413\u0414\7T\2\2\u0414\u0415"+
		"\7C\2\2\u0415\u0416\7K\2\2\u0416\u0417\7U\2\2\u0417\u0418\7G\2\2\u0418"+
		"\u00e8\3\2\2\2\u0419\u041a\7T\2\2\u041a\u041b\7G\2\2\u041b\u041c\7E\2"+
		"\2\u041c\u041d\7W\2\2\u041d\u041e\7T\2\2\u041e\u041f\7U\2\2\u041f\u0420"+
		"\7K\2\2\u0420\u0421\7X\2\2\u0421\u0422\7G\2\2\u0422\u00ea\3\2\2\2\u0423"+
		"\u0424\7T\2\2\u0424\u0425\7G\2\2\u0425\u0426\7H\2\2\u0426\u0427\7G\2\2"+
		"\u0427\u0428\7T\2\2\u0428\u0429\7G\2\2\u0429\u042a\7P\2\2\u042a\u042b"+
		"\7E\2\2\u042b\u042c\7G\2\2\u042c\u042d\7U\2\2\u042d\u00ec\3\2\2\2\u042e"+
		"\u042f\7T\2\2\u042f\u0430\7G\2\2\u0430\u0431\7I\2\2\u0431\u0432\7G\2\2"+
		"\u0432\u0433\7Z\2\2\u0433\u0434\7R\2\2\u0434\u00ee\3\2\2\2\u0435\u0436"+
		"\7T\2\2\u0436\u0437\7G\2\2\u0437\u0438\7K\2\2\u0438\u0439\7P\2\2\u0439"+
		"\u043a\7F\2\2\u043a\u043b\7G\2\2\u043b\u043c\7Z\2\2\u043c\u00f0\3\2\2"+
		"\2\u043d\u043e\7T\2\2\u043e\u043f\7G\2\2\u043f\u0440\7N\2\2\u0440\u0441"+
		"\7G\2\2\u0441\u0442\7C\2\2\u0442\u0443\7U\2\2\u0443\u0444\7G\2\2\u0444"+
		"\u00f2\3\2\2\2\u0445\u0446\7T\2\2\u0446\u0447\7G\2\2\u0447\u0448\7P\2"+
		"\2\u0448\u0449\7C\2\2\u0449\u044a\7O\2\2\u044a\u044b\7G\2\2\u044b\u00f4"+
		"\3\2\2\2\u044c\u044d\7T\2\2\u044d\u044e\7G\2\2\u044e\u044f\7R\2\2\u044f"+
		"\u0450\7N\2\2\u0450\u0451\7C\2\2\u0451\u0452\7E\2\2\u0452\u0453\7G\2\2"+
		"\u0453\u00f6\3\2\2\2\u0454\u0455\7T\2\2\u0455\u0456\7G\2\2\u0456\u0457"+
		"\7U\2\2\u0457\u0458\7V\2\2\u0458\u0459\7T\2\2\u0459\u045a\7K\2\2\u045a"+
		"\u045b\7E\2\2\u045b\u045c\7V\2\2\u045c\u00f8\3\2\2\2\u045d\u045e\7T\2"+
		"\2\u045e\u045f\7G\2\2\u045f\u0460\7V\2\2\u0460\u0461\7W\2\2\u0461\u0462"+
		"\7T\2\2\u0462\u0463\7P\2\2\u0463\u0464\7K\2\2\u0464\u0465\7P\2\2\u0465"+
		"\u0466\7I\2\2\u0466\u00fa\3\2\2\2\u0467\u0468\7T\2\2\u0468\u0469\7K\2"+
		"\2\u0469\u046a\7I\2\2\u046a\u046b\7J\2\2\u046b\u046c\7V\2\2\u046c\u00fc"+
		"\3\2\2\2\u046d\u046e\7T\2\2\u046e\u046f\7Q\2\2\u046f\u0470\7N\2\2\u0470"+
		"\u0471\7N\2\2\u0471\u0472\7D\2\2\u0472\u0473\7C\2\2\u0473\u0474\7E\2\2"+
		"\u0474\u0475\7M\2\2\u0475\u00fe\3\2\2\2\u0476\u0477\7T\2\2\u0477\u0478"+
		"\7Q\2\2\u0478\u0479\7Y\2\2\u0479\u0100\3\2\2\2\u047a\u047b\7T\2\2\u047b"+
		"\u047c\7Q\2\2\u047c\u047d\7Y\2\2\u047d\u047e\7U\2\2\u047e\u0102\3\2\2"+
		"\2\u047f\u0480\7U\2\2\u0480\u0481\7C\2\2\u0481\u0482\7X\2\2\u0482\u0483"+
		"\7G\2\2\u0483\u0484\7R\2\2\u0484\u0485\7Q\2\2\u0485\u0486\7K\2\2\u0486"+
		"\u0487\7P\2\2\u0487\u0488\7V\2\2\u0488\u0104\3\2\2\2\u0489\u048a\7U\2"+
		"\2\u048a\u048b\7G\2\2\u048b\u048c\7N\2\2\u048c\u048d\7G\2\2\u048d\u048e"+
		"\7E\2\2\u048e\u048f\7V\2\2\u048f\u0106\3\2\2\2\u0490\u0491\7U\2\2\u0491"+
		"\u0492\7G\2\2\u0492\u0493\7V\2\2\u0493\u0108\3\2\2\2\u0494\u0495\7V\2"+
		"\2\u0495\u0496\7C\2\2\u0496\u0497\7D\2\2\u0497\u0498\7N\2\2\u0498\u0499"+
		"\7G\2\2\u0499\u010a\3\2\2\2\u049a\u049b\7V\2\2\u049b\u049c\7G\2\2\u049c"+
		"\u049d\7O\2\2\u049d\u049e\7R\2\2\u049e\u010c\3\2\2\2\u049f\u04a0\7V\2"+
		"\2\u04a0\u04a1\7G\2\2\u04a1\u04a2\7O\2\2\u04a2\u04a3\7R\2\2\u04a3\u04a4"+
		"\7Q\2\2\u04a4\u04a5\7T\2\2\u04a5\u04a6\7C\2\2\u04a6\u04a7\7T\2\2\u04a7"+
		"\u04a8\7[\2\2\u04a8\u010e\3\2\2\2\u04a9\u04aa\7V\2\2\u04aa\u04ab\7J\2"+
		"\2\u04ab\u04ac\7G\2\2\u04ac\u04ad\7P\2\2\u04ad\u0110\3\2\2\2\u04ae\u04af"+
		"\7V\2\2\u04af\u04b0\7Q\2\2\u04b0\u0112\3\2\2\2\u04b1\u04b2\7V\2\2\u04b2"+
		"\u04b3\7T\2\2\u04b3\u04b4\7C\2\2\u04b4\u04b5\7P\2\2\u04b5\u04b6\7U\2\2"+
		"\u04b6\u04b7\7C\2\2\u04b7\u04b8\7E\2\2\u04b8\u04b9\7V\2\2\u04b9\u04ba"+
		"\7K\2\2\u04ba\u04bb\7Q\2\2\u04bb\u04bc\7P\2\2\u04bc\u0114\3\2\2\2\u04bd"+
		"\u04be\7V\2\2\u04be\u04bf\7T\2\2\u04bf\u04c0\7K\2\2\u04c0\u04c1\7I\2\2"+
		"\u04c1\u04c2\7I\2\2\u04c2\u04c3\7G\2\2\u04c3\u04c4\7T\2\2\u04c4\u0116"+
		"\3\2\2\2\u04c5\u04c6\7W\2\2\u04c6\u04c7\7P\2\2\u04c7\u04c8\7K\2\2\u04c8"+
		"\u04c9\7Q\2\2\u04c9\u04ca\7P\2\2\u04ca\u0118\3\2\2\2\u04cb\u04cc\7W\2"+
		"\2\u04cc\u04cd\7P\2\2\u04cd\u04ce\7K\2\2\u04ce\u04cf\7S\2\2\u04cf\u04d0"+
		"\7W\2\2\u04d0\u04d1\7G\2\2\u04d1\u011a\3\2\2\2\u04d2\u04d3\7W\2\2\u04d3"+
		"\u04d4\7R\2\2\u04d4\u04d5\7F\2\2\u04d5\u04d6\7C\2\2\u04d6\u04d7\7V\2\2"+
		"\u04d7\u04d8\7G\2\2\u04d8\u011c\3\2\2\2\u04d9\u04da\7W\2\2\u04da\u04db"+
		"\7U\2\2\u04db\u04dc\7K\2\2\u04dc\u04dd\7P\2\2\u04dd\u04de\7I\2\2\u04de"+
		"\u011e\3\2\2\2\u04df\u04e0\7X\2\2\u04e0\u04e1\7C\2\2\u04e1\u04e2\7E\2"+
		"\2\u04e2\u04e3\7W\2\2\u04e3\u04e4\7W\2\2\u04e4\u04e5\7O\2\2\u04e5\u0120"+
		"\3\2\2\2\u04e6\u04e7\7X\2\2\u04e7\u04e8\7C\2\2\u04e8\u04e9\7N\2\2\u04e9"+
		"\u04ea\7W\2\2\u04ea\u04eb\7G\2\2\u04eb\u04ec\7U\2\2\u04ec\u0122\3\2\2"+
		"\2\u04ed\u04ee\7X\2\2\u04ee\u04ef\7K\2\2\u04ef\u04f0\7G\2\2\u04f0\u04f1"+
		"\7Y\2\2\u04f1\u0124\3\2\2\2\u04f2\u04f3\7X\2\2\u04f3\u04f4\7K\2\2\u04f4"+
		"\u04f5\7T\2\2\u04f5\u04f6\7V\2\2\u04f6\u04f7\7W\2\2\u04f7\u04f8\7C\2\2"+
		"\u04f8\u04f9\7N\2\2\u04f9\u0126\3\2\2\2\u04fa\u04fb\7Y\2\2\u04fb\u04fc"+
		"\7J\2\2\u04fc\u04fd\7G\2\2\u04fd\u04fe\7P\2\2\u04fe\u0128\3\2\2\2\u04ff"+
		"\u0500\7Y\2\2\u0500\u0501\7J\2\2\u0501\u0502\7G\2\2\u0502\u0503\7T\2\2"+
		"\u0503\u0504\7G\2\2\u0504\u012a\3\2\2\2\u0505\u0506\7Y\2\2\u0506\u0507"+
		"\7K\2\2\u0507\u0508\7V\2\2\u0508\u0509\7J\2\2\u0509\u012c\3\2\2\2\u050a"+
		"\u050b\7Y\2\2\u050b\u050c\7K\2\2\u050c\u050d\7V\2\2\u050d\u050e\7J\2\2"+
		"\u050e\u050f\7Q\2\2\u050f\u0510\7W\2\2\u0510\u0511\7V\2\2\u0511\u012e"+
		"\3\2\2\2\u0512\u0513\7H\2\2\u0513\u0514\7K\2\2\u0514\u0515\7T\2\2\u0515"+
		"\u0516\7U\2\2\u0516\u0517\7V\2\2\u0517\u0518\7a\2\2\u0518\u0519\7X\2\2"+
		"\u0519\u051a\7C\2\2\u051a\u051b\7N\2\2\u051b\u051c\7W\2\2\u051c\u051d"+
		"\7G\2\2\u051d\u0130\3\2\2\2\u051e\u051f\7Q\2\2\u051f\u0520\7X\2\2\u0520"+
		"\u0521\7G\2\2\u0521\u0522\7T\2\2\u0522\u0132\3\2\2\2\u0523\u0524\7R\2"+
		"\2\u0524\u0525\7C\2\2\u0525\u0526\7T\2\2\u0526\u0527\7V\2\2\u0527\u0528"+
		"\7K\2\2\u0528\u0529\7V\2\2\u0529\u052a\7K\2\2\u052a\u052b\7Q\2\2\u052b"+
		"\u052c\7P\2\2\u052c\u0134\3\2\2\2\u052d\u052e\7T\2\2\u052e\u052f\7C\2"+
		"\2\u052f\u0530\7P\2\2\u0530\u0531\7I\2\2\u0531\u0532\7G\2\2\u0532\u0136"+
		"\3\2\2\2\u0533\u0534\7R\2\2\u0534\u0535\7T\2\2\u0535\u0536\7G\2\2\u0536"+
		"\u0537\7E\2\2\u0537\u0538\7G\2\2\u0538\u0539\7F\2\2\u0539\u053a\7K\2\2"+
		"\u053a\u053b\7P\2\2\u053b\u053c\7I\2\2\u053c\u0138\3\2\2\2\u053d\u053e"+
		"\7W\2\2\u053e\u053f\7P\2\2\u053f\u0540\7D\2\2\u0540\u0541\7Q\2\2\u0541"+
		"\u0542\7W\2\2\u0542\u0543\7P\2\2\u0543\u0544\7F\2\2\u0544\u0545\7G\2\2"+
		"\u0545\u0546\7F\2\2\u0546\u013a\3\2\2\2\u0547\u0548\7E\2\2\u0548\u0549"+
		"\7W\2\2\u0549\u054a\7T\2\2\u054a\u054b\7T\2\2\u054b\u054c\7G\2\2\u054c"+
		"\u054d\7P\2\2\u054d\u054e\7V\2\2\u054e\u013c\3\2\2\2\u054f\u0550\7H\2"+
		"\2\u0550\u0551\7Q\2\2\u0551\u0552\7N\2\2\u0552\u0553\7N\2\2\u0553\u0554"+
		"\7Q\2\2\u0554\u0555\7Y\2\2\u0555\u0556\7K\2\2\u0556\u0557\7P\2\2\u0557"+
		"\u0558\7I\2\2\u0558\u013e\3\2\2\2\u0559\u055a\7E\2\2\u055a\u055b\7W\2"+
		"\2\u055b\u055c\7O\2\2\u055c\u055d\7G\2\2\u055d\u055e\7a\2\2\u055e\u055f"+
		"\7F\2\2\u055f\u0560\7K\2\2\u0560\u0561\7U\2\2\u0561\u0562\7V\2\2\u0562"+
		"\u0140\3\2\2\2\u0563\u0564\7F\2\2\u0564\u0565\7G\2\2\u0565\u0566\7P\2"+
		"\2\u0566\u0567\7U\2\2\u0567\u0568\7G\2\2\u0568\u0569\7a\2\2\u0569\u056a"+
		"\7T\2\2\u056a\u056b\7C\2\2\u056b\u056c\7P\2\2\u056c\u056d\7M\2\2\u056d"+
		"\u0142\3\2\2\2\u056e\u056f\7N\2\2\u056f\u0570\7C\2\2\u0570\u0571\7I\2"+
		"\2\u0571\u0144\3\2\2\2\u0572\u0573\7N\2\2\u0573\u0574\7C\2\2\u0574\u0575"+
		"\7U\2\2\u0575\u0576\7V\2\2\u0576\u0577\7a\2\2\u0577\u0578\7X\2\2\u0578"+
		"\u0579\7C\2\2\u0579\u057a\7N\2\2\u057a\u057b\7W\2\2\u057b\u057c\7G\2\2"+
		"\u057c\u0146\3\2\2\2\u057d\u057e\7N\2\2\u057e\u057f\7G\2\2\u057f\u0580"+
		"\7C\2\2\u0580\u0581\7F\2\2\u0581\u0148\3\2\2\2\u0582\u0583\7P\2\2\u0583"+
		"\u0584\7V\2\2\u0584\u0585\7J\2\2\u0585\u0586\7a\2\2\u0586\u0587\7X\2\2"+
		"\u0587\u0588\7C\2\2\u0588\u0589\7N\2\2\u0589\u058a\7W\2\2\u058a\u058b"+
		"\7G\2\2\u058b\u014a\3\2\2\2\u058c\u058d\7P\2\2\u058d\u058e\7V\2\2\u058e"+
		"\u058f\7K\2\2\u058f\u0590\7N\2\2\u0590\u0591\7G\2\2\u0591\u014c\3\2\2"+
		"\2\u0592\u0593\7R\2\2\u0593\u0594\7G\2\2\u0594\u0595\7T\2\2\u0595\u0596"+
		"\7E\2\2\u0596\u0597\7G\2\2\u0597\u0598\7P\2\2\u0598\u0599\7V\2\2\u0599"+
		"\u059a\7a\2\2\u059a\u059b\7T\2\2\u059b\u059c\7C\2\2\u059c\u059d\7P\2\2"+
		"\u059d\u059e\7M\2\2\u059e\u014e\3\2\2\2\u059f\u05a0\7T\2\2\u05a0\u05a1"+
		"\7C\2\2\u05a1\u05a2\7P\2\2\u05a2\u05a3\7M\2\2\u05a3\u0150\3\2\2\2\u05a4"+
		"\u05a5\7T\2\2\u05a5\u05a6\7Q\2\2\u05a6\u05a7\7Y\2\2\u05a7\u05a8\7a\2\2"+
		"\u05a8\u05a9\7P\2\2\u05a9\u05aa\7W\2\2\u05aa\u05ab\7O\2\2\u05ab\u05ac"+
		"\7D\2\2\u05ac\u05ad\7G\2\2\u05ad\u05ae\7T\2\2\u05ae\u0152\3\2\2\2\u05af"+
		"\u05b0\7I\2\2\u05b0\u05b1\7G\2\2\u05b1\u05b2\7P\2\2\u05b2\u05b3\7G\2\2"+
		"\u05b3\u05b4\7T\2\2\u05b4\u05b5\7C\2\2\u05b5\u05b6\7V\2\2\u05b6\u05b7"+
		"\7G\2\2\u05b7\u05b8\7F\2\2\u05b8\u0154\3\2\2\2\u05b9\u05ba\7C\2\2\u05ba"+
		"\u05bb\7N\2\2\u05bb\u05bc\7Y\2\2\u05bc\u05bd\7C\2\2\u05bd\u05be\7[\2\2"+
		"\u05be\u05bf\7U\2\2\u05bf\u0156\3\2\2\2\u05c0\u05c1\7U\2\2\u05c1\u05c2"+
		"\7V\2\2\u05c2\u05c3\7Q\2\2\u05c3\u05c4\7T\2\2\u05c4\u05c5\7G\2\2\u05c5"+
		"\u05c6\7F\2\2\u05c6\u0158\3\2\2\2\u05c7\u05c8\7V\2\2\u05c8\u05c9\7T\2"+
		"\2\u05c9\u05ca\7W\2\2\u05ca\u05cb\7G\2\2\u05cb\u015a\3\2\2\2\u05cc\u05cd"+
		"\7H\2\2\u05cd\u05ce\7C\2\2\u05ce\u05cf\7N\2\2\u05cf\u05d0\7U\2\2\u05d0"+
		"\u05d1\7G\2\2\u05d1\u015c\3\2\2\2\u05d2\u05d3\7Y\2\2\u05d3\u05d4\7K\2"+
		"\2\u05d4\u05d5\7P\2\2\u05d5\u05d6\7F\2\2\u05d6\u05d7\7Q\2\2\u05d7\u05d8"+
		"\7Y\2\2\u05d8\u015e\3\2\2\2\u05d9\u05da\7P\2\2\u05da\u05db\7W\2\2\u05db"+
		"\u05dc\7N\2\2\u05dc\u05dd\7N\2\2\u05dd\u05de\7U\2\2\u05de\u0160\3\2\2"+
		"\2\u05df\u05e0\7H\2\2\u05e0\u05e1\7K\2\2\u05e1\u05e2\7T\2\2\u05e2\u05e3"+
		"\7U\2\2\u05e3\u05e4\7V\2\2\u05e4\u0162\3\2\2\2\u05e5\u05e6\7N\2\2\u05e6"+
		"\u05e7\7C\2\2\u05e7\u05e8\7U\2\2\u05e8\u05e9\7V\2\2\u05e9\u0164\3\2\2"+
		"\2\u05ea\u05eb\7H\2\2\u05eb\u05ec\7K\2\2\u05ec\u05ed\7N\2\2\u05ed\u05ee"+
		"\7V\2\2\u05ee\u05ef\7G\2\2\u05ef\u05f0\7T\2\2\u05f0\u0166\3\2\2\2\u05f1"+
		"\u05f2\7I\2\2\u05f2\u05f3\7T\2\2\u05f3\u05f4\7Q\2\2\u05f4\u05f5\7W\2\2"+
		"\u05f5\u05f6\7R\2\2\u05f6\u05f7\7U\2\2\u05f7\u0168\3\2\2\2\u05f8\u05f9"+
		"\7G\2\2\u05f9\u05fa\7Z\2\2\u05fa\u05fb\7E\2\2\u05fb\u05fc\7N\2\2\u05fc"+
		"\u05fd\7W\2\2\u05fd\u05fe\7F\2\2\u05fe\u05ff\7G\2\2\u05ff\u016a\3\2\2"+
		"\2\u0600\u0601\7V\2\2\u0601\u0602\7K\2\2\u0602\u0603\7G\2\2\u0603\u0604"+
		"\7U\2\2\u0604\u016c\3\2\2\2\u0605\u0606\7Q\2\2\u0606\u0607\7V\2\2\u0607"+
		"\u0608\7J\2\2\u0608\u0609\7G\2\2\u0609\u060a\7T\2\2\u060a\u060b\7U\2\2"+
		"\u060b\u016e\3\2\2\2\u060c\u060d\7F\2\2\u060d\u060e\7Q\2\2\u060e\u0170"+
		"\3\2\2\2\u060f\u0610\7P\2\2\u0610\u0611\7Q\2\2\u0611\u0612\7V\2\2\u0612"+
		"\u0613\7J\2\2\u0613\u0614\7K\2\2\u0614\u0615\7P\2\2\u0615\u0616\7I\2\2"+
		"\u0616\u0172\3\2\2\2\u0617\u061d\7$\2\2\u0618\u061c\n\2\2\2\u0619\u061a"+
		"\7$\2\2\u061a\u061c\7$\2\2\u061b\u0618\3\2\2\2\u061b\u0619\3\2\2\2\u061c"+
		"\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2"+
		"\2\2\u061f\u061d\3\2\2\2\u0620\u063b\7$\2\2\u0621\u0627\7b\2\2\u0622\u0626"+
		"\n\3\2\2\u0623\u0624\7b\2\2\u0624\u0626\7b\2\2\u0625\u0622\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2"+
		"\2\2\u0628\u062a\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u063b\7b\2\2\u062b"+
		"\u062f\7]\2\2\u062c\u062e\n\4\2\2\u062d\u062c\3\2\2\2\u062e\u0631\3\2"+
		"\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631"+
		"\u062f\3\2\2\2\u0632\u063b\7_\2\2\u0633\u0637\t\5\2\2\u0634\u0636\t\6"+
		"\2\2\u0635\u0634\3\2\2\2\u0636\u0639\3\2\2\2\u0637\u0635\3\2\2\2\u0637"+
		"\u0638\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u0617\3\2"+
		"\2\2\u063a\u0621\3\2\2\2\u063a\u062b\3\2\2\2\u063a\u0633\3\2\2\2\u063b"+
		"\u0174\3\2\2\2\u063c\u063e\5\u0187\u00c4\2\u063d\u063c\3\2\2\2\u063e\u063f"+
		"\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0648\3\2\2\2\u0641"+
		"\u0645\7\60\2\2\u0642\u0644\5\u0187\u00c4\2\u0643\u0642\3\2\2\2\u0644"+
		"\u0647\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0649\3\2"+
		"\2\2\u0647\u0645\3\2\2\2\u0648\u0641\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u0651\3\2\2\2\u064a\u064c\7\60\2\2\u064b\u064d\5\u0187\u00c4\2\u064c"+
		"\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2"+
		"\2\2\u064f\u0651\3\2\2\2\u0650\u063d\3\2\2\2\u0650\u064a\3\2\2\2\u0651"+
		"\u065b\3\2\2\2\u0652\u0654\7G\2\2\u0653\u0655\t\7\2\2\u0654\u0653\3\2"+
		"\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0658\5\u0187\u00c4"+
		"\2\u0657\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u0652\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u0666\3\2\2\2\u065d\u065e\7\62\2\2\u065e\u065f\7z\2\2\u065f\u0661\3\2"+
		"\2\2\u0660\u0662\5\u0185\u00c3\2\u0661\u0660\3\2\2\2\u0662\u0663\3\2\2"+
		"\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666\3\2\2\2\u0665\u0650"+
		"\3\2\2\2\u0665\u065d\3\2\2\2\u0666\u0176\3\2\2\2\u0667\u066b\7A\2\2\u0668"+
		"\u066a\5\u0187\u00c4\2\u0669\u0668\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0671\3\2\2\2\u066d\u066b\3\2\2\2\u066e"+
		"\u066f\t\b\2\2\u066f\u0671\5\u0173\u00ba\2\u0670\u0667\3\2\2\2\u0670\u066e"+
		"\3\2\2\2\u0671\u0178\3\2\2\2\u0672\u0678\7)\2\2\u0673\u0677\n\t\2\2\u0674"+
		"\u0675\7)\2\2\u0675\u0677\7)\2\2\u0676\u0673\3\2\2\2\u0676\u0674\3\2\2"+
		"\2\u0677\u067a\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b"+
		"\3\2\2\2\u067a\u0678\3\2\2\2\u067b\u067c\7)\2\2\u067c\u017a\3\2\2\2\u067d"+
		"\u067e\7Z\2\2\u067e\u067f\5\u0179\u00bd\2\u067f\u017c\3\2\2\2\u0680\u0681"+
		"\7/\2\2\u0681\u0682\7/\2\2\u0682\u0686\3\2\2\2\u0683\u0685\n\n\2\2\u0684"+
		"\u0683\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2"+
		"\2\2\u0687\u068e\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068b\7\17\2\2\u068a"+
		"\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068f\7\f"+
		"\2\2\u068d\u068f\7\2\2\3\u068e\u068a\3\2\2\2\u068e\u068d\3\2\2\2\u068f"+
		"\u0690\3\2\2\2\u0690\u0691\b\u00bf\2\2\u0691\u017e\3\2\2\2\u0692\u0693"+
		"\7\61\2\2\u0693\u0694\7,\2\2\u0694\u0698\3\2\2\2\u0695\u0697\13\2\2\2"+
		"\u0696\u0695\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0699\3\2\2\2\u0698\u0696"+
		"\3\2\2\2\u0699\u069b\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c\7,\2\2\u069c"+
		"\u069d\7\61\2\2\u069d\u069e\3\2\2\2\u069e\u069f\b\u00c0\2\2\u069f\u0180"+
		"\3\2\2\2\u06a0\u06a1\t\13\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\b\u00c1"+
		"\2\2\u06a3\u0182\3\2\2\2\u06a4\u06a5\13\2\2\2\u06a5\u0184\3\2\2\2\u06a6"+
		"\u06a7\t\f\2\2\u06a7\u0186\3\2\2\2\u06a8\u06a9\t\r\2\2\u06a9\u0188\3\2"+
		"\2\2\34\2\u061b\u061d\u0625\u0627\u062f\u0637\u063a\u063f\u0645\u0648"+
		"\u064e\u0650\u0654\u0659\u065b\u0663\u0665\u066b\u0670\u0676\u0678\u0686"+
		"\u068a\u068e\u0698\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}