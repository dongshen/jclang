package clang;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * \brief Provides the contents of a file that has not yet been saved to disk.<br>
 * * Each CXUnsavedFile instance provides the name of a file on the<br>
 * system along with the current contents of that file that have not<br>
 * yet been saved to disk.<br>
 * <i>native declaration : src/main/c/clang-c/Index.h:77</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXUnsavedFile extends Structure {
    /**
     * \brief The file whose contents have not yet been saved.<br>
     * * This file must already exist in the file system.<br>
     * C type : const char*
     */
    public Pointer Filename;
    /**
     * \brief A buffer containing the unsaved contents of this file.<br>
     * C type : const char*
     */
    public Pointer Contents;
    /// \brief The length of the unsaved contents of this buffer.
    public NativeLong Length;

    public CXUnsavedFile() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new String[]{"Filename", "Contents", "Length"});
    }

    /**
     * @param Filename \brief The file whose contents have not yet been saved.<br>
     *                 * This file must already exist in the file system.<br>
     *                 C type : const char*<br>
     * @param Contents \brief A buffer containing the unsaved contents of this file.<br>
     *                 C type : const char*<br>
     * @param Length   \brief The length of the unsaved contents of this buffer.
     */
    public CXUnsavedFile(Pointer Filename, Pointer Contents, NativeLong Length) {
        super();
        this.Filename = Filename;
        this.Contents = Contents;
        this.Length = Length;
        initFieldOrder();
    }

    public static class ByReference extends CXUnsavedFile implements Structure.ByReference {

    }

    public static class ByValue extends CXUnsavedFile implements Structure.ByValue {

    }
}
