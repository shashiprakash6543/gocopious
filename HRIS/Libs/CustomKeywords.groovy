
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "customkeywords.logout.refreshBrowser"() {
    (new customkeywords.logout()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "customkeywords.logout.clickElement"(
    	TestObject to	) {
    (new customkeywords.logout()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "customkeywords.logout.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new customkeywords.logout()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Refresh browser
	 */ 
def static "customkeywords.sigin.refreshBrowser"() {
    (new customkeywords.sigin()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "customkeywords.sigin.clickElement"(
    	TestObject to	) {
    (new customkeywords.sigin()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "customkeywords.sigin.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new customkeywords.sigin()).getHtmlTableRows(
        	table
         , 	outerTagName)
}


def static "customkeywords.logind.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.logind()).login(
        	username
         , 	password)
}


def static "customkeywords.loginf.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.loginf()).login(
        	username
         , 	password)
}


def static "customkeywords.loginc.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.loginc()).login(
        	username
         , 	password)
}


def static "customkeywords.logine.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.logine()).login(
        	username
         , 	password)
}


def static "customkeywords.loging.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.loging()).login(
        	username
         , 	password)
}


def static "customkeywords.logina.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.logina()).login(
        	username
         , 	password)
}


def static "customkeywords.loginb.login"(
    	String username	
     , 	String password	) {
    (new customkeywords.loginb()).login(
        	username
         , 	password)
}


def static "com.katalon.testcloud.FileExecutor.exist"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).exist(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.getFileContent"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).getFileContent(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.getFileDescriptor"(
    	String fileName	) {
    (new com.katalon.testcloud.FileExecutor()).getFileDescriptor(
        	fileName)
}


def static "com.katalon.testcloud.FileExecutor.pushFileToDevice"(
    	String destinationPath	
     , 	String localFilePath	) {
    (new com.katalon.testcloud.FileExecutor()).pushFileToDevice(
        	destinationPath
         , 	localFilePath)
}


def static "com.katalon.testcloud.FileExecutor.uploadFileToWeb"(
    	TestObject to	
     , 	String filePath	) {
    (new com.katalon.testcloud.FileExecutor()).uploadFileToWeb(
        	to
         , 	filePath)
}


def static "com.katalon.testcloud.GeolocationExecutor.setMobileGeoLocation"(
    	double latitude	
     , 	double longitude	
     , 	double altitude	) {
    (new com.katalon.testcloud.GeolocationExecutor()).setMobileGeoLocation(
        	latitude
         , 	longitude
         , 	altitude)
}


def static "com.katalon.testcloud.BiometricsAuthenticator.authenticatePass"() {
    (new com.katalon.testcloud.BiometricsAuthenticator()).authenticatePass()
}


def static "com.katalon.testcloud.BiometricsAuthenticator.authenticateFail"() {
    (new com.katalon.testcloud.BiometricsAuthenticator()).authenticateFail()
}


def static "com.katalon.testcloud.CameraImageInjectionExecutor.exist"(
    	String fileName	) {
    (new com.katalon.testcloud.CameraImageInjectionExecutor()).exist(
        	fileName)
}


def static "com.katalon.testcloud.CameraImageInjectionExecutor.injectImage"(
    	String fileName	) {
    (new com.katalon.testcloud.CameraImageInjectionExecutor()).injectImage(
        	fileName)
}


def static "com.katalon.testcloud.ThrottleNetworkExecutor.setNetworkProfile"(
    	String condition	) {
    (new com.katalon.testcloud.ThrottleNetworkExecutor()).setNetworkProfile(
        	condition)
}


def static "com.katalon.testcloud.ThrottleNetworkExecutor.customNetworkProfile"(
    	int downloadSpeed	
     , 	int uploadSpeed	
     , 	int latency	) {
    (new com.katalon.testcloud.ThrottleNetworkExecutor()).customNetworkProfile(
        	downloadSpeed
         , 	uploadSpeed
         , 	latency)
}
