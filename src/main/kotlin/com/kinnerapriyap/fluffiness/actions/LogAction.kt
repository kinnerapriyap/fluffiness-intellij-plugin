package com.kinnerapriyap.fluffiness.actions

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class LogAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val notification = NotificationGroup("fluffiness", NotificationDisplayType.BALLOON, true)
        notification.createNotification(
            "Did it work?",
            "Yass",
            NotificationType.INFORMATION,
            null
        ).notify(e.project)
    }
}