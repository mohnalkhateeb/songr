# songr
This repo holds a  spring server with multiple get routes.

## Architecture

#### Main Files
* [HelloWorldController.java](src/main/java/com/example/songr/controllers/HelloWorldController.java)
* [ShowAlbumController.java](src/main/java/com/example/songr/controllers/AlbumsController.java)

## Usage
-`git clone repo`
- Open terminal, and run this command: `./gradlew bootRun`

#### Routes
* `/`: will return `Home Stub Route`
* `/hello`: will return `Hello World`
* `/capitalize/{input }`: will return the capitalization of  you input.
* `/albums`: will display all albums in list 