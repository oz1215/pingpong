package net.mtgto.irc.bot.pingpong

import net.mtgto.irc.{Bot, Client}
import net.mtgto.irc.event._

import util.matching.Regex
import util.matching.Regex.Match

class PingPongBot extends Bot {

  override def onMessage(message: Message) = {
    if (message.text == "ping") {
      Client.sendNotice(message.channel, "pong")
    }
  }

}
