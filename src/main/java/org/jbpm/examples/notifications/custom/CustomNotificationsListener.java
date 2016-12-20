package org.jbpm.examples.notifications.custom;

import java.util.logging.Logger;

import org.jbpm.services.task.deadlines.NotificationListener;
import org.kie.internal.task.api.UserInfo;
import org.kie.internal.task.api.model.NotificationEvent;

public class CustomNotificationsListener implements NotificationListener  {
	
	private Logger logger = Logger.getLogger(CustomNotificationsListener.class.getName());

	public void onNotification(NotificationEvent arg0, UserInfo arg1) {
		logger.info("Invoking Custom Notification Interface");
		
	}

}
