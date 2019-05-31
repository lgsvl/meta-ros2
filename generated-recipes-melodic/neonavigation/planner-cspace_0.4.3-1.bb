# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "3-dof configuration space planner for mobile robot"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "planner_cspace"

ROS_BUILD_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    costmap-cspace \
    costmap-cspace-msgs \
    diagnostic-updater \
    geometry-msgs \
    move-base-msgs \
    nav-msgs \
    neonavigation-common \
    planner-cspace-msgs \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
    trajectory-tracker-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    map-server \
    roslint \
    rostest \
    rosunit \
    trajectory-tracker \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/planner_cspace/0.4.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c41f83282212cae72d32433f2729720c"
SRC_URI[sha256sum] = "a351ffe8a5433acc6b289ff3b75d8018745e1dde317e153a11c9235afd9e9515"
S = "${WORKDIR}/neonavigation-release-release-melodic-planner_cspace-0.4.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('neonavigation', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('neonavigation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/neonavigation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/neonavigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}