/**
Copyright 2012-2013 SMILE Consortium, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
**/

package org.smilec.smile.teacher;

public class MessageString {

	final static String WELCOME_MSG = "Welcome to SMILE.";
	final static String HELP_FIRST = 
	   "Welcome to SMILE. Before start the activity, check settings are configured appropriately for your envrionment.\n"
	 + "To start the activity, press Connect button in the activity flow panel.";
	
	final static String WAIT_NOTICE = 
		"Waiting for the students to join.";
	
	final static String MK_Q_NOTICE = 
		"Waiting for the students to make questions.";
	final static String SV_Q_WARNING = 
		"Need more than one questions";
	final static String SV_Q_NOTICE = 
		"Waiting for the students to solve questions.";
	final static String SR_NOTICE = 
		"Quiz reults are sent to each student.";
	
	final static String TOOLTIP_CHECKTIME = "Time Limit mode is not supported in this version.";
	
	final static String ERROR_APACH_TOP ="Invalid apache top directory. Please browse correct apache top  directory in your server setting." +
	"\nThe system will automatically create the directory  <topdir>/JunctionServerExecution/current " +
	", if the directory does not exist already.\n" + 
	"\n Press Coneect again when you fix the setting.";
	
	final static String ERROR_CREATE_JUNTION_TOP = "Cannot create execution directory. Please browse correct apache top directory in your server setting." +
	"\nThe system will automatically create the directory  <topdir>/JunctionServerExecution/current " +
	", if the directory does not exist already.\n" + 
	"\n Press Coneect again when you fix the setting.";
	
	final static String ERROR_BROWSE_PREV = "Invalid directory is selected for previous questions. Please browse again.";
	
	
	
}
