package com.wonkglorg.ytdlp.functional;

import com.wonkglorg.ytdlp.exception.YtDlpException;

import java.util.Objects;
import java.util.function.BiFunction;

@SuppressWarnings("unused")
@FunctionalInterface
public interface TriFunction<T, U, V, E> {
    E apply(T t, U u, V v) throws YtDlpException;

    default <W> TriFunction<T, U, V, W> andThen(BiFunction<? super E, ? super V, ? extends W> after) {
        Objects.requireNonNull(after);
        return (t, u, v) -> after.apply(apply(t, u, v), v);
    }
}
