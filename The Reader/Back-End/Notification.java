
public abstract class Notification {
	String message;
	NotificationState notificationState;
	
	public Notification(String message, NotificationState notificationState) {
		this.message = message;
		this.notificationState = notificationState;
	}
	
	public void setNotficationState(NotificationState notificationState)
	{
		this.notificationState = notificationState;
	}
	
	public void getBackGroundColor()
	{
		notificationState.getBackGroundColor();
	}

	public abstract Notification clone();
	
	public abstract void onclick() ;

}
