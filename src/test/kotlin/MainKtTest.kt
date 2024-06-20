import org.example.foo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun `Placeholder xyz`() {
        assertDoesNotThrow {
            foo()
        }
    }
}