    package org.example.myproject.pages

    import androidx.compose.runtime.*
    import com.varabyte.kobweb.compose.css.FontWeight
    import com.varabyte.kobweb.compose.css.TextAlign.Companion.Center
    import com.varabyte.kobweb.compose.css.textAlign
    import com.varabyte.kobweb.compose.foundation.layout.Box
    import com.varabyte.kobweb.compose.foundation.layout.Row
    import com.varabyte.kobweb.compose.ui.*
    import com.varabyte.kobweb.core.Page
    import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
    import com.varabyte.kobweb.silk.components.text.Text
    import org.example.myproject.components.layouts.PageLayout
    import org.example.myproject.components.widgets.CustomButtonComponent
    import org.jetbrains.compose.web.css.*
    import org.jetbrains.compose.web.dom.P

    @Page
    @Composable
    fun HomePage() {
        PageLayout("") {
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier.width(760.px)
            ) {
                Row {
                    Box (contentAlignment = Alignment.Center) {
                        Text(
                            text = "Modern framework for full stack web apps in Kotlin",
                            modifier = Modifier.color(Color.whitesmoke).fontSize(64.px).fontWeight(FontWeight.Bold).styleModifier {
                                textAlign(Center)
                            },
                        )
                        P {
                            Text(
                                text = "Create production ready full stack web apps in a modern, concise and type safe programming language Kotlin. Kobweb includes everything you need to build modern static websites, as well as web applications faster.",
                                modifier = Modifier.lineHeight(1.75).color(Color.whitesmoke).styleModifier {
                                    textAlign(Center)
                                    opacity(60.percent)
                                }
                            )
                        }
                    }
                }
                Row {
                    CustomButtonComponent("/docs", "Start Learning", primary = true, modifier = Modifier.width(150.px)) {}
                    CustomButtonComponent("https://github.com/varabyte/kobweb", "Github", modifier = Modifier.padding(left = 12.px).width(150.px)) {
                        FaGithub()
                    }
                }
            }
        }
    }
