TACZ ParCool Crawl Fix v1.0.0

Fixes an incompatibility between TACZ and ParCool that prevents players from crawling through 1-block gaps.

Minecraft: 1.21.1
NeoForge: 21.1.249+
TACZ: 1.1.8-hotfix-r7
ParCool: 3.4.3.3+

TACZ forcibly applies Pose.SWIMMING through setForcedPose, overriding ParCool's crawl pose. This mod cancels those forced-pose calls in TACZ's client and server crawl handlers, allowing ParCool to control the player's crawling pose normally.

Installation: install taczcool-1.0.0.jar on both client and server.

The mod is written for TACZ 1.1.8-hotfix-r7.
If TACZ changes its crawl/pose implementation in a future version,
the mixin may need to be updated.

TACZ r7 + ParCool 3.4.3.3 + NeoForge 21.1.249+
