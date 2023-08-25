.class public final Lcom/daaw/kq7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lcom/daaw/vr7;


# direct methods
.method public constructor <init>(Lcom/daaw/vr7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/kq7;->d:Lcom/daaw/vr7;

    return-void
.end method
