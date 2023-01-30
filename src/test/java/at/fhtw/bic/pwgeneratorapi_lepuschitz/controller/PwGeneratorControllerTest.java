package at.fhtw.bic.pwgeneratorapi_lepuschitz.controller;

import at.fhtw.bic.pwgeneratorapi_lepuschitz.PWGeneratorController.PWGeneratorController;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

public class PwGeneratorControllerTest {
    @Test
    void passwordLength(){
        var controller = new PWGeneratorController();
        var result1 = controller.passwordLength('1');
        var result2 = controller.passwordLength('2');
        var result3 = controller.passwordLength('3');


    }

}

