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
* `/albums`: will display all albums in list after add them
* /albums/{id}` will display all the songs in a specific album
    * includes POST route to add new songs to the database and redirects to `/albums{id}` to display all the songs. Including the recent song added.
#### Modules 
* `Album` with String title , String artist , int songCount , double length ,String imageUrl;
* `Song` String title, long length, int trackNumber, Album album
* #### Repositories 
* AlbumRepositories : to add album to data base from album page and display it again
* SongRepositories : to add song to data base from album page and display it again