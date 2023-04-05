package jake2.render.opengl;

import java.nio.*;

import com.jogamp.opengl.GL2;

public class Jsr231GL implements QGL {

    private GL2 gl2;

    Jsr231GL() {
        // singleton
    }

    void setGL(GL2 gl2) {
        this.gl2 = gl2;
    }

    public void glAlphaFunc(int func, float ref) {
        gl2.glAlphaFunc(func, ref);
    }

    public void glBegin(int mode) {
        gl2.glBegin(mode);
    }

    public void glBindTexture(int target, int texture) {
        gl2.glBindTexture(target, texture);
    }

    public void glBlendFunc(int sfactor, int dfactor) {
        gl2.glBlendFunc(sfactor, dfactor);
    }

    public void glClear(int mask) {
        gl2.glClear(mask);
    }

    public void glClearColor(float red, float green, float blue, float alpha) {
        gl2.glClearColor(red, green, blue, alpha);
    }

    public void glColor3f(float red, float green, float blue) {
        gl2.glColor3f(red, green, blue);
    }

    public void glColor3ub(byte red, byte green, byte blue) {
        gl2.glColor3ub(red, green, blue);
    }

    public void glColor4f(float red, float green, float blue, float alpha) {
        gl2.glColor4f(red, green, blue, alpha);
    }

