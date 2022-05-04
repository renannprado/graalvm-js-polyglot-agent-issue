package dev.renann;

import org.graalvm.polyglot.Context;

public class Main {

    public static void main(String[] args) throws Exception {
        try (final var context = Context.newBuilder().allowAllAccess(true).build()) {
            final var js = context.getBindings("js");
            context.eval("js", """
                console.log("hello world");
                """);
        }
    }
}