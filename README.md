# Fabulous Fabric Mod

## Setup

After cloning this repo, on commandline run:

 * gradlew --refresh-dependencies genSources downloadAssets
 
To run minecraft with this mod and some helpful extra ones in extra_mods/ from commandline:

 * gradlew runWithMods  
 
For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) 
that relates to the IDE that you are using. e.g. for Eclipse, this will generate the necessary project IDE configs:

 * gradlew eclipse 

You can then open this project in Eclipse by importing it as an existing project. 
For added convenience, you should install the Eclipse Buildship plugin for Gradle, 
then add Gradle nature to the Eclipse project.  You can then browse and launch 
gradle tasks from within Eclipse.

## License

This project is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
