.class public final Lcom/daaw/f53;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final i:Lcom/daaw/f53;

.field public static final j:Lcom/daaw/th8;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/jv2;

.field public final c:Lcom/daaw/ny2;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:Lcom/daaw/ht2;

.field public final e:Lcom/daaw/gc3;

.field public final f:Lcom/daaw/wi2;

.field public final g:Lcom/daaw/fl2;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final h:Lcom/daaw/y13;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ee2;

    invoke-direct {v0}, Lcom/daaw/ee2;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ee2;->c()Lcom/daaw/f53;

    move-result-object v0

    sput-object v0, Lcom/daaw/f53;->i:Lcom/daaw/f53;

    sget-object v0, Lcom/daaw/sb2;->a:Lcom/daaw/sb2;

    sput-object v0, Lcom/daaw/f53;->j:Lcom/daaw/th8;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/fl2;Lcom/daaw/ny2;Lcom/daaw/ht2;Lcom/daaw/gc3;Lcom/daaw/y13;Lcom/daaw/d43;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f53;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    iput-object p3, p0, Lcom/daaw/f53;->c:Lcom/daaw/ny2;

    iput-object p4, p0, Lcom/daaw/f53;->d:Lcom/daaw/ht2;

    iput-object p5, p0, Lcom/daaw/f53;->e:Lcom/daaw/gc3;

    iput-object p2, p0, Lcom/daaw/f53;->f:Lcom/daaw/wi2;

    iput-object p2, p0, Lcom/daaw/f53;->g:Lcom/daaw/fl2;

    iput-object p6, p0, Lcom/daaw/f53;->h:Lcom/daaw/y13;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/f53;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/daaw/f53;

    iget-object v1, p0, Lcom/daaw/f53;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/f53;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/f53;->f:Lcom/daaw/wi2;

    iget-object v3, p1, Lcom/daaw/f53;->f:Lcom/daaw/wi2;

    invoke-virtual {v1, v3}, Lcom/daaw/wi2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    iget-object v3, p1, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    invoke-static {v1, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/f53;->d:Lcom/daaw/ht2;

    iget-object v3, p1, Lcom/daaw/f53;->d:Lcom/daaw/ht2;

    invoke-static {v1, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/f53;->e:Lcom/daaw/gc3;

    iget-object v3, p1, Lcom/daaw/f53;->e:Lcom/daaw/gc3;

    invoke-static {v1, v3}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/f53;->h:Lcom/daaw/y13;

    iget-object p1, p1, Lcom/daaw/f53;->h:Lcom/daaw/y13;

    invoke-static {v1, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/f53;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/f53;->b:Lcom/daaw/jv2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/jv2;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/f53;->d:Lcom/daaw/ht2;

    invoke-virtual {v1}, Lcom/daaw/ht2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/f53;->f:Lcom/daaw/wi2;

    invoke-virtual {v1}, Lcom/daaw/wi2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/daaw/f53;->e:Lcom/daaw/gc3;

    invoke-virtual {v1}, Lcom/daaw/gc3;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
