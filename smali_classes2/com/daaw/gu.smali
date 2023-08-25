.class public final Lcom/daaw/gu;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/gu;

.field public static final b:Lcom/daaw/pl;

.field public static final c:Lcom/daaw/pl;

.field public static final d:Lcom/daaw/pl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gu;

    invoke-direct {v0}, Lcom/daaw/gu;-><init>()V

    sput-object v0, Lcom/daaw/gu;->a:Lcom/daaw/gu;

    sget-object v0, Lcom/daaw/tr;->w:Lcom/daaw/tr;

    sput-object v0, Lcom/daaw/gu;->b:Lcom/daaw/pl;

    sget-object v0, Lcom/daaw/hp1;->q:Lcom/daaw/hp1;

    sput-object v0, Lcom/daaw/gu;->c:Lcom/daaw/pl;

    sget-object v0, Lcom/daaw/ir;->r:Lcom/daaw/ir;

    sput-object v0, Lcom/daaw/gu;->d:Lcom/daaw/pl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lcom/daaw/pl;
    .locals 1

    sget-object v0, Lcom/daaw/gu;->d:Lcom/daaw/pl;

    return-object v0
.end method

.method public static final b()Lcom/daaw/rm0;
    .locals 1

    sget-object v0, Lcom/daaw/tm0;->c:Lcom/daaw/rm0;

    return-object v0
.end method
