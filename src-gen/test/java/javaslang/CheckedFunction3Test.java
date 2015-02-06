/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;
import org.junit.Test;

public class CheckedFunction3Test {

    @Test
    public void shouldGetArity() {
        final CheckedFunction3<Object, Object, Object, Object> f = (o1, o2, o3) -> null;
        assertThat(f.arity()).isEqualTo(3);
    }

    @Test
    public void shouldCurry() {
        final CheckedFunction3<Object, Object, Object, Object> f = (o1, o2, o3) -> null;
        final CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, Object>>> curried = f.curried();
        assertThat(curried).isNotNull();
    }

    @Test
    public void shouldTuple() {
        final CheckedFunction3<Object, Object, Object, Object> f = (o1, o2, o3) -> null;
        final CheckedFunction1<Tuple3<Object, Object, Object>, Object> tupled = f.tupled();
        assertThat(tupled).isNotNull();
    }

    @Test
    public void shouldReverse() {
        final CheckedFunction3<Object, Object, Object, Object> f = (o1, o2, o3) -> null;
        assertThat(f.reversed()).isNotNull();
    }

    @Test
    public void shouldComposeWithAndThen() {
        final CheckedFunction3<Object, Object, Object, Object> f = (o1, o2, o3) -> null;
        final Function<Object, Object> after = o -> null;
        final CheckedFunction3<Object, Object, Object, Object> composed = f.andThen(after);
        assertThat(composed).isNotNull();
    }
}