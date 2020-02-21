// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package stringutils.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import stringutils.StringUtils;

/**
 * Translates a string into 'application/x-www-form-urlencoded' format using UTF-8 encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters.
 */
public class URLEncode extends CustomJavaAction<java.lang.String>
{
	private java.lang.String valueToEncode;

	public URLEncode(IContext context, java.lang.String valueToEncode)
	{
		super(context);
		this.valueToEncode = valueToEncode;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.URLEncode(valueToEncode);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "URLEncode";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}