.class public Lcom/daaw/wi2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final f:Lcom/daaw/wi2;

.field public static final g:Lcom/daaw/th8;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/ng2;

    invoke-direct {v0}, Lcom/daaw/ng2;-><init>()V

    new-instance v1, Lcom/daaw/fl2;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/daaw/fl2;-><init>(Lcom/daaw/ng2;Lcom/daaw/bk2;)V

    sput-object v1, Lcom/daaw/wi2;->f:Lcom/daaw/wi2;

    sget-object v0, Lcom/daaw/if2;->a:Lcom/daaw/if2;

    sput-object v0, Lcom/daaw/wi2;->g:Lcom/daaw/th8;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/ng2;Lcom/daaw/sh2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/wi2;->a:J

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lcom/daaw/wi2;->b:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/wi2;->c:Z

    iput-boolean p1, p0, Lcom/daaw/wi2;->d:Z

    iput-boolean p1, p0, Lcom/daaw/wi2;->e:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/wi2;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/daaw/wi2;

    iget-wide v1, p1, Lcom/daaw/wi2;->a:J

    return v0
.end method

.method public final hashCode()I
    .locals 2

    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    long-to-int v1, v0

    mul-int/lit16 v1, v1, 0x745f

    return v1
.end method
