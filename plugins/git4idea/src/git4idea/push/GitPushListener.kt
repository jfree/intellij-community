// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package git4idea.push

import com.intellij.util.messages.Topic
import git4idea.repo.GitRepository

interface GitPushListener {
  fun onCompleted(repository: GitRepository, pushResult: GitPushRepoResult)

  companion object {
    @JvmStatic
    @Topic.AppLevel
    val TOPIC: Topic<GitPushListener> = Topic(GitPushListener::class.java, Topic.BroadcastDirection.NONE)
  }
}