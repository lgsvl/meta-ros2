# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Packages for working with Warthog from a ROS desktop."
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
HOMEPAGE = "http://wiki.ros.org/warthog_desktop"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warthog_desktop"
ROS_BPN = "warthog_desktop"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    warthog-msgs \
    warthog-viz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    warthog-msgs \
    warthog-viz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/clearpath-gbp/warthog_desktop-release/archive/release/melodic/warthog_desktop/0.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bdc3b5e330bd5719c1b874e23240ee24"
SRC_URI[sha256sum] = "3b839c59095be96b5f39a0473d13467834a3f7ef43d4bcbd7e53befb569025c8"
S = "${WORKDIR}/warthog_desktop-release-release-melodic-warthog_desktop-0.0.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('warthog-desktop', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('warthog-desktop', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/warthog-desktop/warthog-desktop_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/warthog-desktop/warthog-desktop-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/warthog-desktop/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/warthog-desktop/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}