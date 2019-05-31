# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS   action (from actionlib) types. By utilizing rqt_msg, the output format is   unified with it and rqt_srv. Note that the actions shown on this plugin   is the ones that are stored on your machine, not on the ROS core your rqt   instance connects to."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Isaac Isao Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_action"
ROS_BPN = "rqt_action"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rospy \
    rqt-msg \
    rqt-py-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rospy \
    rqt-msg \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_action-release/archive/release/melodic/rqt_action/0.4.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f86fdfcc836a16e0b304457cb99ee7f6"
SRC_URI[sha256sum] = "5ac33f2d857d43c2c79f82f73070f6dec9bf326ea6bc0b3bce4e49c3d5b8c7d8"
S = "${WORKDIR}/rqt_action-release-release-melodic-rqt_action-0.4.9-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-action', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-action', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-action/rqt-action_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-action/rqt-action-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-action/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-action/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}