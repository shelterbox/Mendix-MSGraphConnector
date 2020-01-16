// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Logging;
import communitycommons.proxies.LogLevel;
import communitycommons.proxies.LogNodes;
import java.text.ParseException;

/**
 * This method parses a date from a string with a given pattern according to a specific timezone.
 * The timezone has to be a valid timezone id http://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html (e.g. one of https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/) 
 */
public class ParseDateTimeWithTimezone extends CustomJavaAction<java.util.Date>
{
	private java.lang.String date;
	private java.lang.String pattern;
	private java.lang.String timeZone;
	private java.util.Date defaultValue;

	public ParseDateTimeWithTimezone(IContext context, java.lang.String date, java.lang.String pattern, java.lang.String timeZone, java.util.Date defaultValue)
	{
		super(context);
		this.date = date;
		this.pattern = pattern;
		this.timeZone = timeZone;
		this.defaultValue = defaultValue;
	}

	@Override
	public java.util.Date executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (date == null || date.trim().equals("")) {
			return defaultValue;
		}
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
			return sdf.parse(date);
		} catch (ParseException e) {
			Logging.log(LogNodes.CommunityCommons.getCaption(), LogLevel.Warning, "Unable to parse date " + date, e);
			return defaultValue;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ParseDateTimeWithTimezone";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
