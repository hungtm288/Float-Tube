package com.floatvideo.popup.extractor.playlist;

import com.floatvideo.popup.extractor.exceptions.ParsingException;

public interface PlayListInfoItemExtractor {
    String getThumbnailUrl() throws ParsingException;
    String getPlayListName() throws ParsingException;
    String getWebPageUrl() throws ParsingException;
}
