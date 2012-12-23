package clang;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXType extends Structure {
    /**
     * @see CXTypeKind<br>
     *      C type : CXTypeKind
     */
    public int kind;
    /// C type : void*[2]
    public Pointer[] data = new Pointer[2];

    public CXType() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new String[]{"kind", "data"});
    }

    /**
     * @param kind @see CXTypeKind<br>
     *             C type : CXTypeKind<br>
     * @param data C type : void*[2]
     */
    public CXType(int kind, Pointer data[]) {
        super();
        this.kind = kind;
        if (data.length != this.data.length)
            throw new IllegalArgumentException("Wrong array size !");
        this.data = data;
        initFieldOrder();
    }

    public static class ByReference extends CXType implements Structure.ByReference {

    }

    public static class ByValue extends CXType implements Structure.ByValue {

    }
}
