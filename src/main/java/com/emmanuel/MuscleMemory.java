package com.emmanuel;
import java.util.Scanner;

public class MuscleMemory {
    static void main() {
                Scanner input = new Scanner(System.in);

                IO.print("Enter server uptime in total seconds: ");
                long totalSeconds = input.nextLong();

                long days = totalSeconds / 86400;
                long remainingSeconds = totalSeconds % 86400;

                long hours = remainingSeconds / 3600;
                remainingSeconds %= 3600;

                long minutes = remainingSeconds / 60;
                long seconds = remainingSeconds % 60;

                IO.println("Server Uptime:");
                IO.println("Days: " + days);
                IO.println("Hours: " + hours);
                IO.println("Minutes: " + minutes);
                IO.println("Seconds: " + seconds);

                input.close();
            }
        }
