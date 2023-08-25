.class public final Lcom/daaw/e58;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lcom/daaw/l88;


# direct methods
.method public constructor <init>(Lcom/daaw/l88;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/e58;->d:Lcom/daaw/l88;

    return-void
.end method
