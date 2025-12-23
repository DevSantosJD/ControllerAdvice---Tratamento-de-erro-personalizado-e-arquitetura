package com.example.records.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ApiError(
        int status,
        ErrorType type,
        String message,
        String path,
        LocalDateTime timestamp,
        List<String> details
) { }
