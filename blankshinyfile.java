package org.firstinspires.ftc.teamcode;

// import statements

/*The purpose of this program is to move the cascading lift up or down 100 ticks based 
on user input from controller 1, with the a and b buttons being pressed, although since this is just comments it does nothing.
*/
// This is a TeleOp program because it needs user input.
@TeleOp(name="Encoder movement")
// This class name should be the same as the name of the file. That might be why there is an error compiling.
public class blankshinyfile {
    /*
    set variables of tick number of a gobilda 5202/5203 motor (it's in here because we need to know how far we can move with a rotation.)
    set encoder #
    create cascading lift motor (it's the only one)
    create button variables
    find how much a robot will move in a rotation
    */
    
    @Override
    public void runOpMode() throws InterruptedException {
        //Declare motor from hardware map
        //set to run using encoders
        waitForStart();
        while(opModeIsActive()){
            // Add telemetry data of how far we're moving (just in case)
            // Set button values based on input from controller
            //if a button is pressed:
            //    movingvoid(Distance: -100 ticks, Speed: 0.5. Timeout: 5)
            //if b button is pressed:
            //    movingvoid(Distance: 100 ticks, Speed: 0.5, Timeout: 5)
        }
    }
    
    public void movingvoid(double Distance, double Speed, double Timeout){
        /*
        complex calculations (you shouldn't need to edit this, as it will be used in all programs and pretested. If the problem comes down to this, you can edit this.)
        */
    }
} //reset encoder values.
