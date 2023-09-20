class SpotifyExe {
    public static void main(String[] song) {
        LoveSongs spotify = new LoveSongs();

        spotify.addSong("Chaleya");
        spotify.addSong("Zihaal e Miskin");
        spotify.addSong("Dil Jhoom");
        spotify.addSong("Apna Bana Le");
        spotify.addSong("Udd Jaa Kaale Kaava");
        spotify.addSong("Guli Mata");
        spotify.addSong("Yeh Jism");
        spotify.addSong("Tere Sang Yaara");
        spotify.addSong("Sapna Jahan");
        spotify.addSong("Ra Ra Rakkamma");
        spotify.addSong("Kalalo Kooda");

        spotify.getDisplay();
        spotify.searchSongName("Ra Ra Rakkamma");
        spotify.deleteSongName("Ra Ra Rakkamma");
    }
}