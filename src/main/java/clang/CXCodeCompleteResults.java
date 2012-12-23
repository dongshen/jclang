package clang;

import com.sun.jna.Structure;

/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXCodeCompleteResults extends Structure {
    /**
     * \brief The code-completion results.<br>
     * C type : CXCompletionResult*
     */
    public clang.CXCompletionResult.ByReference Results;
    /**
     * \brief The number of code-completion results stored in the<br>
     * \c Results array.
     */
    public int NumResults;

    public CXCodeCompleteResults() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new String[]{"Results", "NumResults"});
    }

    /**
     * @param Results    \brief The code-completion results.<br>
     *                   C type : CXCompletionResult*<br>
     * @param NumResults \brief The number of code-completion results stored in the<br>
     *                   \c Results array.
     */
    public CXCodeCompleteResults(clang.CXCompletionResult.ByReference Results, int NumResults) {
        super();
        this.Results = Results;
        this.NumResults = NumResults;
        initFieldOrder();
    }

    public static class ByReference extends CXCodeCompleteResults implements Structure.ByReference {

    }

    public static class ByValue extends CXCodeCompleteResults implements Structure.ByValue {

    }
}
