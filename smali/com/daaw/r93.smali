.class public abstract Lcom/daaw/r93;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/r93;

.field public static final b:Lcom/daaw/r93;

.field public static final c:Lcom/daaw/r93;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/o93;

    invoke-direct {v0}, Lcom/daaw/o93;-><init>()V

    sput-object v0, Lcom/daaw/r93;->a:Lcom/daaw/r93;

    new-instance v0, Lcom/daaw/p93;

    invoke-direct {v0}, Lcom/daaw/p93;-><init>()V

    sput-object v0, Lcom/daaw/r93;->b:Lcom/daaw/r93;

    new-instance v0, Lcom/daaw/q93;

    invoke-direct {v0}, Lcom/daaw/q93;-><init>()V

    sput-object v0, Lcom/daaw/r93;->c:Lcom/daaw/r93;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
