#!/bin/bash
#
# Convert project to Eclipse project.
rm -f .project
rm -f .classpath
cp -Rf resources/* .
cp resources/.project .
cp resources/.classpath .
rm -rf resources
rm -f jforum.ipr
rm -f jForum.T.iml
#rm jforum.iws
