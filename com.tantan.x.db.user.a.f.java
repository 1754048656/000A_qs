package com.tantan.x.db.user.a;

import android.widget.TextView;
import com.blankj.utilcode.util.bd;
import com.blankj.utilcode.util.bj;
import com.tantan.x.R;
import com.tantan.x.common.config.data.BackgroundImage;
import com.tantan.x.common.config.data.HideUserInfoTag;
import com.tantan.x.d.n;
import com.tantan.x.d.p;
import com.tantan.x.data.Audio;
import com.tantan.x.data.Image;
import com.tantan.x.db.user.Account;
import com.tantan.x.db.user.Car;
import com.tantan.x.db.user.DatingCharacter;
import com.tantan.x.db.user.Education;
import com.tantan.x.db.user.HoldHandsInfo;
import com.tantan.x.db.user.House;
import com.tantan.x.db.user.Income;
import com.tantan.x.db.user.Info;
import com.tantan.x.db.user.Job;
import com.tantan.x.db.user.Life;
import com.tantan.x.db.user.Membership;
import com.tantan.x.db.user.PopUp;
import com.tantan.x.db.user.Privilege;
import com.tantan.x.db.user.Punishment;
import com.tantan.x.db.user.Relationship;
import com.tantan.x.db.user.Tag;
import com.tantan.x.db.user.TagCategory;
import com.tantan.x.db.user.TagItem;
import com.tantan.x.db.user.User;
import com.tantan.x.db.user.UserMedia;
import com.tantan.x.db.user.Verifications;
import com.tantan.x.db.user.Wealth;
import com.tantan.x.group.data.PostUserInfo;
import com.tantan.x.network.api.body.ChattingFeedbackItem;
import com.tantan.x.repository.i;
import com.tantan.x.repository.l;
import com.tantan.x.repository.m;
import com.tantan.x.utils.ah;
import com.tantan.x.utils.ak;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\ba\u001a\f\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0011\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0013\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0014\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010\u0015\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\f\u0010\u0018\u001a\u00020\u0007*\u0004\u0018\u00010\r\u001a\f\u0010\u0019\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\r\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\r\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\r\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010!\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\"\u001a\u000e\u0010#\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010$\u001a\u000e\u0010%\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170'*\u0004\u0018\u00010\r\u001a\u000e\u0010(\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010)\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\f\u0010*\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,*\u00020\r\u001a\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,*\b\u0012\u0004\u0012\u00020-0,\u001a\n\u0010.\u001a\u00020\u0007*\u00020\r\u001a\u000e\u0010/\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\r\u001a\f\u00100\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\f\u00101\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00102\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00103\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00104\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010!\u001a\u000e\u00104\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00105\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00106\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00107\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u00108\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\f\u00109\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020-0,*\u00020\r2\b\b\u0002\u0010;\u001a\u00020\u000f\u001a\u0014\u0010<\u001a\u0004\u0018\u00010-*\u00020\r2\u0006\u0010=\u001a\u00020>\u001a\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020-0'*\u00020\r2\u0006\u0010=\u001a\u00020>\u001a\n\u0010@\u001a\u00020\u0007*\u00020\r\u001a\n\u0010A\u001a\u00020>*\u00020\r\u001a\n\u0010B\u001a\u00020\u0017*\u00020\r\u001a\n\u0010C\u001a\u00020\u0017*\u00020\u0007\u001a\u000e\u0010D\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\r\u001a\u0012\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170'*\u0004\u0018\u00010\r\u001a\u001c\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u001b0Gj\b\u0012\u0004\u0012\u00020\u001b`H*\u0004\u0018\u00010\r\u001a\u000e\u0010I\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\n\u0010J\u001a\u00020\u0017*\u00020\r\u001a\f\u0010K\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020-0,*\u00020\r\u001a\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020-0,*\b\u0012\u0004\u0012\u00020-0,\u001a\f\u0010M\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\f\u0010N\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u0016\u0010O\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\r2\u0006\u0010P\u001a\u00020\u0007\u001a\u0010\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0,*\u00020\r\u001a\u001b\u0010S\u001a\u0004\u0018\u00010>*\u0004\u0018\u00010\r2\u0006\u0010P\u001a\u00020\u0007¢\u0006\u0002\u0010T\u001a\u0013\u0010U\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\r¢\u0006\u0002\u0010V\u001a\u000e\u0010W\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010X\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010Y\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010Z\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\r\u001a\n\u0010[\u001a\u00020\u001b*\u00020\r\u001a\n\u0010\\\u001a\u00020]*\u00020\r\u001a\n\u0010^\u001a\u00020!*\u00020\r\u001a\n\u0010_\u001a\u00020`*\u00020\r\u001a\n\u0010a\u001a\u00020b*\u00020\r\u001a\u0010\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0G*\u00020\r\u001a\u0010\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001b0,*\u00020\r\u001a\u0010\u0010e\u001a\b\u0012\u0004\u0012\u00020-0,*\u00020\r\u001a\n\u0010f\u001a\u00020g*\u00020\r\u001a\n\u0010h\u001a\u00020i*\u00020\r\u001a\f\u0010j\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\u000e\u0010k\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\r\u001a\u000e\u0010l\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\r\u001a\u001c\u0010m\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010,*\u0004\u0018\u00010\r2\u0006\u0010n\u001a\u00020\u0007\u001a\f\u0010o\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\f\u0010p\u001a\u00020\u0017*\u0004\u0018\u00010\r\u001a\f\u0010p\u001a\u00020\u0017*\u0004\u0018\u00010\"\u001a\u000e\u0010q\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\r\u001a\u000e\u0010r\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\r\u001a\u000e\u0010s\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\r\u001a\n\u0010t\u001a\u00020\r*\u00020\r\u001a\f\u0010u\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u0012\u0010v\u001a\u00020\u000f*\u00020\r2\u0006\u0010=\u001a\u00020>\u001a\n\u0010w\u001a\u00020\u000f*\u00020\r\u001a\n\u0010x\u001a\u00020\u000f*\u00020\r\u001a\n\u0010y\u001a\u00020\u000f*\u00020\r\u001a\u0014\u0010z\u001a\u00020\u000f*\u0004\u0018\u00010\r2\u0006\u0010{\u001a\u00020\u0017\u001a\f\u0010|\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\f\u0010}\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\n\u0010~\u001a\u00020\u000f*\u00020\r\u001a\f\u0010\u007f\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0080\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0081\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0082\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0083\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0084\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0085\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0086\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0087\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0088\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0089\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008a\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008b\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008c\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008d\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008e\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u008f\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0090\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0091\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0092\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0093\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0094\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0095\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0096\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0097\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0098\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0099\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u0099\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010\u009a\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u009a\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010\u009b\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u009c\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u009c\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010\u009d\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u009e\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010\u009f\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010 \u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u000b\u0010¡\u0001\u001a\u00020\u000f*\u00020\r\u001a\r\u0010¢\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010£\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¤\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¥\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¦\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010§\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¨\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¨\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010©\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010ª\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010«\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u0016\u0010«\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r2\u0007\u0010¬\u0001\u001a\u00020>\u001a\r\u0010\u00ad\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010®\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010®\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010¯\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010°\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010±\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010²\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010³\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010´\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010µ\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010µ\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010¶\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¶\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010·\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010·\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010¸\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¸\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\"\u001a\r\u0010¹\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010º\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u000b\u0010»\u0001\u001a\u00020\u000f*\u00020\r\u001a\u000b\u0010¼\u0001\u001a\u00020\u000f*\u00020\r\u001a\r\u0010½\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¾\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010¿\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010À\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010Á\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010Â\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010Ã\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u0015\u0010Ä\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r2\u0006\u0010{\u001a\u00020\u0017\u001a\r\u0010Å\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\u000b\u0010Æ\u0001\u001a\u00020\"*\u00020\r\u001a\u000b\u0010Ç\u0001\u001a\u00020\f*\u00020\r\u001a\r\u0010È\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\u001a\r\u0010É\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\r\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\b\u0010\t¨\u0006Ê\u0001"}, d2 = {"textView2Lines", "Landroid/widget/TextView;", "getTextView2Lines", "()Landroid/widget/TextView;", "textView2Lines$delegate", "Lkotlin/Lazy;", "textViewWidth2Lines", "", "getTextViewWidth2Lines", "()I", "textViewWidth2Lines$delegate", "avatarPreLoad", "", "Lcom/tantan/x/db/user/User;", "baseInfoIsComplete", "", "carIsComplete", "characterTestIsComplete", "companyIsComplete", "descriptionIsNull", "disLikeOther", "enableShowPullWireWeChatDialog", "getAge", "", "getAgeInt", "getAgeStr", "getAvatar", "Lcom/tantan/x/db/user/UserMedia;", "getAvatarBg", "Lcom/tantan/x/common/config/data/BackgroundImage;", "getAvatarImage", "Lcom/tantan/x/data/Image;", "getAvatarUrl", "Lcom/tantan/x/db/user/Info;", "Lcom/tantan/x/group/data/PostUserInfo;", "getBirthdayString", "Ljava/util/Date;", "getCarString", "getDescSplit", "", "getDescription", "getEduLevelString", "getEduSchoolStr", "getFavoriteLikeCard", "", "Lcom/tantan/x/db/user/Tag;", "getFavoriteLikeCardCount", "getFirstMyLife", "getGender", "getHeight", "getHometownOfCity", "getHometownOfProvince", "getHometownProvinceAndCity", "getHouseString", "getIdCardName", "getIdCardNumber", "getIncome", "getIndustry", "getLikeCard", "useMe", "getLikeCardById", "id", "", "getLikeCardByThemeId", "getLikeCardSize", "getLikeMeTime", "getLovePurpose", "getLovePurposeString", "getMVipPeriod", "getMarkingTagList", "getMyLife", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getName", "getNewEduSchoolStr", "getNike", "getNormalLikeCard", "getPosition", "getPositionStr", "getRelationCreatedTime", "type", "getRelationShips", "Lcom/tantan/x/db/user/Relationship;", "getRelationUpdateTime", "(Lcom/tantan/x/db/user/User;I)Ljava/lang/Long;", "getResidenceChangeAvailable", "(Lcom/tantan/x/db/user/User;)Ljava/lang/Boolean;", "getResidenceCityId", "getResidenceOfCity", "getResidenceProvinceAndCity", "getSVipPeriod", "getSafeAvatar", "getSafeEdu", "Lcom/tantan/x/db/user/Education;", "getSafeInfo", "getSafeJob", "Lcom/tantan/x/db/user/Job;", "getSafeLife", "Lcom/tantan/x/db/user/Life;", "getSafeMedias", "getSafeMyLife", "getSafeTag", "getSafeVerify", "Lcom/tantan/x/db/user/Verifications;", "getSafeWealth", "Lcom/tantan/x/db/user/Wealth;", "getSchool", "getSecondMyLife", "getSeeVipPeriod", "getSkipLife", "skip", "getTaShengText", "getTaText", "getThirdMyLife", "getVipPeriod", "getZodiac", "hardCopy", "hasWechat", "haveLikeCard", "hideEducation", "hideIncome", "hideSchool", "homeTownInCity", "cityId", "houseIsComplete", "incomeIsComplete", "infoNeedVerity", "isAcceptPullWires", "isActiveInvisible", "isAlreadySendFlower", "isAvatarVerity", "isAvatarVerityOrPadding", "isBan", "isBanned", "isBannedOrLogout", "isBetween24and38", "isBlockVipGuide", "isCityRec", "isDefault", "isDelayBan", "isEditInfoShowInSchool", "isEduVerity", "isEduVerityOrPadding", "isFake", "isFemale", "isGood", "isGuide", "isIdCardVerity", "isIdCardVerityOrPadding", "isInfoNull", "isLeaveNote", "isLikeMe", "isLogout", "isMVip", "isMVipInvisible", "isMVipPause", "isMale", "isMatch", "isMe", "isMute", "isMyLifeCountMoreThan3", "isNewLikeMe", "isNoneUserId", "isNull", "isOnline", "isOpenFaceVerified", "isOwnCar", "isOwnHouse", "isPVip", "isProblemPending", "isPullWires", "isQsAccepted", "userId", "isReceiveNote", "isSVip", "isSeeVip", "isSeeVipExired", "isShield", "isShowMVip", "isShowVipTip", "isUnPair", "isVip", "isVipInvisible", "isVipOrPVip", "isVipOrSVip", "isWarn", "libraIsComplete", "likeCardIsComplete", "likeCardIsNull", "likeOther", "lovePurposeIsComplete", "maritalIsComplete", "myLifeIsComplete", "onceBuyMatchmaker", "registerLessThan72Hour", "registerMoreThanOneDay", "residenceInCity", "schoolIsComplete", "toPostUserInfo", "updateFlowerRelation", "userInfoIsComplete", "voiceIsNull", "app_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
public final class f {
    static final /* synthetic */ KProperty[] a = {(KProperty) Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(f.class, "app_release"), "textViewWidth2Lines", "getTextViewWidth2Lines()I")), (KProperty) Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(f.class, "app_release"), "textView2Lines", "getTextView2Lines()Landroid/widget/TextView;"))};
    @org.c.a.d
    private static final Lazy b = LazyKt.lazy(C0036f.a);
    @org.c.a.d
    private static final Lazy c = LazyKt.lazy(e.a);

    public static final int a() {
        Lazy lazy = b;
        KProperty kProperty = a[0];
        return ((Number) lazy.getValue()).intValue();
    }

    @org.c.a.d
    public static final TextView b() {
        Lazy lazy = c;
        KProperty kProperty = a[1];
        return (TextView) lazy.getValue();
    }

    public static final boolean i(@org.c.a.e User user) {
        return user == null;
    }

    public static final boolean a(@org.c.a.e User user) {
        if (user == null) {
            return true;
        }
        Long id = user.getId();
        return id != null && id.longValue() == Long.MIN_VALUE;
    }

    public static final boolean b(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), com.tantan.x.db.user.d.b);
    }

    public static final boolean c(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), com.tantan.x.db.user.d.g);
    }

    public static final boolean d(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), com.tantan.x.db.user.d.f);
    }

    public static final boolean e(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), "fake");
    }

    public static final boolean f(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), com.tantan.x.db.user.d.e);
    }

    public static final boolean g(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), "default");
    }

    public static final boolean h(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return Intrinsics.areEqual(user.getStatus(), com.tantan.x.db.user.d.d);
    }

    public static final boolean j(@org.c.a.e User user) {
        return user == null || user.getInfo() == null;
    }

    @org.c.a.e
    public static final UserMedia k(@org.c.a.e User user) {
        List<UserMedia> medias;
        if (user == null || (medias = user.getMedias()) == null) {
            return null;
        }
        return (UserMedia) CollectionsKt.getOrNull(medias, 0);
    }

    @org.c.a.e
    public static final UserMedia l(@org.c.a.e User user) {
        List<UserMedia> medias;
        if (user == null || (medias = user.getMedias()) == null) {
            return null;
        }
        return (UserMedia) CollectionsKt.getOrNull(medias, 1);
    }

    @org.c.a.e
    public static final UserMedia m(@org.c.a.e User user) {
        List<UserMedia> medias;
        if (user == null || (medias = user.getMedias()) == null) {
            return null;
        }
        return (UserMedia) CollectionsKt.getOrNull(medias, 2);
    }

    @org.c.a.e
    public static final List<UserMedia> a(@org.c.a.e User user, int i) {
        List<UserMedia> medias;
        if (user == null || (medias = user.getMedias()) == null || medias.size() <= i) {
            return null;
        }
        return medias.subList(i, medias.size());
    }

    public static final boolean n(@org.c.a.e User user) {
        if (o(user)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.b(m.b.c());
        }
        return false;
    }

    public static final boolean o(@org.c.a.e User user) {
        Verifications verifications;
        if (Intrinsics.areEqual((user == null || (verifications = user.getVerifications()) == null) ? null : verifications.getPictureVerified(), true)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.c(m.b.c());
        }
        return false;
    }

    public static final boolean p(@org.c.a.e User user) {
        Verifications verifications;
        return Intrinsics.areEqual((user == null || (verifications = user.getVerifications()) == null) ? null : verifications.getOpenPictureVerified(), true);
    }

    public static final boolean q(@org.c.a.e User user) {
        Verifications verifications;
        if (Intrinsics.areEqual((user == null || (verifications = user.getVerifications()) == null) ? null : verifications.getIdentityVerified(), true)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.d(m.b.c());
        }
        return false;
    }

    public static final boolean r(@org.c.a.e User user) {
        if (s(user)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.f(m.b.c());
        }
        return false;
    }

    public static final boolean s(@org.c.a.e User user) {
        Verifications verifications;
        if (Intrinsics.areEqual((user == null || (verifications = user.getVerifications()) == null) ? null : verifications.getEducationVerified(), true)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.e(m.b.c());
        }
        return false;
    }

    public static final boolean t(@org.c.a.e User user) {
        if (q(user)) {
            return true;
        }
        if (aA(user)) {
            return com.tantan.x.network.api.body.b.a(m.b.c());
        }
        return false;
    }

    @org.c.a.e
    public static final String u(@org.c.a.e User user) {
        Info info;
        if (user == null || (info = user.getInfo()) == null) {
            return null;
        }
        return info.getRealName();
    }

    @org.c.a.e
    public static final String v(@org.c.a.e User user) {
        Info info;
        if (user == null || (info = user.getInfo()) == null) {
            return null;
        }
        return info.getIdCard();
    }

    public static final long w(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<Relationship> relationships = user.getRelationships();
        if (relationships != null) {
            for (Relationship relationship : relationships) {
                Integer relationType = relationship.getRelationType();
                if (relationType != null && relationType.intValue() == 2) {
                    return relationship.getUpdatedTime();
                }
            }
        }
        return System.currentTimeMillis();
    }

    public static final boolean x(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        long w = w(user) / ((long) ChattingFeedbackItem.PROFILE_GOOD);
        Long e2 = i.b.f().e();
        if (e2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(e2, "RelationRepo.newLikeMeTime.get()!!");
        return w > e2.longValue() && !i.b.c().contains(user.getId());
    }

    public static final boolean y(@org.c.a.e User user) {
        return A(user) || B(user);
    }

    public static final boolean z(@org.c.a.e User user) {
        return A(user) || D(user);
    }

    public static final boolean a(@org.c.a.e PostUserInfo postUserInfo) {
        return e(postUserInfo) || g(postUserInfo);
    }

    public static final boolean b(@org.c.a.e PostUserInfo postUserInfo) {
        return e(postUserInfo) || f(postUserInfo);
    }

    public static final boolean c(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Privilege> privileges;
        Privilege privilege;
        return (postUserInfo == null || (privileges = postUserInfo.getPrivileges()) == null || (privilege = privileges.get(Privilege.NAME_VIP_INVISIBLE)) == null || privilege.getStatus() != 1) ? false : true;
    }

    public static final boolean d(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Privilege> privileges;
        Privilege privilege;
        return (postUserInfo == null || (privileges = postUserInfo.getPrivileges()) == null || (privilege = privileges.get(Privilege.NAME_MVIP_INVISIBLE)) == null || privilege.getStatus() != 1) ? false : true;
    }

    public static final boolean A(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("vvip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean e(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (postUserInfo == null || (memberships = postUserInfo.getMemberships()) == null || (membership = memberships.get("vvip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean B(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("svip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean C(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("cityRec")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean f(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (postUserInfo == null || (memberships = postUserInfo.getMemberships()) == null || (membership = memberships.get("svip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean D(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("pvip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean g(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (postUserInfo == null || (memberships = postUserInfo.getMemberships()) == null || (membership = memberships.get("pvip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean E(@org.c.a.d User user) {
        Boolean hideIncome;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        HideUserInfoTag hideUserInfoTag = aL(user).getHideUserInfoTag();
        if (hideUserInfoTag == null || (hideIncome = hideUserInfoTag.getHideIncome()) == null) {
            return false;
        }
        return hideIncome.booleanValue();
    }

    public static final boolean F(@org.c.a.d User user) {
        Boolean hideSchool;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        HideUserInfoTag hideUserInfoTag = aL(user).getHideUserInfoTag();
        if (hideUserInfoTag == null || (hideSchool = hideUserInfoTag.getHideSchool()) == null) {
            return false;
        }
        return hideSchool.booleanValue();
    }

    public static final boolean G(@org.c.a.d User user) {
        Boolean hideEducation;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        HideUserInfoTag hideUserInfoTag = aL(user).getHideUserInfoTag();
        if (hideUserInfoTag == null || (hideEducation = hideUserInfoTag.getHideEducation()) == null) {
            return false;
        }
        return hideEducation.booleanValue();
    }

    public static final boolean H(@org.c.a.e User user) {
        Membership membership;
        Boolean active;
        Boolean active2;
        if (user != null) {
            Membership membership2 = user.getMembership();
            boolean booleanValue = (membership2 == null || (active2 = membership2.getActive()) == null) ? false : active2.booleanValue();
            if (booleanValue) {
                return booleanValue;
            }
            Map<String, Membership> memberships = user.getMemberships();
            if (memberships == null || (membership = memberships.get("mvip")) == null || (active = membership.getActive()) == null) {
                return false;
            }
            return active.booleanValue();
        }
        return false;
    }

    public static final boolean I(@org.c.a.e User user) {
        return H(user) && !M(user);
    }

    public static final boolean J(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        if (user == null || (memberships = user.getMemberships()) == null) {
            return false;
        }
        Membership membership = memberships.get("mvip");
        Integer status = membership != null ? membership.getStatus() : null;
        return status != null && status.intValue() == 1;
    }

    public static final boolean K(@org.c.a.e User user) {
        Map<String, Privilege> privileges;
        Privilege privilege;
        return (user == null || (privileges = user.getPrivileges()) == null || (privilege = privileges.get(Privilege.NAME_ACTIVE_INVISIBLE)) == null || privilege.getStatus() != 1) ? false : true;
    }

    public static final boolean L(@org.c.a.e User user) {
        Map<String, Privilege> privileges;
        Privilege privilege;
        return (user == null || (privileges = user.getPrivileges()) == null || (privilege = privileges.get(Privilege.NAME_VIP_INVISIBLE)) == null || privilege.getStatus() != 1) ? false : true;
    }

    public static final boolean M(@org.c.a.e User user) {
        Map<String, Privilege> privileges;
        Privilege privilege;
        return (user == null || (privileges = user.getPrivileges()) == null || (privilege = privileges.get(Privilege.NAME_MVIP_INVISIBLE)) == null || privilege.getStatus() != 1) ? false : true;
    }

    public static final boolean h(@org.c.a.e PostUserInfo postUserInfo) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (postUserInfo == null || (memberships = postUserInfo.getMemberships()) == null || (membership = memberships.get("mvip")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    public static final boolean N(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        if (user == null || user.getMembership() == null) {
            return (user == null || (memberships = user.getMemberships()) == null || memberships.get("mvip") == null) ? false : true;
        }
        return true;
    }

    @org.c.a.e
    public static final Date O(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("svip")) == null) {
            return null;
        }
        return membership.getExpire();
    }

    @org.c.a.e
    public static final Date P(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("vvip")) == null) {
            return null;
        }
        return membership.getExpire();
    }

    @org.c.a.e
    public static final Date Q(@org.c.a.e User user) {
        Membership membership;
        Date date = null;
        Date date2 = null;
        if (user != null) {
            Membership membership2 = user.getMembership();
            Date expire = membership2 != null ? membership2.getExpire() : null;
            if (expire == null) {
                Map<String, Membership> memberships = user.getMemberships();
                if (memberships != null && (membership = memberships.get("mvip")) != null) {
                    date = membership.getExpire();
                }
                return date;
            }
            return expire;
        }
        return date2;
    }

    // 谁看过我
    public static final boolean R(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("see")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return active.booleanValue();
    }

    // 谁看过我
     // 判断
    public static final boolean S(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        boolean z = false;
        if (user != null && (memberships = user.getMemberships()) != null) {
            for (Membership membership : memberships.values()) {
                if (membership.getBuyTime() != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final boolean T(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        Boolean active;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("see")) == null || (active = membership.getActive()) == null) {
            return false;
        }
        return !active.booleanValue();
    }

    @org.c.a.e
    public static final Date U(@org.c.a.e User user) {
        Map<String, Membership> memberships;
        Membership membership;
        if (user == null || (memberships = user.getMemberships()) == null || (membership = memberships.get("see")) == null) {
            return null;
        }
        return membership.getExpire();
    }

    public static final boolean V(@org.c.a.e User user) {
        Info info;
        return ac(user) && ab(user) && ad(user) && X(user) && W(user) && aa(user) && af(user) && Z(user) && (!Y(user) || (user != null && (info = user.getInfo()) != null && com.tantan.x.db.user.a.d.l(info)));
    }

    public static final boolean W(@org.c.a.e User user) {
        return com.tantan.x.db.user.a.d.j(user != null ? user.getInfo() : null);
    }

    public static final boolean X(@org.c.a.e User user) {
        return com.tantan.x.db.user.a.d.i(user != null ? user.getInfo() : null);
    }

    public static final boolean Y(@org.c.a.e User user) {
        Info info;
        Education b2;
        Integer age;
        int i = 0;
        if (user == null || (info = user.getInfo()) == null || (b2 = com.tantan.x.db.user.a.d.b(info)) == null) {
            return false;
        }
        Info info2 = user.getInfo();
        if (info2 != null && (age = info2.getAge()) != null) {
            i = age.intValue();
        }
        return b2.isEditInfoShowInSchool(i);
    }

    public static final boolean Z(@org.c.a.e User user) {
        return com.tantan.x.db.user.a.d.k(user != null ? user.getInfo() : null);
    }

    public static final boolean aa(@org.c.a.e User user) {
        Info info;
        Life life;
        String maritalStatus;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null || (maritalStatus = life.getMaritalStatus()) == null) {
            return false;
        }
        return !Intrinsics.areEqual(maritalStatus, com.tantan.x.db.user.d.J);
    }

    public static final boolean ab(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        Car car;
        Integer ownType;
        return (user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null || (car = wealth.getCar()) == null || (ownType = car.getOwnType()) == null || ownType.intValue() == 0) ? false : true;
    }

    public static final boolean ac(@org.c.a.e User user) {
        Info aL;
        String zodiac;
        boolean z = false;
        if (user == null || (aL = aL(user)) == null || (zodiac = aL.getZodiac()) == null) {
            return false;
        }
        Pair<Pair<Integer, Integer>, String> pair = ah.L().get(zodiac);
        String str = pair != null ? (String) pair.getSecond() : null;
        return !((str == null || StringsKt.isBlank(str)) ? true : true);
    }

    public static final boolean ad(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        House house;
        Integer ownType;
        return (user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null || (house = wealth.getHouse()) == null || (ownType = house.getOwnType()) == null || ownType.intValue() == 0) ? false : true;
    }

    public static final boolean ae(@org.c.a.e User user) {
        List<UserMedia> medias;
        if (user == null || (medias = user.getMedias()) == null) {
            return false;
        }
        return !medias.isEmpty();
    }

    public static final boolean af(@org.c.a.e User user) {
        Info info;
        return (user == null || (info = user.getInfo()) == null || info.getLovePurpose() == 0) ? false : true;
    }

    public static final boolean ag(@org.c.a.e User user) {
        return user != null && aa(user) && V(user) && ae(user) && !bE(user) && bG(user) && bH(user);
    }

    public static final boolean ah(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        return com.tantan.x.db.user.a.a.a((user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null) ? null : wealth.getCar());
    }

    @org.c.a.e
    public static final String ai(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        Car car;
        if (user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null || (car = wealth.getCar()) == null) {
            return null;
        }
        return com.tantan.x.db.user.a.a.b(car);
    }

    public static final boolean aj(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        return com.tantan.x.db.user.a.b.a((user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null) ? null : wealth.getHouse());
    }

    @org.c.a.e
    public static final String ak(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        House house;
        if (user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null || (house = wealth.getHouse()) == null) {
            return null;
        }
        return com.tantan.x.db.user.a.b.b(house);
    }

    @org.c.a.e
    public static final String al(@org.c.a.e User user) {
        Info info;
        Life life;
        return com.tantan.x.utils.a.d.c((user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null) ? null : life.getHomeTown());
    }

    @org.c.a.e
    public static final String am(@org.c.a.e User user) {
        Info info;
        Life life;
        return com.tantan.x.utils.a.d.a((user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null) ? null : life.getHomeTown());
    }

    @org.c.a.e
    public static final String an(@org.c.a.e User user) {
        Info info;
        Life life;
        String residence;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null || (residence = life.getResidence()) == null) {
            return null;
        }
        return com.tantan.x.utils.a.d.a(residence);
    }

    @org.c.a.e
    public static final String ao(@org.c.a.e User user) {
        Info info;
        Education education;
        Integer level;
        if (user == null || (info = user.getInfo()) == null || (education = info.getEducation()) == null || (level = education.getLevel()) == null) {
            return null;
        }
        return com.tantan.x.utils.a.c.a(level);
    }

    @org.c.a.e
    public static final String ap(@org.c.a.e User user) {
        Info info;
        Life life;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null) {
            return null;
        }
        return life.getResidence();
    }

    @org.c.a.e
    public static final Boolean aq(@org.c.a.e User user) {
        Info info;
        Life life;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null) {
            return null;
        }
        return life.getResidenceChangeAvailable();
    }

    public static final boolean ar(@org.c.a.e User user) {
        Info info;
        return Intrinsics.areEqual((user == null || (info = user.getInfo()) == null) ? null : info.getGender(), "male");
    }

    public static final boolean as(@org.c.a.e User user) {
        Info info;
        return Intrinsics.areEqual((user == null || (info = user.getInfo()) == null) ? null : info.getGender(), "female");
    }

    public static final boolean i(@org.c.a.e PostUserInfo postUserInfo) {
        return Intrinsics.areEqual(postUserInfo != null ? postUserInfo.getGender() : null, "male");
    }

    @org.c.a.d
    public static final String j(@org.c.a.e PostUserInfo postUserInfo) {
        return Intrinsics.areEqual(postUserInfo != null ? postUserInfo.getGender() : null, "male") ? "他" : "她";
    }

    @org.c.a.d
    public static final String at(@org.c.a.e User user) {
        Info info;
        return Intrinsics.areEqual((user == null || (info = user.getInfo()) == null) ? null : info.getGender(), "male") ? "她" : "他";
    }

    @org.c.a.d
    public static final String au(@org.c.a.e User user) {
        Info info;
        return Intrinsics.areEqual((user == null || (info = user.getInfo()) == null) ? null : info.getGender(), "male") ? "女生" : "男生";
    }

    @org.c.a.d
    public static final String av(@org.c.a.e User user) {
        Info info;
        String gender;
        return (user == null || (info = user.getInfo()) == null || (gender = info.getGender()) == null) ? "" : ah.b(gender);
    }

    @org.c.a.e
    public static final String aw(@org.c.a.e User user) {
        Info info;
        if (user == null || (info = user.getInfo()) == null) {
            return null;
        }
        return info.getDescription();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r14 != null) goto L8;
     */
    @org.c.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<java.lang.String> ax(@org.c.a.e com.tantan.x.db.user.User r14) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tantan.x.db.user.a.f.ax(com.tantan.x.db.user.User):java.util.List");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.tantan.x.db.user.a.f$f */
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class C0036f extends Lambda implements Function0<Integer> {
        public static final C0036f a = new C0036f();

        C0036f() {
            super(0);
        }

        public /* synthetic */ Object invoke() {
            return Integer.valueOf(a());
        }

        public final int a() {
            return bd.a() - p.a(2131165663);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class e extends Lambda implements Function0<TextView> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @org.c.a.d
        /* renamed from: a */
        public final TextView invoke() {
            TextView textView = new TextView(com.tantanapp.common.android.a.b.i);
            textView.setTextSize(0, p.a(2131166091));
            return textView;
        }
    }

    public static final boolean ay(@org.c.a.e User user) {
        Info info;
        String description = (user == null || (info = user.getInfo()) == null) ? null : info.getDescription();
        return description == null || description.length() == 0;
    }

    public static final boolean az(@org.c.a.e User user) {
        List<Relationship> relationships;
        Relationship relationship;
        Integer relationType = (user == null || (relationship = user.getRelationship()) == null) ? null : relationship.getRelationType();
        boolean z = false;
        boolean z2 = relationType != null && relationType.intValue() == 7;
        if (z2) {
            return z2;
        }
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        Iterator<Relationship> it = relationships.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Integer relationType2 = it.next().getRelationType();
            if (relationType2 != null && relationType2.intValue() == 5) {
                z = true;
                break;
            }
        }
        return z;
    }

    public static final boolean aA(@org.c.a.e User user) {
        if (user == null) {
            return false;
        }
        return com.tantan.x.repository.a.l.a(user.getId());
    }

    public static final boolean aB(@org.c.a.e User user) {
        Long id;
        return (user == null || (id = user.getId()) == null || com.tantan.x.repository.a.j != id.longValue()) ? false : true;
    }

    @org.c.a.d
    public static final String aC(@org.c.a.e User user) {
        Info info;
        Job job;
        String industry;
        return (user == null || (info = user.getInfo()) == null || (job = info.getJob()) == null || (industry = job.getIndustry()) == null) ? "" : industry;
    }

    @org.c.a.d
    public static final String aD(@org.c.a.e User user) {
        Info info;
        Job job;
        String position;
        return (user == null || (info = user.getInfo()) == null || (job = info.getJob()) == null || (position = job.getPosition()) == null) ? "" : position;
    }

    @org.c.a.d
    public static final String aE(@org.c.a.e User user) {
        return com.tantan.x.db.user.a.d.f(user != null ? user.getInfo() : null);
    }

    @org.c.a.e
    public static final String aF(@org.c.a.e User user) {
        Info info;
        Wealth wealth;
        Income income;
        if (user == null || (info = user.getInfo()) == null || (wealth = info.getWealth()) == null || (income = wealth.getIncome()) == null) {
            return null;
        }
        return com.tantan.x.db.user.a.c.a(income);
    }

    @org.c.a.d
    public static final String aG(@org.c.a.e User user) {
        String h = com.tantan.x.db.user.a.d.h(user != null ? user.getInfo() : null);
        return h != null ? h : "";
    }

    @org.c.a.e
    public static final String aH(@org.c.a.e User user) {
        Info info;
        Integer age;
        if (user == null || (info = user.getInfo()) == null || (age = info.getAge()) == null) {
            return null;
        }
        return String.valueOf(age.intValue());
    }

    @org.c.a.d
    public static final String aI(@org.c.a.e User user) {
        Info info;
        Integer age;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf((user == null || (info = user.getInfo()) == null || (age = info.getAge()) == null) ? 0 : age.intValue()));
        sb.append("岁");
        return sb.toString();
    }

    public static final int aJ(@org.c.a.e User user) {
        Info info;
        Integer age;
        if (user == null || (info = user.getInfo()) == null || (age = info.getAge()) == null) {
            return 0;
        }
        return age.intValue();
    }

    @org.c.a.e
    public static final String aK(@org.c.a.e User user) {
        Info info;
        Pair<Pair<Integer, Integer>, String> pair = ah.L().get((user == null || (info = user.getInfo()) == null) ? null : info.getZodiac());
        if (pair != null) {
            return (String) pair.getSecond();
        }
        return null;
    }

    @org.c.a.d
    public static final Info aL(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info info = user.getInfo();
        if (info != null) {
            return info;
        }
        Info info2 = new Info(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 8388607, null);
        user.setInfo(info2);
        return info2;
    }

    @org.c.a.d
    public static final List<Tag> aM(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<Tag> tags = user.getTags();
        if (tags != null) {
            return tags;
        }
        ArrayList arrayList = new ArrayList();
        user.setTags(arrayList);
        return arrayList;
    }

    @org.c.a.d
    public static final UserMedia aN(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info aL = aL(user);
        UserMedia avatar = aL.getAvatar();
        if (avatar != null) {
            return avatar;
        }
        UserMedia userMedia = new UserMedia(null, null, null, null, null, null, null, null, 255, null);
        aL.setAvatar(userMedia);
        return userMedia;
    }

    @org.c.a.d
    public static final Wealth aO(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info aL = aL(user);
        Wealth wealth = aL.getWealth();
        if (wealth != null) {
            return wealth;
        }
        Wealth wealth2 = new Wealth(null, null, null, 7, null);
        aL.setWealth(wealth2);
        return wealth2;
    }

    @org.c.a.d
    public static final Life aP(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info aL = aL(user);
        Life life = aL.getLife();
        if (life != null) {
            return life;
        }
        Life life2 = new Life(null, null, null, null, null, null, 63, null);
        aL.setLife(life2);
        return life2;
    }

    @org.c.a.d
    public static final Verifications aQ(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Verifications verifications = user.getVerifications();
        if (verifications != null) {
            return verifications;
        }
        Verifications verifications2 = new Verifications(null, null, null, null, null, 31, null);
        user.setVerifications(verifications2);
        return verifications2;
    }

    @org.c.a.d
    public static final Job aR(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info aL = aL(user);
        Job job = aL.getJob();
        if (job != null) {
            return job;
        }
        Job job2 = new Job(null, null, 3, null);
        aL.setJob(job2);
        return job2;
    }

    @org.c.a.d
    public static final Education aS(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info aL = aL(user);
        Education education = aL.getEducation();
        if (education != null) {
            return education;
        }
        Education education2 = new Education(null, null, null, 7, null);
        aL.setEducation(education2);
        return education2;
    }

    @org.c.a.d
    public static final ArrayList<UserMedia> aT(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<UserMedia> medias = user.getMedias();
        List<UserMedia> list = medias;
        if (list == null || list.isEmpty()) {
            ArrayList<UserMedia> arrayList = new ArrayList<>();
            user.setMedias(arrayList);
            return arrayList;
        } else if (medias != null) {
            return (ArrayList) medias;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.tantan.x.db.user.UserMedia>");
        }
    }

    @org.c.a.d
    public static final List<Relationship> aU(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<Relationship> relationships = user.getRelationships();
        if (relationships != null) {
            return relationships;
        }
        ArrayList arrayList = new ArrayList();
        user.setRelationships(arrayList);
        return arrayList;
    }

    @org.c.a.e
    public static final Image aV(@org.c.a.e User user) {
        Info info;
        UserMedia avatar;
        if (user == null || (info = user.getInfo()) == null || (avatar = info.getAvatar()) == null) {
            return null;
        }
        return avatar.getImage();
    }

    @org.c.a.e
    public static final UserMedia aW(@org.c.a.e User user) {
        Info info;
        if (user == null || (info = user.getInfo()) == null) {
            return null;
        }
        return info.getAvatar();
    }

    public static final void aX(@org.c.a.e User user) {
        Image image;
        String url;
        UserMedia aW = aW(user);
        if (aW == null || (image = aW.getImage()) == null || (url = image.getUrl()) == null) {
            return;
        }
        l.h.a(url);
    }

    @org.c.a.e
    public static final String aY(@org.c.a.e User user) {
        Info info;
        UserMedia avatar;
        Image image;
        if (user == null || (info = user.getInfo()) == null || (avatar = info.getAvatar()) == null || (image = avatar.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }

    @org.c.a.d
    public static final String aZ(@org.c.a.e User user) {
        String aC = aC(user);
        String aD = aD(user);
        String str = aC;
        if (str.length() == 0) {
            if (aD.length() == 0) {
                return "";
            }
        }
        if (!(str.length() == 0)) {
            if (!(aD.length() == 0)) {
                String a2 = bj.a((int) R.string.info_link2, new Object[]{aC, aD});
                Intrinsics.checkExpressionValueIsNotNull(a2, "if (!company.isEmpty() &…  company\n        }\n    }");
                return a2;
            }
        }
        return str.length() == 0 ? aD : aC;
    }

    @org.c.a.d
    public static final String ba(@org.c.a.e User user) {
        String aE = aE(user);
        String str = aE;
        if (str == null || str.length() == 0) {
            String ao = ao(user);
            return ao != null ? ao : "";
        }
        String a2 = bj.a((int) R.string.info_link2, new Object[]{aE, ao(user)});
        Intrinsics.checkExpressionValueIsNotNull(a2, "getString(R.string.info_…this.getEduLevelString())");
        return a2;
    }

    @org.c.a.d
    public static final String bb(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        String aE = F(user) ? "" : aE(user);
        String ao = G(user) ? "" : ao(user);
        boolean z = true;
        if (!StringsKt.isBlank(aE)) {
            String str = ao;
            if (!(str == null || StringsKt.isBlank(str))) {
                aE = aE + " · ";
            }
        }
        String str2 = ao;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            z = false;
        }
        if (z) {
            return aE;
        }
        return aE + ao;
    }

    @org.c.a.e
    public static final String a(@org.c.a.e Info info) {
        UserMedia avatar;
        Image image;
        if (info == null || (avatar = info.getAvatar()) == null || (image = avatar.getImage()) == null) {
            return null;
        }
        return image.getUrl();
    }

    @org.c.a.e
    public static final String k(@org.c.a.e PostUserInfo postUserInfo) {
        Image avatar;
        if (postUserInfo == null || (avatar = postUserInfo.getAvatar()) == null) {
            return null;
        }
        return avatar.getUrl();
    }

    @org.c.a.d
    public static final ArrayList<UserMedia> bc(@org.c.a.e User user) {
        if (user != null) {
            List<UserMedia> medias = user.getMedias();
            List<UserMedia> list = medias;
            if (list == null || list.isEmpty()) {
                return new ArrayList<>();
            }
            if (medias != null) {
                return (ArrayList) medias;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.tantan.x.db.user.UserMedia>");
        }
        return new ArrayList<>();
    }

    public static final boolean bd(@org.c.a.e User user) {
        return bc(user).size() >= 3;
    }

    public static final boolean be(@org.c.a.e User user) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean bf(@org.c.a.e User user) {
        List<Relationship> relationships;
        boolean z;
        Object obj = null;
        if (user != null && (relationships = user.getRelationships()) != null) {
            Iterator<T> it = relationships.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer relationType = ((Relationship) next).getRelationType();
                if (relationType != null && relationType.intValue() == 17) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            obj = (Relationship) obj;
        }
        return obj != null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tantan/x/db/user/Relationship;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class g extends Lambda implements Function1<Relationship, Boolean> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Relationship) obj));
        }

        public final boolean a(@org.c.a.d Relationship relationship) {
            Intrinsics.checkParameterIsNotNull(relationship, "it");
            Integer relationType = relationship.getRelationType();
            return relationType != null && relationType.intValue() == 17;
        }
    }

    public static final void bg(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        n.a(aU(user), g.a);
        aU(user).add(new Relationship(17, System.currentTimeMillis(), new Date()));
    }

    @org.c.a.e
    public static final BackgroundImage bh(@org.c.a.e User user) {
        Info info;
        if (user == null || (info = user.getInfo()) == null) {
            return null;
        }
        return info.getBackgroundImage();
    }

    @org.c.a.d
    public static final List<String> bi(@org.c.a.e User user) {
        Info aL;
        List<String> markingTags;
        return (user == null || (aL = aL(user)) == null || (markingTags = aL.getMarkingTags()) == null) ? new ArrayList() : markingTags;
    }

    @org.c.a.e
    public static final String bj(@org.c.a.e User user) {
        Info info;
        Life life;
        String homeTown;
        String d2;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null || (homeTown = life.getHomeTown()) == null || (d2 = com.tantan.x.utils.a.d.d(homeTown)) == null) {
            return null;
        }
        return StringsKt.replace$default(d2, " ", "", false, 4, (Object) null);
    }

    @org.c.a.e
    public static final String bk(@org.c.a.e User user) {
        Info info;
        Life life;
        String residence;
        String d2;
        if (user == null || (info = user.getInfo()) == null || (life = info.getLife()) == null || (residence = life.getResidence()) == null || (d2 = com.tantan.x.utils.a.d.d(residence)) == null) {
            return null;
        }
        return StringsKt.replace$default(d2, " ", " · ", false, 4, (Object) null);
    }

    @org.c.a.e
    public static final String b(@org.c.a.e Info info) {
        Life life;
        String homeTown;
        String d2;
        if (info == null || (life = info.getLife()) == null || (homeTown = life.getHomeTown()) == null || (d2 = com.tantan.x.utils.a.d.d(homeTown)) == null) {
            return null;
        }
        return StringsKt.replace$default(d2, " ", " · ", false, 4, (Object) null);
    }

    @org.c.a.e
    public static final String bl(@org.c.a.e User user) {
        Info info;
        String name;
        if (user == null || (info = user.getInfo()) == null || (name = info.getName()) == null) {
            return null;
        }
        return name;
    }

    @org.c.a.e
    public static final Long b(@org.c.a.e User user, int i) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return null;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == i) {
                return Long.valueOf(relationship.getUpdatedTime());
            }
        }
        return null;
    }

    @org.c.a.e
    public static final Date c(@org.c.a.e User user, int i) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return null;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == i) {
                return relationship.getCreatedTime();
            }
        }
        return null;
    }

    public static final boolean bm(@org.c.a.e User user) {
        Account account;
        String wechat = (user == null || (account = user.getAccount()) == null) ? null : account.getWechat();
        return !(wechat == null || wechat.length() == 0);
    }

    public static final boolean bn(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info info = user.getInfo();
        if (info != null) {
            if (info.getAge() != null && info.getBirthDate() != null) {
                String gender = info.getGender();
                if (gender == null || gender.length() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean bo(@org.c.a.e User user) {
        Date createdTime;
        if (user == null || (createdTime = user.getCreatedTime()) == null) {
            return false;
        }
        return com.tantan.x.utils.f.a.a(createdTime.getTime(), 1);
    }

    public static final boolean bp(@org.c.a.e User user) {
        Date createdTime;
        return (user == null || (createdTime = user.getCreatedTime()) == null || com.tantan.x.utils.f.a.c(createdTime, ak.a()) > ((long) 72)) ? false : true;
    }

    public static final boolean a(@org.c.a.e User user, @org.c.a.d String str) {
        Intrinsics.checkParameterIsNotNull(str, "cityId");
        if (user != null) {
            return com.tantan.x.db.user.a.d.a(user.getInfo(), str);
        }
        return false;
    }

    public static final boolean b(@org.c.a.e User user, @org.c.a.d String str) {
        Intrinsics.checkParameterIsNotNull(str, "cityId");
        if (user != null) {
            return com.tantan.x.db.user.a.d.b(user.getInfo(), str);
        }
        return false;
    }

    public static final boolean bq(@org.c.a.e User user) {
        Info info;
        Integer age;
        int intValue;
        return (user == null || (info = user.getInfo()) == null || (age = info.getAge()) == null || 24 > (intValue = age.intValue()) || 38 < intValue) ? false : true;
    }

    public static final boolean br(@org.c.a.e User user) {
        List<String> n = com.tantan.x.common.config.repository.a.e.n();
        return (n == null || user == null || !CollectionsKt.contains(n, ap(user)) || bm(user) || !bq(user) || H(user) || J(user)) ? false : true;
    }

    @org.c.a.e
    public static final String a(@org.c.a.e Date date) {
        if (date != null) {
            try {
                return com.tantanapp.common.android.j.f.a(date, "yyyy/MM/dd");
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @org.c.a.d
    public static final PostUserInfo bs(@org.c.a.d User user) {
        String profileAccessKey;
        String position;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Long id = user.getId();
        if (id == null) {
            Intrinsics.throwNpe();
        }
        long longValue = id.longValue();
        String bl = bl(user);
        if (bl == null) {
            Intrinsics.throwNpe();
        }
        Info info = user.getInfo();
        if (info == null) {
            Intrinsics.throwNpe();
        }
        Integer age = info.getAge();
        if (age == null) {
            Intrinsics.throwNpe();
        }
        int intValue = age.intValue();
        Info info2 = user.getInfo();
        if (info2 == null) {
            Intrinsics.throwNpe();
        }
        String gender = info2.getGender();
        if (gender == null) {
            Intrinsics.throwNpe();
        }
        Image aV = aV(user);
        if (aV == null) {
            Intrinsics.throwNpe();
        }
        Info info3 = user.getInfo();
        if (info3 == null) {
            Intrinsics.throwNpe();
        }
        Life life = info3.getLife();
        if (life == null) {
            Intrinsics.throwNpe();
        }
        String residence = life.getResidence();
        if (residence == null) {
            Intrinsics.throwNpe();
        }
        Info info4 = user.getInfo();
        if (info4 == null) {
            Intrinsics.throwNpe();
        }
        Job job = info4.getJob();
        String str = (job == null || (position = job.getPosition()) == null) ? "" : position;
        String ipLocation = user.getIpLocation();
        String str2 = ipLocation != null ? ipLocation : "";
        Map<String, Membership> memberships = user.getMemberships();
        Info info5 = user.getInfo();
        return new PostUserInfo(longValue, bl, intValue, gender, aV, residence, str, str2, memberships, (info5 == null || (profileAccessKey = info5.getProfileAccessKey()) == null) ? "" : profileAccessKey, user.getPrivileges());
    }

    public static final boolean bt(@org.c.a.e User user) {
        Integer matchingStatus = user != null ? user.getMatchingStatus() : null;
        return matchingStatus != null && matchingStatus.intValue() == 0;
    }

    public static final boolean bu(@org.c.a.e User user) {
        Integer matchingStatus = user != null ? user.getMatchingStatus() : null;
        return matchingStatus != null && matchingStatus.intValue() == 1;
    }

    public static final boolean bv(@org.c.a.e User user) {
        List<Relationship> relationships;
        boolean z = false;
        if (user != null && (relationships = user.getRelationships()) != null) {
            for (Relationship relationship : relationships) {
                Integer relationType = relationship.getRelationType();
                if (relationType != null && relationType.intValue() == 1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final boolean bw(@org.c.a.e User user) {
        List<Relationship> relationships;
        boolean z = false;
        if (user != null && (relationships = user.getRelationships()) != null) {
            for (Relationship relationship : relationships) {
                Integer relationType = relationship.getRelationType();
                if (relationType != null && relationType.intValue() == 3) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final boolean bx(@org.c.a.e User user) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == 5) {
                return true;
            }
        }
        return false;
    }

    public static final boolean by(@org.c.a.e User user) {
        return (user == null || user.getRecTip() != 2 || y(l.h.e())) ? false : true;
    }

    @org.c.a.d
    public static final String bz(@org.c.a.e User user) {
        Info info;
        String name;
        return (user == null || (info = user.getInfo()) == null || (name = info.getName()) == null) ? "" : name;
    }

    public static final boolean bA(@org.c.a.e User user) {
        Date activeTime;
        return (K(user) || user == null || (activeTime = user.getActiveTime()) == null || com.tantan.x.utils.f.a.e(activeTime, com.tantan.x.network.d.a.a.c()) >= ((long) 10)) ? false : true;
    }

    public static final boolean bB(@org.c.a.e User user) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == 13) {
                return true;
            }
        }
        return false;
    }

    public static final boolean bC(@org.c.a.e User user) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == 21) {
                return true;
            }
        }
        return false;
    }

    public static final boolean bD(@org.c.a.e User user) {
        List<Relationship> relationships;
        if (user == null || (relationships = user.getRelationships()) == null) {
            return false;
        }
        for (Relationship relationship : relationships) {
            Integer relationType = relationship.getRelationType();
            if (relationType != null && relationType.intValue() == 22) {
                return true;
            }
        }
        return false;
    }

    public static final boolean bE(@org.c.a.e User user) {
        Info info;
        Audio voice;
        String url;
        if (user == null || (info = user.getInfo()) == null || (voice = info.getVoice()) == null || (url = voice.getUrl()) == null) {
            return true;
        }
        return StringsKt.isBlank(url);
    }

    public static final boolean bF(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List a2 = a(user, false, 1, null);
        return a2 == null || a2.isEmpty();
    }

    public static final boolean bG(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        return !bF(user);
    }

    public static final boolean bH(@org.c.a.e User user) {
        DatingCharacter datingCharacter;
        String conclusion;
        return (user == null || (datingCharacter = user.getDatingCharacter()) == null || (conclusion = datingCharacter.getConclusion()) == null || conclusion.length() <= 0) ? false : true;
    }

    public static final boolean bI(@org.c.a.e User user) {
        String status;
        if (user == null || (status = user.getStatus()) == null) {
            return false;
        }
        return Intrinsics.areEqual(status, com.tantan.x.db.user.d.e) || Intrinsics.areEqual(status, com.tantan.x.db.user.d.f);
    }

    @org.c.a.d
    public static /* synthetic */ List a(User user, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return a(user, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
        if (r0.contains(java.lang.Long.valueOf(r7.getId())) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x014c A[SYNTHETIC] */
    @org.c.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.tantan.x.db.user.Tag> a(@org.c.a.d com.tantan.x.db.user.User r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tantan.x.db.user.a.f.a(com.tantan.x.db.user.User, boolean):java.util.List");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tantan/x/db/user/Tag;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class a extends Lambda implements Function1<Tag, Boolean> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(1);
            this.a = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Tag) obj));
        }

        public final boolean a(@org.c.a.d Tag tag) {
            Intrinsics.checkParameterIsNotNull(tag, "it");
            List list = this.a;
            TagItem tagItem = tag.getTagItem();
            if (tagItem == null) {
                Intrinsics.throwNpe();
            }
            return list.contains(Long.valueOf(tagItem.getId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tantan/x/db/user/Tag;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class b extends Lambda implements Function1<Tag, Boolean> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(1);
            this.a = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Tag) obj));
        }

        public final boolean a(@org.c.a.d Tag tag) {
            Intrinsics.checkParameterIsNotNull(tag, "it");
            List list = this.a;
            TagItem tagItem = tag.getTagItem();
            if (tagItem == null) {
                Intrinsics.throwNpe();
            }
            return list.contains(Long.valueOf(tagItem.getId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tantan/x/db/user/Tag;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class c extends Lambda implements Function1<Tag, Boolean> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.a = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Tag) obj));
        }

        public final boolean a(@org.c.a.d Tag tag) {
            Intrinsics.checkParameterIsNotNull(tag, "it");
            List list = this.a;
            TagItem tagItem = tag.getTagItem();
            if (tagItem == null) {
                Intrinsics.throwNpe();
            }
            return list.contains(Long.valueOf(tagItem.getId()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tantan/x/db/user/Tag;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: E:\qianshou\qs\10051564_dexfile_LoadMethod.dex_repired.dex */
    static final class d extends Lambda implements Function1<Tag, Boolean> {
        final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(1);
            this.a = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Tag) obj));
        }

        public final boolean a(@org.c.a.d Tag tag) {
            Intrinsics.checkParameterIsNotNull(tag, "it");
            List list = this.a;
            TagItem tagItem = tag.getTagItem();
            if (tagItem == null) {
                Intrinsics.throwNpe();
            }
            return list.contains(Long.valueOf(tagItem.getId()));
        }
    }

    @org.c.a.d
    public static final List<Tag> bJ(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<Tag> tags = user.getTags();
        if (tags != null) {
            return b(tags);
        }
        return new ArrayList();
    }

    public static final int bK(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        return a(user, false, 1, null).size();
    }

    public static final int bL(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        return bJ(user).size();
    }

    @org.c.a.d
    public static final List<Tag> a(@org.c.a.d User user, long j) {
        TagCategory tagCategory;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        if (j <= 0) {
            return a(user, false, 1, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : a(user, false, 1, null)) {
            TagItem tagItem = ((Tag) obj).getTagItem();
            Long valueOf = (tagItem == null || (tagCategory = tagItem.getTagCategory()) == null) ? null : Long.valueOf(tagCategory.getId());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        List<Tag> list = (List) linkedHashMap.get(Long.valueOf(j));
        return list != null ? list : new ArrayList();
    }

    @org.c.a.e
    public static final Tag b(@org.c.a.d User user, long j) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Object obj = null;
        Iterator it = a(user, false, 1, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TagItem tagItem = ((Tag) next).getTagItem();
            if (tagItem == null || tagItem.getId() != j) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (Tag) obj;
    }

    @org.c.a.d
    public static final List<Tag> a(@org.c.a.d List<Tag> list) {
        Intrinsics.checkParameterIsNotNull(list, "receiver$0");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Tag) obj).isTop()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList(arrayList);
    }

    @org.c.a.d
    public static final List<Tag> b(@org.c.a.d List<Tag> list) {
        Intrinsics.checkParameterIsNotNull(list, "receiver$0");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Tag) obj).isTop()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList(arrayList);
    }

    @org.c.a.d
    public static final List<Tag> bM(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        return a(a(user, false, 1, null));
    }

    public static final boolean c(@org.c.a.d User user, long j) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        for (Tag tag : a(user, false, 1, null)) {
            TagItem tagItem = tag.getTagItem();
            if (tagItem != null && tagItem.getId() == j) {
                return true;
            }
        }
        return false;
    }

    @org.c.a.d
    public static final List<UserMedia> bO(@org.c.a.d User user) {
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        List<UserMedia> medias = user.getMedias();
        if (medias != null) {
            return medias;
        }
        user.setMedias(new ArrayList());
        List<UserMedia> medias2 = user.getMedias();
        if (medias2 == null) {
            Intrinsics.throwNpe();
        }
        return medias2;
    }

    @org.c.a.d
    public static final String a(int i) {
        if (i == 1) {
            String a2 = bj.a((int) R.string.love_purpose_marry_soon);
            Intrinsics.checkExpressionValueIsNotNull(a2, "getString(R.string.love_purpose_marry_soon)");
            return a2;
        } else if (i == 2) {
            String a3 = bj.a((int) R.string.love_purpose_marry_suitable);
            Intrinsics.checkExpressionValueIsNotNull(a3, "getString(R.string.love_purpose_marry_suitable)");
            return a3;
        } else if (i == 3) {
            String a4 = bj.a((int) R.string.love_purpose_only_love);
            Intrinsics.checkExpressionValueIsNotNull(a4, "getString(R.string.love_purpose_only_love)");
            return a4;
        } else if (i != 4) {
            return "";
        } else {
            String a5 = bj.a((int) R.string.love_purpose_never_consider);
            Intrinsics.checkExpressionValueIsNotNull(a5, "getString(R.string.love_purpose_never_consider)");
            return a5;
        }
    }

    @org.c.a.d
    public static final String bP(@org.c.a.d User user) {
        User e2;
        Info info;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Info info2 = user.getInfo();
        int lovePurpose = info2 != null ? info2.getLovePurpose() : 0;
        String a2 = a(lovePurpose);
        Info info3 = user.getInfo();
        int lovePurposeShowRange = info3 != null ? info3.getLovePurposeShowRange() : 2;
        return StringsKt.isBlank(a2) ? "" : aA(user) ? a2 : (lovePurposeShowRange == 0 || (lovePurposeShowRange == 1 && (e2 = l.h.e()) != null && (info = e2.getInfo()) != null && lovePurpose == info.getLovePurpose())) ? a2 : "";
    }

    public static final boolean bQ(@org.c.a.e User user) {
        Info info;
        HoldHandsInfo holdHandsInfo;
        if (user == null || (info = user.getInfo()) == null || (holdHandsInfo = info.getHoldHandsInfo()) == null) {
            return false;
        }
        return holdHandsInfo.isAccepted();
    }

    public static final boolean d(@org.c.a.e User user, long j) {
        Info aL;
        HoldHandsInfo holdHandsInfo;
        if (bQ(l.h.e())) {
            User e2 = l.h.e();
            Long otherUserId = (e2 == null || (aL = aL(e2)) == null || (holdHandsInfo = aL.getHoldHandsInfo()) == null) ? null : holdHandsInfo.getOtherUserId();
            if (otherUserId != null && otherUserId.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public static final boolean bR(@org.c.a.e User user) {
        Punishment punishments;
        List<PopUp> popUps;
        PopUp popUp = (user == null || (punishments = user.getPunishments()) == null || (popUps = punishments.getPopUps()) == null) ? null : (PopUp) CollectionsKt.firstOrNull(popUps);
        return Intrinsics.areEqual(popUp != null ? popUp.getPunishType() : null, com.tantan.x.db.user.d.ah) && popUp.getFixExpireTime().getTime() > ak.a().getTime();
    }

    public static final boolean bS(@org.c.a.e User user) {
        Punishment punishments;
        List<PopUp> popUps;
        PopUp popUp = (user == null || (punishments = user.getPunishments()) == null || (popUps = punishments.getPopUps()) == null) ? null : (PopUp) CollectionsKt.firstOrNull(popUps);
        return Intrinsics.areEqual(popUp != null ? popUp.getPunishType() : null, com.tantan.x.db.user.d.ag) && popUp.getFixExpireTime().getTime() > ak.a().getTime();
    }

    public static final boolean bT(@org.c.a.e User user) {
        Punishment punishments;
        List<PopUp> popUps;
        PopUp popUp = (user == null || (punishments = user.getPunishments()) == null || (popUps = punishments.getPopUps()) == null) ? null : (PopUp) CollectionsKt.firstOrNull(popUps);
        return Intrinsics.areEqual(popUp != null ? popUp.getPunishType() : null, com.tantan.x.db.user.d.ai) && popUp.getFixExpireTime().getTime() > ak.a().getTime();
    }

    @org.c.a.d
    public static final User bN(@org.c.a.d User user) {
        String str;
        Intrinsics.checkParameterIsNotNull(user, "receiver$0");
        Object obj = null;
        try {
            str = com.tantan.b.a.a().b(user);
        } catch (Exception unused) {
            str = null;
        }
        try {
            obj = com.tantan.b.a.a().a(str, User.class);
        } catch (Exception unused2) {
        }
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        return (User) obj;
    }
}