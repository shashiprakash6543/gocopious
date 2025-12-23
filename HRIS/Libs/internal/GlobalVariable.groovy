package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object stagingURL
     
    /**
     * <p></p>
     */
    public static Object prodURL
     
    /**
     * <p></p>
     */
    public static Object browser
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            URL = selectedVariables['URL']
            stagingURL = selectedVariables['stagingURL']
            prodURL = selectedVariables['prodURL']
            browser = selectedVariables['browser']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
