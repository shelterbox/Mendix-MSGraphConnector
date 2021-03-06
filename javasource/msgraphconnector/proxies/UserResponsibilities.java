// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package msgraphconnector.proxies;

public class UserResponsibilities
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userResponsibilitiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MSGraphConnector.UserResponsibilities";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Responsibilities_User("MSGraphConnector.Responsibilities_User");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public UserResponsibilities(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MSGraphConnector.UserResponsibilities"));
	}

	protected UserResponsibilities(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userResponsibilitiesMendixObject)
	{
		if (userResponsibilitiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MSGraphConnector.UserResponsibilities", userResponsibilitiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MSGraphConnector.UserResponsibilities");

		this.userResponsibilitiesMendixObject = userResponsibilitiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UserResponsibilities.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static msgraphconnector.proxies.UserResponsibilities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return msgraphconnector.proxies.UserResponsibilities.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static msgraphconnector.proxies.UserResponsibilities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new msgraphconnector.proxies.UserResponsibilities(context, mendixObject);
	}

	public static msgraphconnector.proxies.UserResponsibilities load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return msgraphconnector.proxies.UserResponsibilities.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Responsibilities_User
	 */
	public final msgraphconnector.proxies.User getResponsibilities_User() throws com.mendix.core.CoreException
	{
		return getResponsibilities_User(getContext());
	}

	/**
	 * @param context
	 * @return value of Responsibilities_User
	 */
	public final msgraphconnector.proxies.User getResponsibilities_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		msgraphconnector.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Responsibilities_User.toString());
		if (identifier != null)
			result = msgraphconnector.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Responsibilities_User
	 * @param responsibilities_user
	 */
	public final void setResponsibilities_User(msgraphconnector.proxies.User responsibilities_user)
	{
		setResponsibilities_User(getContext(), responsibilities_user);
	}

	/**
	 * Set value of Responsibilities_User
	 * @param context
	 * @param responsibilities_user
	 */
	public final void setResponsibilities_User(com.mendix.systemwideinterfaces.core.IContext context, msgraphconnector.proxies.User responsibilities_user)
	{
		if (responsibilities_user == null)
			getMendixObject().setValue(context, MemberNames.Responsibilities_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Responsibilities_User.toString(), responsibilities_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userResponsibilitiesMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final msgraphconnector.proxies.UserResponsibilities that = (msgraphconnector.proxies.UserResponsibilities) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MSGraphConnector.UserResponsibilities";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
