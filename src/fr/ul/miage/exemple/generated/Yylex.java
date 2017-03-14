/* The following code was generated by JFlex 1.6.1 */


package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Mervine/Desktop/Projet-COMPIL/Compilation/src/Scanner.flex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\7\1\3\1\40\1\40\1\10\22\0\1\7\7\0\1\12"+
    "\1\13\1\4\1\11\1\21\1\16\1\0\1\2\12\1\1\0\1\20"+
    "\1\0\1\17\3\0\32\5\4\0\1\6\1\0\1\35\1\33\1\24"+
    "\1\5\1\26\1\37\1\32\1\5\1\34\2\5\1\22\1\5\1\31"+
    "\1\23\1\36\1\5\1\25\1\5\1\27\1\30\5\5\1\14\1\0"+
    "\1\15\7\0\1\40\44\0\1\6\12\0\1\6\4\0\1\6\5\0"+
    "\27\6\1\0\37\6\1\0\u01ca\6\4\0\14\6\16\0\5\6\7\0"+
    "\1\6\1\0\1\6\21\0\165\6\1\0\2\6\2\0\4\6\1\0"+
    "\1\6\6\0\1\6\1\0\3\6\1\0\1\6\1\0\24\6\1\0"+
    "\123\6\1\0\213\6\1\0\255\6\1\0\46\6\2\0\1\6\7\0"+
    "\47\6\11\0\55\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0"+
    "\1\6\10\0\33\6\5\0\3\6\35\0\13\6\5\0\112\6\4\0"+
    "\146\6\1\0\10\6\2\0\12\6\1\0\23\6\2\0\1\6\20\0"+
    "\73\6\2\0\145\6\16\0\66\6\4\0\1\6\5\0\56\6\22\0"+
    "\34\6\104\0\23\6\61\0\200\6\2\0\12\6\1\0\23\6\1\0"+
    "\10\6\2\0\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3\0"+
    "\4\6\2\0\11\6\2\0\2\6\2\0\4\6\10\0\1\6\4\0"+
    "\2\6\1\0\5\6\2\0\14\6\17\0\3\6\1\0\6\6\4\0"+
    "\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0\2\6\1\0"+
    "\2\6\2\0\1\6\1\0\5\6\4\0\2\6\2\0\3\6\3\0"+
    "\1\6\7\0\4\6\1\0\1\6\7\0\20\6\13\0\3\6\1\0"+
    "\11\6\1\0\3\6\1\0\26\6\1\0\7\6\1\0\2\6\1\0"+
    "\5\6\2\0\12\6\1\0\3\6\1\0\3\6\2\0\1\6\17\0"+
    "\4\6\2\0\12\6\21\0\3\6\1\0\10\6\2\0\2\6\2\0"+
    "\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0\11\6\2\0"+
    "\2\6\2\0\3\6\10\0\2\6\4\0\2\6\1\0\5\6\2\0"+
    "\12\6\1\0\1\6\20\0\2\6\1\0\6\6\3\0\3\6\1\0"+
    "\4\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0"+
    "\3\6\3\0\14\6\4\0\5\6\3\0\3\6\1\0\4\6\2\0"+
    "\1\6\6\0\1\6\16\0\12\6\20\0\4\6\1\0\10\6\1\0"+
    "\3\6\1\0\27\6\1\0\20\6\3\0\10\6\1\0\3\6\1\0"+
    "\4\6\7\0\2\6\1\0\2\6\6\0\4\6\2\0\12\6\21\0"+
    "\3\6\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0"+
    "\5\6\2\0\11\6\1\0\3\6\1\0\4\6\7\0\2\6\7\0"+
    "\1\6\1\0\4\6\2\0\12\6\1\0\2\6\16\0\3\6\1\0"+
    "\10\6\1\0\3\6\1\0\51\6\2\0\10\6\1\0\3\6\1\0"+
    "\5\6\10\0\1\6\10\0\4\6\2\0\12\6\12\0\6\6\2\0"+
    "\2\6\1\0\22\6\3\0\30\6\1\0\11\6\1\0\1\6\2\0"+
    "\7\6\3\0\1\6\4\0\6\6\1\0\1\6\1\0\10\6\6\0"+
    "\12\6\2\0\2\6\15\0\72\6\5\0\17\6\1\0\12\6\47\0"+
    "\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2\0\1\6\6\0"+
    "\4\6\1\0\7\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0"+
    "\2\6\1\0\15\6\1\0\3\6\2\0\5\6\1\0\1\6\1\0"+
    "\6\6\2\0\12\6\2\0\4\6\40\0\1\6\27\0\2\6\6\0"+
    "\12\6\13\0\1\6\1\0\1\6\1\0\1\6\4\0\12\6\1\0"+
    "\44\6\4\0\24\6\1\0\22\6\1\0\44\6\11\0\1\6\71\0"+
    "\112\6\6\0\116\6\2\0\46\6\1\0\1\6\5\0\1\6\2\0"+
    "\53\6\1\0\u014d\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0"+
    "\4\6\2\0\51\6\1\0\4\6\2\0\41\6\1\0\4\6\2\0"+
    "\7\6\1\0\1\6\1\0\4\6\2\0\17\6\1\0\71\6\1\0"+
    "\4\6\2\0\103\6\2\0\3\6\40\0\20\6\20\0\125\6\14\0"+
    "\u026c\6\2\0\21\6\1\0\32\6\5\0\113\6\3\0\13\6\7\0"+
    "\15\6\1\0\7\6\13\0\25\6\13\0\24\6\14\0\15\6\1\0"+
    "\3\6\1\0\2\6\14\0\124\6\3\0\1\6\4\0\2\6\2\0"+
    "\12\6\41\0\3\6\2\0\12\6\6\0\130\6\10\0\53\6\5\0"+
    "\106\6\12\0\37\6\1\0\14\6\4\0\14\6\12\0\50\6\2\0"+
    "\5\6\13\0\54\6\4\0\32\6\6\0\12\6\46\0\34\6\4\0"+
    "\77\6\1\0\35\6\2\0\13\6\6\0\12\6\15\0\1\6\10\0"+
    "\17\6\101\0\114\6\4\0\12\6\21\0\11\6\14\0\164\6\14\0"+
    "\70\6\10\0\12\6\3\0\61\6\122\0\3\6\1\0\43\6\1\0"+
    "\2\6\6\0\366\6\6\0\u011a\6\2\0\6\6\2\0\46\6\2\0"+
    "\6\6\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0"+
    "\37\6\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0"+
    "\7\6\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0"+
    "\7\6\53\0\1\40\1\40\25\0\2\6\23\0\1\6\34\0\1\6"+
    "\15\0\1\6\20\0\15\6\63\0\41\6\21\0\1\6\4\0\1\6"+
    "\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0\1\6"+
    "\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0\5\6"+
    "\4\0\1\6\21\0\51\6\u032d\0\64\6\u0716\0\57\6\1\0\57\6"+
    "\1\0\205\6\6\0\11\6\14\0\46\6\1\0\1\6\5\0\1\6"+
    "\2\0\70\6\7\0\1\6\17\0\30\6\11\0\7\6\1\0\7\6"+
    "\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6"+
    "\1\0\7\6\1\0\40\6\57\0\1\6\u01d5\0\3\6\31\0\17\6"+
    "\1\0\5\6\2\0\5\6\4\0\126\6\2\0\2\6\2\0\3\6"+
    "\1\0\132\6\1\0\4\6\5\0\51\6\3\0\136\6\21\0\33\6"+
    "\65\0\20\6\u0200\0\u19b6\6\112\0\u51cd\6\63\0\u048d\6\103\0\56\6"+
    "\2\0\u010d\6\3\0\34\6\24\0\63\6\1\0\12\6\1\0\37\6"+
    "\1\0\123\6\45\0\11\6\2\0\147\6\2\0\4\6\1\0\36\6"+
    "\2\0\2\6\105\0\61\6\30\0\64\6\14\0\105\6\13\0\12\6"+
    "\6\0\30\6\3\0\1\6\4\0\56\6\2\0\44\6\14\0\35\6"+
    "\3\0\101\6\16\0\13\6\6\0\37\6\1\0\67\6\11\0\16\6"+
    "\2\0\12\6\6\0\27\6\3\0\111\6\30\0\3\6\2\0\20\6"+
    "\2\0\5\6\12\0\6\6\2\0\6\6\2\0\6\6\11\0\7\6"+
    "\1\0\7\6\1\0\53\6\1\0\4\6\4\0\2\6\132\0\53\6"+
    "\1\0\2\6\2\0\12\6\6\0\u2ba4\6\14\0\27\6\4\0\61\6"+
    "\u2104\0\u016e\6\2\0\152\6\46\0\7\6\14\0\5\6\5\0\14\6"+
    "\1\0\15\6\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6"+
    "\1\0\154\6\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\14\6"+
    "\4\0\20\6\20\0\16\6\5\0\2\6\30\0\3\6\40\0\5\6"+
    "\1\0\207\6\23\0\12\6\7\0\32\6\4\0\1\6\1\0\32\6"+
    "\13\0\131\6\3\0\6\6\2\0\6\6\2\0\6\6\2\0\3\6"+
    "\43\0\14\6\1\0\32\6\1\0\23\6\1\0\2\6\1\0\17\6"+
    "\2\0\16\6\42\0\173\6\105\0\65\6\210\0\1\6\202\0\35\6"+
    "\3\0\61\6\17\0\1\6\37\0\40\6\20\0\33\6\5\0\53\6"+
    "\5\0\36\6\2\0\44\6\4\0\10\6\1\0\5\6\52\0\236\6"+
    "\2\0\12\6\126\0\50\6\10\0\64\6\234\0\u0137\6\11\0\26\6"+
    "\12\0\10\6\230\0\6\6\2\0\1\6\1\0\54\6\1\0\2\6"+
    "\3\0\1\6\2\0\27\6\12\0\27\6\11\0\37\6\141\0\26\6"+
    "\12\0\32\6\106\0\70\6\6\0\2\6\100\0\4\6\1\0\2\6"+
    "\5\0\10\6\1\0\3\6\1\0\33\6\4\0\3\6\4\0\1\6"+
    "\40\0\35\6\3\0\35\6\43\0\10\6\1\0\36\6\31\0\66\6"+
    "\12\0\26\6\12\0\23\6\15\0\22\6\156\0\111\6\u03b7\0\107\6"+
    "\37\0\12\6\17\0\74\6\25\0\31\6\7\0\12\6\6\0\65\6"+
    "\1\0\12\6\20\0\44\6\2\0\1\6\11\0\105\6\13\0\13\6"+
    "\45\0\22\6\1\0\45\6\170\0\73\6\5\0\12\6\7\0\3\6"+
    "\1\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6"+
    "\1\0\5\6\2\0\11\6\2\0\2\6\2\0\3\6\11\0\1\6"+
    "\5\0\7\6\2\0\7\6\3\0\5\6\u010b\0\106\6\1\0\1\6"+
    "\10\0\12\6\246\0\66\6\2\0\11\6\77\0\101\6\3\0\1\6"+
    "\13\0\12\6\46\0\70\6\10\0\12\6\u01d6\0\112\6\25\0\1\6"+
    "\u01c0\0\71\6\u0507\0\u0399\6\147\0\157\6\u0b91\0\u042f\6\u33d1\0\u0239\6"+
    "\7\0\37\6\1\0\12\6\146\0\36\6\2\0\5\6\13\0\67\6"+
    "\11\0\4\6\14\0\12\6\11\0\25\6\5\0\23\6\u0370\0\105\6"+
    "\13\0\57\6\20\0\21\6\u4060\0\2\6\u0bfe\0\153\6\5\0\15\6"+
    "\3\0\11\6\7\0\12\6\3\0\2\6\u14c6\0\5\6\3\0\6\6"+
    "\10\0\10\6\2\0\7\6\36\0\4\6\224\0\3\6\u01bb\0\125\6"+
    "\1\0\107\6\1\0\2\6\2\0\1\6\2\0\2\6\2\0\4\6"+
    "\1\0\14\6\1\0\1\6\1\0\7\6\1\0\101\6\1\0\4\6"+
    "\2\0\10\6\1\0\7\6\1\0\34\6\1\0\4\6\1\0\5\6"+
    "\1\0\1\6\3\0\7\6\1\0\u0154\6\2\0\31\6\1\0\31\6"+
    "\1\0\37\6\1\0\31\6\1\0\37\6\1\0\31\6\1\0\37\6"+
    "\1\0\31\6\1\0\37\6\1\0\31\6\1\0\10\6\2\0\62\6"+
    "\u1000\0\305\6\13\0\7\6\u0529\0\4\6\1\0\33\6\1\0\2\6"+
    "\1\0\1\6\2\0\1\6\1\0\12\6\1\0\4\6\1\0\1\6"+
    "\1\0\1\6\6\0\1\6\4\0\1\6\1\0\1\6\1\0\1\6"+
    "\1\0\3\6\1\0\2\6\1\0\1\6\2\0\1\6\1\0\1\6"+
    "\1\0\1\6\1\0\1\6\1\0\1\6\1\0\2\6\1\0\1\6"+
    "\2\0\4\6\1\0\7\6\1\0\4\6\1\0\4\6\1\0\1\6"+
    "\1\0\12\6\1\0\21\6\5\0\3\6\1\0\5\6\1\0\21\6"+
    "\u0274\0\32\6\6\0\32\6\6\0\32\6\u0e76\0\ua6d7\6\51\0\u1035\6"+
    "\13\0\336\6\u3fe2\0\u021e\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\6\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\4"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\7\6\1\0\1\20\1\0\10\6\2\21\1\0"+
    "\1\22\6\6\1\20\2\6\1\23\5\6\1\24\3\6"+
    "\1\25\7\6\1\26\1\27\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\41\0\102\0\143\0\41\0\41\0\204\0\245"+
    "\0\41\0\41\0\41\0\41\0\41\0\41\0\41\0\41"+
    "\0\41\0\306\0\347\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c"+
    "\0\u01ad\0\u01ce\0\u01ef\0\u0210\0\u0231\0\u0252\0\u0273\0\u0294"+
    "\0\u02b5\0\u02d6\0\u02f7\0\u0318\0\u0339\0\u035a\0\204\0\u037b"+
    "\0\u039c\0\u03bd\0\u03de\0\u03ff\0\u0420\0\41\0\u0441\0\u0462"+
    "\0\204\0\u0483\0\u04a4\0\u04c5\0\u04e6\0\u0507\0\204\0\u0528"+
    "\0\u0549\0\u056a\0\204\0\u058b\0\u05ac\0\u05cd\0\u05ee\0\u060f"+
    "\0\u0630\0\u0651\0\204\0\204\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\5"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\2\7\1\23\1\24\3\7\1\25"+
    "\2\7\1\26\1\27\1\30\43\0\1\3\1\31\1\0"+
    "\1\31\4\0\1\31\4\0\1\31\24\0\1\32\1\0"+
    "\1\33\35\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\16\7\4\0\1\5"+
    "\36\0\1\34\1\31\1\0\1\31\1\7\1\34\2\0"+
    "\1\31\4\0\1\31\3\0\1\7\1\35\14\7\2\0"+
    "\1\34\1\31\1\0\1\31\1\7\1\34\2\0\1\31"+
    "\4\0\1\31\3\0\4\7\1\36\11\7\2\0\1\34"+
    "\1\31\1\0\1\31\1\7\1\34\2\0\1\31\4\0"+
    "\1\31\3\0\7\7\1\37\6\7\2\0\1\34\1\31"+
    "\1\0\1\31\1\7\1\34\2\0\1\31\4\0\1\31"+
    "\3\0\1\40\15\7\2\0\1\34\1\31\1\0\1\31"+
    "\1\7\1\34\2\0\1\31\4\0\1\31\3\0\14\7"+
    "\1\41\1\7\2\0\1\34\1\31\1\0\1\31\1\7"+
    "\1\34\2\0\1\31\4\0\1\31\3\0\3\7\1\42"+
    "\12\7\2\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\1\7\1\43\14\7"+
    "\2\0\1\44\3\0\1\45\14\0\16\45\1\0\3\32"+
    "\1\0\35\32\4\33\1\46\34\33\1\0\1\34\3\0"+
    "\2\34\13\0\16\34\2\0\1\34\1\31\1\0\1\31"+
    "\1\7\1\34\2\0\1\31\4\0\1\31\3\0\2\7"+
    "\1\47\13\7\2\0\1\34\1\31\1\0\1\31\1\7"+
    "\1\34\2\0\1\31\4\0\1\31\3\0\5\7\1\50"+
    "\10\7\2\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\5\7\1\51\10\7"+
    "\2\0\1\34\1\31\1\0\1\31\1\7\1\34\2\0"+
    "\1\31\4\0\1\31\3\0\1\7\1\52\14\7\2\0"+
    "\1\34\1\31\1\0\1\31\1\7\1\34\2\0\1\31"+
    "\4\0\1\31\3\0\14\7\1\53\1\7\2\0\1\34"+
    "\1\31\1\0\1\31\1\7\1\34\2\0\1\31\4\0"+
    "\1\31\3\0\12\7\1\54\3\7\2\0\1\34\1\31"+
    "\1\0\1\31\1\7\1\34\2\0\1\31\4\0\1\31"+
    "\3\0\7\7\1\55\6\7\2\0\1\44\1\31\1\0"+
    "\1\31\4\0\1\31\4\0\1\31\24\0\1\31\1\0"+
    "\1\31\1\45\3\0\1\31\4\0\1\31\3\0\16\45"+
    "\1\0\2\33\1\56\36\33\1\0\1\34\1\31\1\0"+
    "\1\31\1\7\1\34\2\0\1\31\4\0\1\31\3\0"+
    "\1\7\1\57\14\7\2\0\1\34\1\31\1\0\1\31"+
    "\1\7\1\34\2\0\1\31\4\0\1\31\3\0\12\7"+
    "\1\60\3\7\2\0\1\34\1\31\1\0\1\31\1\7"+
    "\1\34\2\0\1\31\4\0\1\31\3\0\11\7\1\61"+
    "\4\7\2\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\4\7\1\62\11\7"+
    "\2\0\1\34\1\31\1\0\1\31\1\7\1\34\2\0"+
    "\1\31\4\0\1\31\3\0\7\7\1\63\6\7\2\0"+
    "\1\34\1\31\1\0\1\31\1\7\1\34\2\0\1\31"+
    "\4\0\1\31\3\0\2\7\1\64\13\7\2\0\1\34"+
    "\1\31\1\0\1\31\1\7\1\34\2\0\1\31\4\0"+
    "\1\31\3\0\6\7\1\65\7\7\2\0\1\34\1\31"+
    "\1\0\1\31\1\7\1\34\2\0\1\31\4\0\1\31"+
    "\3\0\4\7\1\66\11\7\2\0\1\34\1\31\1\0"+
    "\1\31\1\7\1\34\2\0\1\31\4\0\1\31\3\0"+
    "\1\67\15\7\2\0\1\34\1\31\1\0\1\31\1\7"+
    "\1\34\2\0\1\31\4\0\1\31\3\0\2\7\1\70"+
    "\13\7\2\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\5\7\1\71\10\7"+
    "\2\0\1\34\1\31\1\0\1\31\1\7\1\34\2\0"+
    "\1\31\4\0\1\31\3\0\3\7\1\72\12\7\2\0"+
    "\1\34\1\31\1\0\1\31\1\7\1\34\2\0\1\31"+
    "\4\0\1\31\3\0\3\7\1\73\12\7\2\0\1\34"+
    "\1\31\1\0\1\31\1\7\1\34\2\0\1\31\4\0"+
    "\1\31\3\0\12\7\1\74\3\7\2\0\1\34\1\31"+
    "\1\0\1\31\1\7\1\34\2\0\1\31\4\0\1\31"+
    "\3\0\12\7\1\75\3\7\2\0\1\34\1\31\1\0"+
    "\1\31\1\7\1\34\2\0\1\31\4\0\1\31\3\0"+
    "\7\7\1\76\6\7\2\0\1\34\1\31\1\0\1\31"+
    "\1\7\1\34\2\0\1\31\4\0\1\31\3\0\14\7"+
    "\1\77\1\7\2\0\1\34\1\31\1\0\1\31\1\7"+
    "\1\34\2\0\1\31\4\0\1\31\3\0\1\7\1\100"+
    "\14\7\2\0\1\34\1\31\1\0\1\31\1\7\1\34"+
    "\2\0\1\31\4\0\1\31\3\0\4\7\1\101\11\7"+
    "\2\0\1\34\1\31\1\0\1\31\1\7\1\34\2\0"+
    "\1\31\4\0\1\31\3\0\13\7\1\102\2\7\2\0"+
    "\1\34\1\31\1\0\1\31\1\7\1\34\2\0\1\31"+
    "\4\0\1\31\3\0\7\7\1\103\6\7\2\0\1\34"+
    "\1\31\1\0\1\31\1\7\1\34\2\0\1\31\4\0"+
    "\1\31\3\0\3\7\1\104\12\7\2\0\1\34\1\31"+
    "\1\0\1\31\1\7\1\34\2\0\1\31\4\0\1\31"+
    "\3\0\1\105\15\7\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1650];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\2\1\11\11\7\1\1\0"+
    "\1\1\1\0\12\1\1\0\7\1\1\11\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[69];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2640) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  private static String zzToPrintable(String str) {
    StringBuilder builder = new StringBuilder();
    for (int n = 0 ; n < str.length() ; ) {
      int ch = str.codePointAt(n);
      int charCount = Character.charCount(ch);
      n += charCount;
      if (ch > 31 && ch < 127) {
        builder.append((char)ch);
      } else if (charCount == 1) {
        builder.append(String.format("\\u%04X", ch));
      } else {
        builder.append(String.format("\\U%06X", ch));
      }
    }
    return builder.toString();
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [57] { return null; }");
            { return null;
            }
          case 25: break;
          case 2: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [51] { return new Symbol(sym.NUM); }");
            { return new Symbol(sym.NUM);
            }
          case 26: break;
          case 3: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [33] { return new Symbol(sym.DIV); }");
            { return new Symbol(sym.DIV);
            }
          case 27: break;
          case 4: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [55] { ; }");
            { ;
            }
          case 28: break;
          case 5: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [32] { return new Symbol(sym.MUL); }");
            { return new Symbol(sym.MUL);
            }
          case 29: break;
          case 6: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [52] { return new Symbol(sym.NOM); }");
            { return new Symbol(sym.NOM);
            }
          case 30: break;
          case 7: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [35] { return new Symbol(sym.PLUS); }");
            { return new Symbol(sym.PLUS);
            }
          case 31: break;
          case 8: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [27] { return new Symbol(sym.PO); }");
            { return new Symbol(sym.PO);
            }
          case 32: break;
          case 9: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [28] { return new Symbol(sym.PF); }");
            { return new Symbol(sym.PF);
            }
          case 33: break;
          case 10: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [29] { return new Symbol(sym.AO); }");
            { return new Symbol(sym.AO);
            }
          case 34: break;
          case 11: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [30] { return new Symbol(sym.AF); }");
            { return new Symbol(sym.AF);
            }
          case 35: break;
          case 12: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [34] { return new Symbol(sym.MOINS); }");
            { return new Symbol(sym.MOINS);
            }
          case 36: break;
          case 13: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [38] { return new Symbol(sym.EG); }");
            { return new Symbol(sym.EG);
            }
          case 37: break;
          case 14: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [39] { return new Symbol(sym.PV); }");
            { return new Symbol(sym.PV);
            }
          case 38: break;
          case 15: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [40] { return new Symbol(sym.V); }");
            { return new Symbol(sym.V);
            }
          case 39: break;
          case 16: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [53] { return new Symbol(sym.COM); }");
            { return new Symbol(sym.COM);
            }
          case 40: break;
          case 17: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [54] { return new Symbol(sym.OP); }");
            { return new Symbol(sym.OP);
            }
          case 41: break;
          case 18: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [42] { return new Symbol(sym.LOC); }");
            { return new Symbol(sym.LOC);
            }
          case 42: break;
          case 19: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [44] { return new Symbol(sym.GLOB); }");
            { return new Symbol(sym.GLOB);
            }
          case 43: break;
          case 20: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [46] { return new Symbol(sym.APPEL); }");
            { return new Symbol(sym.APPEL);
            }
          case 44: break;
          case 21: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [45] { return new Symbol(sym.ENTIER); }");
            { return new Symbol(sym.ENTIER);
            }
          case 45: break;
          case 22: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [47] { return new Symbol(sym.FONCTION); }");
            { return new Symbol(sym.FONCTION);
            }
          case 46: break;
          case 23: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [43] { return new Symbol(sym.RET); }");
            { return new Symbol(sym.RET);
            }
          case 47: break;
          case 24: 
            System.out.println("line: "+(yyline+1)+" "+"match: --"+zzToPrintable(yytext())+"--");
            System.out.println("action [48] { return new Symbol(sym.PRINC); }");
            { return new Symbol(sym.PRINC);
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Yylex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Yylex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Yylex(reader);
          do {
            System.out.println(scanner.next_token());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