    public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
        gl2.glColor4ub(red, green, blue, alpha);
    }

    public void glColorPointer(int size, boolean unsigned, int stride,
            ByteBuffer pointer) {
        gl2.glColorPointer(size, GL_UNSIGNED_BYTE, stride, pointer);
    }

    public void glColorPointer(int size, int stride, FloatBuffer pointer) {
        gl2.glColorPointer(size, GL_FLOAT, stride, pointer);
    }

    public void glCullFace(int mode) {
        gl2.glCullFace(mode);
    }

    public void glDeleteTextures(IntBuffer textures) {
        gl2.glDeleteTextures(textures.limit(), textures);
    }

    public void glDepthFunc(int func) {
        gl2.glDepthFunc(func);
    }

    public void glDepthMask(boolean flag) {
        gl2.glDepthMask(flag);
    }

    public void glDepthRange(double zNear, double zFar) {
        gl2.glDepthRange(zNear, zFar);
    }

    public void glDisable(int cap) {
        gl2.glDisable(cap);
    }

    public void glDisableClientState(int cap) {
        gl2.glDisableClientState(cap);
    }

    public void glDrawArrays(int mode, int first, int count) {
        gl2.glDrawArrays(mode, first, count);
    }

    public void glDrawBuffer(int mode) {
        gl2.glDrawBuffer(mode);
    }

    public void glDrawElements(int mode, IntBuffer indices) {
        gl2.glDrawElements(mode, indices.limit(), GL_UNSIGNED_INT, indices);
    }

    public void glEnable(int cap) {
        gl2.glEnable(cap);
    }

    public void glEnableClientState(int cap) {
        gl2.glEnableClientState(cap);
    }

    public void glEnd() {
        gl2.glEnd();
    }

    public void glFinish() {
        gl2.glFinish();
    }

    public void glFlush() {
        gl2.glFlush();
    }

    public void glFrustum(double left, double right, double bottom,
            double top, double zNear, double zFar) {
        gl2.glFrustum(left, right, bottom, top, zNear, zFar);
    }

    public int glGetError() {
        return gl2.glGetError();
    }

    public void glGetFloat(int pname, FloatBuffer params) {
        gl2.glGetFloatv(pname, params);
    }

    public String glGetString(int name) {
        return gl2.glGetString(name);
    }

    public void glHint(int target, int mode) {
        gl2.glHint(target, mode);
    }

    public void glInterleavedArrays(int format, int stride,
            FloatBuffer pointer) {
        gl2.glInterleavedArrays(format, stride, pointer);
    }

    public void glLoadIdentity() {
        gl2.glLoadIdentity();
    }

    public void glLoadMatrix(FloatBuffer m) {
        gl2.glLoadMatrixf(m);
    }

    public void glMatrixMode(int mode) {
        gl2.glMatrixMode(mode);
    }

    public void glOrtho(double left, double right, double bottom,
            double top, double zNear, double zFar) {
        gl2.glOrtho(left, right, bottom, top, zNear, zFar);
    }

    public void glPixelStorei(int pname, int param) {
        gl2.glPixelStorei(pname, param);
    }

    public void glPointSize(float size) {
        gl2.glPointSize(size);
    }

    public void glPolygonMode(int face, int mode) {
        gl2.glPolygonMode(face, mode);
    }

    public void glPopMatrix() {
        gl2.glPopMatrix();
    }

    public void glPushMatrix() {
        gl2.glPushMatrix();
    }

    public void glReadPixels(int x, int y, int width, int height,
            int format, int type, ByteBuffer pixels) {
        gl2.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public void glRotatef(float angle, float x, float y, float z) {
        gl2.glRotatef(angle, x, y, z);
    }

    public void glScalef(float x, float y, float z) {
        gl2.glScalef(x, y, z);
    }

    public void glScissor(int x, int y, int width, int height) {
        gl2.glScissor(x, y, width, height);
    }

    public void glShadeModel(int mode) {
        gl2.glShadeModel(mode);
    }

    public void glTexCoord2f(float s, float t) {
        gl2.glTexCoord2f(s, t);
    }

    public void glTexCoordPointer(int size, int stride, FloatBuffer pointer) {
        gl2.glTexCoordPointer(size, GL_FLOAT, stride, pointer);
    }

    public void glTexEnvi(int target, int pname, int param) {
        gl2.glTexEnvi(target, pname, param);
    }

    public void glTexImage2D(int target, int level, int internalformat,
            int width, int height, int border, int format, int type,
            ByteBuffer pixels) {
        gl2.glTexImage2D(target, level, internalformat, width, height, border,
                format, type, pixels);
    }

    public void glTexImage2D(int target, int level, int internalformat,
            int width, int height, int border, int format, int type,
            IntBuffer pixels) {
        gl2.glTexImage2D(target, level, internalformat, width, height, border,
                format, type, pixels);
    }

    public void glTexParameterf(int target, int pname, float param) {
        gl2.glTexParameterf(target, pname, param);
    }

    public void glTexParameteri(int target, int pname, int param) {
        gl2.glTexParameteri(target, pname, param);
    }

    public void glTexSubImage2D(int target, int level, int xoffset,
            int yoffset, int width, int height, int format, int type,
            IntBuffer pixels) {
        gl2.glTexSubImage2D(target, level, xoffset, yoffset, width, height,
                format, type, pixels);
    }

    public void glTranslatef(float x, float y, float z) {
        gl2.glTranslatef(x, y, z);
    }

    public void glVertex2f(float x, float y) {
        gl2.glVertex2f(x, y);
    }

    public void glVertex3f(float x, float y, float z) {
        gl2.glVertex3f(x, y, z);
    }

    public void glVertexPointer(int size, int stride, FloatBuffer pointer) {
        gl2.glVertexPointer(size, GL_FLOAT, stride, pointer);
    }

    public void glViewport(int x, int y, int width, int height) {
        gl2.glViewport(x, y, width, height);
    }

    public void glColorTable(int target, int internalFormat, int width,
            int format, int type, ByteBuffer data) {
        gl2.glColorTable(target, internalFormat, width, format, type, data);
    }

    public void glActiveTextureARB(int texture) {
        gl2.glActiveTexture(texture);
    }

    public void glClientActiveTextureARB(int texture) {
        gl2.glClientActiveTexture(texture);
    }

//    public void glPointParameterEXT(int pname, FloatBuffer pfParams) {
//        gl2.glPointParameterfvEXT(pname, pfParams);
//    }
//
//    public void glPointParameterfEXT(int pname, float param) {
//        gl2.glPointParameterfEXT(pname, param);
//    }
    public void glLockArraysEXT(int first, int count) {
        gl2.glLockArraysEXT(first, count);
    }

    public void glArrayElement(int index) {
        gl2.glArrayElement(index);
    }

    public void glUnlockArraysEXT() {
        gl2.glUnlockArraysEXT();
    }

    public void glMultiTexCoord2f(int target, float s, float t) {
        gl2.glMultiTexCoord2f(target, s, t);
    }

    /*
     * util extensions
     */
    public void setSwapInterval(int interval) {
        gl2.setSwapInterval(interval);
    }

}
