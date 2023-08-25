.class public abstract Lcom/daaw/qr6;
.super Lcom/daaw/rr6;
.source ""


# instance fields
.field public final c:Ljava/util/HashSet;

.field public final d:Lorg/json/JSONObject;

.field public final e:J


# direct methods
.method public constructor <init>(Lcom/daaw/jr6;Ljava/util/HashSet;Lorg/json/JSONObject;J[B)V
    .locals 0

    const/4 p6, 0x0

    invoke-direct {p0, p1, p6}, Lcom/daaw/rr6;-><init>(Lcom/daaw/jr6;[B)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/daaw/qr6;->c:Ljava/util/HashSet;

    iput-object p3, p0, Lcom/daaw/qr6;->d:Lorg/json/JSONObject;

    iput-wide p4, p0, Lcom/daaw/qr6;->e:J

    return-void
.end method
