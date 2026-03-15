#!/bin/bash

# Script to help set up GitHub repository settings
# This is a reference guide - you'll need to do these manually on GitHub

echo "==========================================="
echo "GitHub Repository Setup Checklist"
echo "==========================================="
echo ""

echo "📍 Step 1: Add Topics/Tags"
echo "-------------------------------------------"
echo "Go to: https://github.com/sdeonvacation/throttle"
echo "Click the gear icon (⚙️) next to 'About'"
echo ""
echo "Add these topics (copy and paste):"
echo "java, concurrency, executor-service, task-scheduler, resource-management,"
echo "background-jobs, spring-boot, thread-pool, batch-processing,"
echo "adaptive-executor, cpu-monitoring, memory-monitoring, pause-resume,"
echo "priority-scheduling, java17, java-library, maven-central"
echo ""
echo "Press Enter when done..."
read

echo ""
echo "📍 Step 2: Update Description"
echo "-------------------------------------------"
echo "In the same 'About' dialog, set description to:"
echo "Resource-aware Java task executor with automatic pause/resume."
echo "Offload heavy background tasks and let your app focus on business logic. 🚀"
echo ""
echo "Press Enter when done..."
read

echo ""
echo "📍 Step 3: Enable Discussions"
echo "-------------------------------------------"
echo "Go to: https://github.com/sdeonvacation/throttle/settings"
echo "Scroll to 'Features' section"
echo "✅ Check 'Discussions'"
echo ""
echo "This enables community Q&A and engagement!"
echo ""
echo "Press Enter when done..."
read

echo ""
echo "📍 Step 4: Configure Discussion Categories"
echo "-------------------------------------------"
echo "Go to: https://github.com/sdeonvacation/throttle/discussions"
echo "Click 'Categories' (pencil icon)"
echo ""
echo "Create these categories:"
echo "  💬 Q&A - Questions and answers"
echo "  💡 Ideas - Feature requests and suggestions"
echo "  🎉 Show and tell - Share your projects using Throttle"
echo "  📣 Announcements - Project updates"
echo "  🐛 General - Everything else"
echo ""
echo "Press Enter when done..."
read

echo ""
echo "📍 Step 5: Set Up Branch Protection (Optional)"
echo "-------------------------------------------"
echo "Go to: Settings → Branches → Add rule"
echo "Branch name pattern: master"
echo "✅ Require pull request before merging"
echo "✅ Require status checks to pass (CI)"
echo ""
echo "Press Enter to skip or when done..."
read

echo ""
echo "📍 Step 6: Enable GitHub Pages (Optional)"
echo "-------------------------------------------"
echo "Go to: Settings → Pages"
echo "Source: Deploy from a branch"
echo "Branch: master → /docs folder"
echo ""
echo "This will create a documentation website!"
echo ""
echo "Press Enter to skip or when done..."
read

echo ""
echo "=========================================="
echo "✅ GitHub Setup Complete!"
echo "=========================================="
echo ""
echo "Next steps:"
echo "1. Star your own repo to get it started! ⭐"
echo "2. Share on social media (see SOCIAL_MEDIA_TEMPLATES.md)"
echo "3. Submit to awesome-java list"
echo "4. Write a blog post on Dev.to"
echo ""
echo "Your repository is now optimized for visibility!"
echo ""

# Show current repository info
echo "Current repository: https://github.com/sdeonvacation/throttle"
echo "Maven Central: https://central.sonatype.com/artifact/io.github.sdeonvacation/throttle"
echo ""
