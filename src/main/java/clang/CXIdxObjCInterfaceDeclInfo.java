package clang;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxObjCInterfaceDeclInfo extends Structure {
	/// C type : const CXIdxObjCContainerDeclInfo*
	public clang.CXIdxObjCContainerDeclInfo.ByReference containerInfo;
	/// C type : const CXIdxBaseClassInfo*
	public clang.CXIdxBaseClassInfo.ByReference superInfo;
	/// C type : const CXIdxObjCProtocolRefListInfo*
	public clang.CXIdxObjCProtocolRefListInfo.ByReference protocols;
	public CXIdxObjCInterfaceDeclInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"containerInfo", "superInfo", "protocols"});
	}
	/**
	 * @param containerInfo C type : const CXIdxObjCContainerDeclInfo*<br>
	 * @param superInfo C type : const CXIdxBaseClassInfo*<br>
	 * @param protocols C type : const CXIdxObjCProtocolRefListInfo*
	 */
	public CXIdxObjCInterfaceDeclInfo(clang.CXIdxObjCContainerDeclInfo.ByReference containerInfo, clang.CXIdxBaseClassInfo.ByReference superInfo, clang.CXIdxObjCProtocolRefListInfo.ByReference protocols) {
		super();
		this.containerInfo = containerInfo;
		this.superInfo = superInfo;
		this.protocols = protocols;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxObjCInterfaceDeclInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxObjCInterfaceDeclInfo implements Structure.ByValue {
		
	};
}
