/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btManifoldResult {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btManifoldResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btManifoldResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btManifoldResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btManifoldResult() {
    this(gdxBulletJNI.new_btManifoldResult__SWIG_0(), true);
  }

  public btManifoldResult(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    this(gdxBulletJNI.new_btManifoldResult__SWIG_1(btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap), true);
  }

  public void setPersistentManifold(btPersistentManifold manifoldPtr) {
    gdxBulletJNI.btManifoldResult_setPersistentManifold(swigCPtr, this, btPersistentManifold.getCPtr(manifoldPtr), manifoldPtr);
  }

  public btPersistentManifold getPersistentManifold() {
    long cPtr = gdxBulletJNI.btManifoldResult_getPersistentManifold__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public void setShapeIdentifiersA(int partId0, int index0) {
    gdxBulletJNI.btManifoldResult_setShapeIdentifiersA(swigCPtr, this, partId0, index0);
  }

  public void setShapeIdentifiersB(int partId1, int index1) {
    gdxBulletJNI.btManifoldResult_setShapeIdentifiersB(swigCPtr, this, partId1, index1);
  }

  public void addContactPoint(Vector3 normalOnBInWorld, Vector3 pointInWorld, float depth) {
    gdxBulletJNI.btManifoldResult_addContactPoint(swigCPtr, this, normalOnBInWorld, pointInWorld, depth);
  }

  public void refreshContactPoints() {
    gdxBulletJNI.btManifoldResult_refreshContactPoints(swigCPtr, this);
  }

  public btCollisionObjectWrapper getBody0Wrap() {
	return btCollisionObjectWrapper.internalTemp(gdxBulletJNI.btManifoldResult_getBody0Wrap(swigCPtr, this), false);
}

  public btCollisionObjectWrapper getBody1Wrap() {
	return btCollisionObjectWrapper.internalTemp(gdxBulletJNI.btManifoldResult_getBody1Wrap(swigCPtr, this), false);
}

  public void setBody0Wrap(btCollisionObjectWrapper obj0Wrap) {
    gdxBulletJNI.btManifoldResult_setBody0Wrap(swigCPtr, this, btCollisionObjectWrapper.getCPtr(obj0Wrap), obj0Wrap);
  }

  public void setBody1Wrap(btCollisionObjectWrapper obj1Wrap) {
    gdxBulletJNI.btManifoldResult_setBody1Wrap(swigCPtr, this, btCollisionObjectWrapper.getCPtr(obj1Wrap), obj1Wrap);
  }

  public btCollisionObject getBody0Internal() {
	return btCollisionObject.getInstance(gdxBulletJNI.btManifoldResult_getBody0Internal(swigCPtr, this), false);
}

  public btCollisionObject getBody1Internal() {
	return btCollisionObject.getInstance(gdxBulletJNI.btManifoldResult_getBody1Internal(swigCPtr, this), false);
}

}
