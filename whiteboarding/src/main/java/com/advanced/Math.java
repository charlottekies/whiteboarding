package com.advanced;

import java.awt.*;
import java.util.List;

public class Math {

    /** Line Intersection **/

        // Parallel Lines: Determining which pairs of lines are parallel to each other can be an advanced problem, as it involves mathematical calculations based on the equations of lines.
        // Parallel Lines: Given a set of lines, determine which pairs of lines are parallel to each other. This can involve mathematical calculations based on the equations of the lines.

    /** Calculating area of 2-d shapes **/

        // Area of a Circle: Implement a Java function to calculate the area of a circle based on its radius or diameter.

    public static double calculateCircleArea(double radius) {
        // TODO: Implement method stub
        return 1.0;
    }


    /** Trigonometry-Based Problems **/

        // Sine and Cosine Calculation: Write a Java program to calculate the sine and cosine values of angles in degrees or radians. You can use trigonometric formulas or Taylor series expansions.

    public static double calculateSine(double angleInDegrees) {
        // TODO: Implement method stub
        return 1.0;
    }

    public static double calculateCosine(double angleInDegrees) {
        // TODO: Implement method stub
        return 1.0;
    }


        // Triangle Solving: Given the lengths of two sides and an angle of a triangle, implement a Java method to calculate other properties of the triangle, such as the remaining angles and side lengths.

    public static double calculateTriangleProperties(double side1, double side2, double angleInDegrees) {
        // TODO: Implement method stub
        return 1.0;
    }


    // Projectile Motion: Solve a physics-based problem using trigonometric concepts. For example, calculate the trajectory of a projectile launched at a certain angle and initial velocity.
    /** ProjectileResult is a custom class that encapsulates the results of the projectile calculation. It has properties such as timeOfFlight, maxHeight, range, and path, which store relevant information.
     The ProjectileCalculator class contains the method calculateProjectile, which takes the initial velocity and launch angle as input parameters. Inside this method, you perform the necessary calculations to determine the projectile's trajectory and populate the ProjectileResult object with the calculated values.
     The method returns an instance of ProjectileResult containing all the relevant information about the projectile's motion.
     When calling the calculateProjectile method, you can then access the calculated results from the returned ProjectileResult object to obtain information about the projectile's trajectory.
     **/
    public class ProjectileResult {
        private double timeOfFlight; // Total time of flight in seconds
        private double maxHeight;    // Maximum height reached in meters
        private double range;        // Horizontal range in meters
        private List<Point> path;    // List of (x, y) coordinates at different times

        // TODO: Create Constructors, getters, and setters for the above properties
    }

    public class ProjectileCalculator {

        public ProjectileResult calculateProjectile(double initialVelocity, double launchAngleInDegrees) {
            // Calculate trajectory and populate the ProjectileResult object
            ProjectileResult result = new ProjectileResult();

            // TODO:  Perform calculations and populate the result object

            return result;
        }
    }
}
