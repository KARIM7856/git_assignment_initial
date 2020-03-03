# Git Assignment
Contribute to Push Your Git Skills to the Next Level.

---

## Table of Contents

- [Example](#example)
- [Contributing](#contributing)
- [Contributors](#contributors)
- [Support](#support)

---

## Example

```Java
// This code is written in Java


/**
 *  1- Create your own class (SphereVolume.java)
 *  2- Extends from ISubscriber class (SphereVolume.java)
 *  3- Override notifySubscriber function (SphereVolume.java)
 *  4- Create an object like (SphereVolume, SimpleSubscriber) and pass it to subscribers array (Main.java)
 *  @author  Mahmoud Ahmed Tawfik(@mahmoudahmedd) - 20160227
 */


/**
 *  @file SphereVolume.java
 */

public class SphereVolume extends ISubscriber
{
    public SphereVolume(String input)
    {
        this.input = input;
    }
    
    @Override
    public void notifySubscriber(String input) 
    {
        double r = Double.parseDouble(input);
        double volume = ((4.0/3.0) * r * r * r) / Math.PI;
        
        System.out.println("Hello, I am really a sphere volume and I am notified with " + volume);
    }
}

/**
 *  @file Main.java
 */

import java.util.Scanner;

public class Main 
{
    
    /**
     *  1- Create an object like (SphereVolume, SimpleSubscriber)
     *  2- Pass it to subscribers array
     */
    private static ISubscriber subscribers [] = {
        new SphereVolume("5.0")
        new SimpleSubscriber("1.0") ,
        new MultiplicationSeries("2.0"),
        new SphereVolumeSubscriber("4.0"),
        new SummationSeries("3.0"),
        new CircleArea("5.0"),
        new Circlecir("4.0"),
        new TwoPowerN("5.0")
    };
    
    public static void main(String[] args) 
    {
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) 
        {
            mathTopic.addSubscriber(sub);
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }
}
```

---

## Contributing

To get started:

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine using `https://github.com/KARIM7856/git_assignment_initial`

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request using <a href="https://github.com/KARIM7856/git_assignment_initial/compare/" target="_blank">`https://github.com/KARIM7856/git_assignment_initial/compare/`</a>.

---

## Contributors

- <a href="https://github.com/mahmoudahmedd" target="_blank">Mahmoud Ahmed - 20160227</a> <br>
- <a href="https://github.com/halahamde" target="_blank">Hala Hamde</a> <br>
- <a href="https://github.com/KARIM7856" target="_blank">Karim Mohamed</a> <br>
- <a href="https://github.com/WaleedAbdelhakim" target="_blank">Waleed Abdelhakim</a> <br>
- <a href="https://github.com/MiraRaheemRaheem" target="_blank">Mira Raheem</a> <br>
- <a href="https://github.com/ebramohamed" target="_blank">Ebrahim Mohamed</a> <br>
- <a href="https://github.com/mariam4o" target="_blank">Mariam Osama</a> <br>

---

## Support

Reach out at one of the following places!

- <a href="https://app.slack.com/client/TUGTZCCMV/CU5GYSEHX/details/members" target="_blank">Slack.com</a>
