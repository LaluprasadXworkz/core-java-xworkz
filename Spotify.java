class Spotify {
    String songNames[] = new String[11];
    int index;

    public boolean addSong(String name) {
        boolean isAdded = false;

        if (songNames.length > index) {
            if (songNames != null) {
                boolean exists = checkSongName(name);
                if (!exists) {
                    songNames[index] = name;
                    index++;
                    isAdded = true;
                } else {
                    System.out.println(name + " Song already added");
                }
            }
        } else {
            System.out.println("Array Index Out Of BoundsException:" + songNames.length);
        }

        return isAdded;
    }

    public boolean checkSongName(String name) {
        boolean exists = false;
        for (int index = 0; index < songNames.length; index++) {
            if (songNames[index] ==name) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public boolean deleteSongName(String name) {
        boolean isDeleted = false;
        String newPlayerNames[] = new String[songNames.length - 1];
        int ind = 0;

        for (int index = 0; index < songNames.length; index++) {
            if (!songNames[index].equals(name)) {
                newPlayerNames[ind++] = songNames[index];
                isDeleted = true;
            }
        }

        
        System.out.println("the deleted Song name:" + name);
        System.out.println("Updated list of Playlist:");
        for (int index = 0; index < newPlayerNames.length; index++) {
            System.out.println(newPlayerNames[index]);
        }

        return isDeleted;
    }

    public String searchSongName(String name) {
        String exists = null;

        for (int index = 0; index < songNames.length; index++) {
            if (songNames[index] != null) {
                exists = songNames[index];
                break;
            }
        }

        System.out.println("Song name is in the playlist: " + exists);

        return exists;
    }

    public void getDisplay() {
        System.out.println("List of Songs:");
        for (int index = 0; index < songNames.length; index++) {
            if (songNames[index] != null) {
                System.out.println(songNames[index]);
            }
        }
    }
}


