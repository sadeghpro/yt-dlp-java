package com.wonkglorg.ytdlp.exception;

public class NotPlaylistException extends Exception {
    /**
     * Exception message
     */
    private String message;

    /**
     * Construct NoPlaylistException with a message
     *
     * @param message
     */
    public NotPlaylistException(String message) {
        this.message = message;
    }

    /**
     * Construct NoPlaylistException from another exception
     *
     * @param e Any exception
     */
    public NotPlaylistException(Exception e) {
        message = e.getMessage();
    }

    /**
     * Get exception message
     *
     * @return exception message
     */
    @Override
    public String getMessage() {
        return message;
    }
}
